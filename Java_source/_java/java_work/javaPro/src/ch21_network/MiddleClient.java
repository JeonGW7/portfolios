package ch21_network;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;
//클라이언트 
@SuppressWarnings({ "serial", "unused" })
public class MiddleClient extends JFrame implements ActionListener,Runnable{
	
	//변수
	JButton b1,b2,b3;
	JTextField tf; //대화내용 입력란
	JTextArea ta; //대화내용 출력 용도 
	String name; //대화명 넣을 변수
	private DataInputStream in;
	private DataOutputStream out;
	private Thread thread;
	//클래스: 첫글자 대문자
	//메서드 : 첫글자 소문자
	//변수 : 첫글자 소문자 
	JScrollPane jScrollPane; //내용이 많으면 스크롤바 넣기 위함
	JScrollBar jScrollBar; 
	//생성자
	public MiddleClient(String ip,int port) {
		try{
			@SuppressWarnings("resource")
			Socket sock = new Socket(ip,port);//소켓생성
			in = new DataInputStream(sock.getInputStream());//소켓으로 연결
			out = new DataOutputStream(sock.getOutputStream()); //인코딩처리된다
			
		}catch(Exception ex){
			System.out.println("서버 접속 실패"+ex);
			System.exit(0);
		}
		//디자인(레이아웃)
		ImageIcon icon1 = new ImageIcon("C:\\_util\\Imgs\\a1.gif");
		b1 = new JButton("종료",icon1);//버튼생성
		b1.addActionListener(this);//이벤트 등록
		
		ImageIcon icon2 = new ImageIcon("C:\\_util\\Imgs\\b1.gif");
		b2 = new JButton("리스트",icon2);//버튼생성
		b2.addActionListener(this);//이벤트 등록
		
		ImageIcon icon3 = new ImageIcon("C:\\_util\\Imgs\\c1.gif");
		b3 = new JButton("색상지정",icon3);//버튼생성
		b3.addActionListener(this);//이벤트 등록
		
		tf = new JTextField(); 
		tf.addActionListener(this);//이벤트 등록
		
		ta = new JTextArea(); 
		ta.setEditable(false);//편집못하게 설정
		ta.setLineWrap(true);//내용이 많으면 자동개행 
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,1));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		jScrollPane = new JScrollPane(ta);
		jScrollBar = jScrollPane.getVerticalScrollBar();//
		jScrollBar.setValue(jScrollBar.getMaximum());
		
		getContentPane().add(p,"East");//JFrame에 컴포넌트 붙이기 
		getContentPane().add(jScrollPane,"Center"); //text Area 붙어있음
		getContentPane().add(tf,"South"); //대화입력칸 
	
		setSize(400,400);
		setVisible(true);
		tf.requestFocus(); //포커스 설정
		
		//대화명 받기
		name = JOptionPane.showInputDialog(this,"대화명을 입력하세요");
				
		//스레드 생성
		thread = new Thread(this);//Runnable 인터페이스를 상속 받았기 때문에 this 
		thread.start();//준비단계, run()호출
		//프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	//메서드:오버라이딩
	//actionPerformed()서버로 요청을 보낼 때 사용
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf){
			//대화내용을 서버로 보내는 작업 
			try{
				String msg = tf.getText().trim(); //trim():공백 제거
				if(msg.length()<1){//입력을 안하고 엔터를 쳤을 경우
					JOptionPane.showMessageDialog(this, "대화내용을 입력하세요");
					tf.requestFocus(); //포커스 설정
					return; //피드백, 아래 내용을 실행 못하게 한다 
				}//if-end
				
				//대화 내용을 정상적으로 입력했을 때, 서버로 보낸다
				out.writeUTF("["+name+"]님의 말>>"+msg);
				tf.setText("");//내용 지우기 
				
			}catch(Exception ex){
				System.out.println("서버로 데이터를 보내던 중 예외 발생:"+ex);
				ta.append("서버로 데이터를 보내던 중 예외 발생:"+ex);
				ta.append("10초후에 종료 합니다");
				try{
					Thread.sleep(10000);
				}catch(Exception ex2){}
				System.exit(0);//프로그램 종료 
			}//catch-end
		}else if(e.getSource()==b1){//종료
			int an = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?","종료",JOptionPane.YES_NO_OPTION);
			switch(an){
			case JOptionPane.YES_OPTION:
				System.exit(0);
				break;
			case JOptionPane.NO_OPTION:
				break;
			}//switch-end
		}else if(e.getSource()==b2){//대화명 리스트
			ta.setText("");
			ta.append(name);
		}else if(e.getSource()==b3){//글 색상 
			ta.setFont(new Font("궁서체",Font.BOLD,20));
			ta.setForeground(Color.blue); //글꼴색 변경 
			
			tf.setFont(new Font("궁서체",Font.BOLD,20));
			tf.setForeground(Color.blue);
			tf.setBackground(Color.yellow);//배경색 변경 
		}
	}//actionPerformed-end
	//run()서버가 보내준 내용을 클라이언트 화면에 반영할 때 사용 
	public void run() {
		try{
			while(true){
				String str = in.readUTF();//서버가 보내준 내용 받는다 
				ta.append(str+"\n");
				jScrollBar.setValue(jScrollBar.getMaximum());
			}//while-end
		}catch(Exception ex){
			ta.append("서버로 부터 데이터를 받던 중 예외 발생:"+ex);
			ta.append("10초후에 종료합니다");
			try{
				Thread.sleep(10000);
			}catch(Exception ex2){}
			System.exit(0);//프로그램 종료 
		}//catch-end
	}//run-end
	
	public static void main(String[] args) {
//		new MiddleClient(args[0],5555);
		new MiddleClient("192.168.0.34",5555);
		//                 IP    port
	}
}//class-end
