package ch22_network;
//#############################
// 프로토콜 : 통신규약
// 100 : 대기실 입장
// 200 : 방만들기
// 210 : 방들어가기 
// 400 : 방에서 대화하기
// 420 : 대화명 변경 
// 450 : 귓속말
// 290 : 방 퇴장 
// 900 : 종료 
//#############################
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*; //DefaultTableModel 

import java.util.*; //Vector : thread 기능이 있기 때문 
import java.io.*;
import java.net.*;

@SuppressWarnings("serial")
public class MainClient extends JFrame implements Runnable,ActionListener,MouseListener {
	//변수
	Socket sock;
	BufferedReader in; //읽어오기 위함
	OutputStream out; //ByteStream \r\n 
	
	String name; //대화명
	String ip; 
	String title = "대기실";
	
	Object data1[][] = new String[0][2];//0행2열 
	String cols1[] = {"방제목","인원"};
	DefaultTableModel model1 = new DefaultTableModel(data1,cols1);
	JTable table1 = new JTable(model1);
	
	Object data2[][] = new String[0][1];//0행1열
	String cols2[] = {"대화명"};
	DefaultTableModel model2 = new DefaultTableModel(data2,cols2);
	JTable table2 = new JTable(model2);
	
	String data3[][] = new String[0][2];//0행2열
	String cols3[] = {"대화명","위치"};
	DefaultTableModel model3 = new DefaultTableModel(data3,cols3);
	JTable table3 = new JTable(model3);
	
	JScrollPane jScrollPane1 = new JScrollPane(table1);
	JScrollPane jScrollPane2 = new JScrollPane(table2);
	JScrollPane jScrollPane3 = new JScrollPane(table3);
	
	JButton createB = new JButton("방만들기");
	JButton roominB = new JButton("방들어가기");
	JButton exitB = new JButton("종료");
	
	RoomClient roomClient = new RoomClient(); //객체생성  
	
	//생성자
	public MainClient(String ip){
		setTitle("메인창");
		this.ip = ip;
		
		table1.getTableHeader().setReorderingAllowed(false);//열 순서 변경 못하게 해줌
		table2.getTableHeader().setReorderingAllowed(false);//열 순서 변경 못하게 해줌
		table3.getTableHeader().setReorderingAllowed(false);//열 순서 변경 못하게 해줌
		
		table1.getTableHeader().setBackground(new Color(147,247,247));
		table2.getTableHeader().setBackground(new Color(147,247,247));
		table3.getTableHeader().setBackground(new Color(147,247,247));
		
		createB.setBackground(new Color(147,247,247));
		roominB.setBackground(new Color(147,247,247));
		exitB.setBackground(new Color(147,247,247));
		
		//디자인 Layout : 프로그래머가 직접한다 
		getContentPane().setLayout(null);
		
		getContentPane().add(jScrollPane1).setBounds(10, 10, 400, 250);
		getContentPane().add(jScrollPane2).setBounds(415, 10, 168, 250);
		getContentPane().add(jScrollPane3).setBounds(10, 270, 400, 197);
		
		getContentPane().add(createB).setBounds(449, 300, 100, 30);
		getContentPane().add(roominB).setBounds(449, 340, 100, 30);
		getContentPane().add(exitB).setBounds(449, 380, 100, 30);
		
		
		name = JOptionPane.showInputDialog("대화명을 입력 하세요");
		if(name==null || name.length()<1){
			JOptionPane.showMessageDialog(this, "대화명을 입력 하세요");
			return;
		}
		setSize(600, 515);
		setVisible(true);
		//이벤트 처리
		eventUP();
		connectServer();//서버 접속 메서드 호출
				
	}//cons-end
	//사용자 정의 메서드
	public void eventUP(){
		createB.addActionListener(this);
		roominB.addActionListener(this);
		exitB.addActionListener(this);
		
		table1.addMouseListener(this);
		
		roomClient.tf.addActionListener(this);
		roomClient.nickB.addActionListener(this);
		roomClient.sayB.addActionListener(this);
		roomClient.outB.addActionListener(this);
	}//eventUP-end
	//서버 접속 사용자 정의 메서드
	public void connectServer(){
		try{
			sock = new Socket(ip,5555);//서버ip, 서버포트 5555 (서버 접속)
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = sock.getOutputStream(); 
			
			out.write((name+"\r\n").getBytes()); //대화명 보냄, getBytes - 인코딩 처리 메서드 ,writeUTF처럼 
			new Thread(this).start(); //대기상태, run호출 
		}catch(Exception ex){
			System.out.println("서버 연결 실패: "+ex);
		}
	}//connectServer-end
	//사용자 정의 메서드 
	public void closeServer(){
		try{
			roomClient.setVisible(false); //창을 안보이게 
			roomClient.dispose(); //리소스 반환 
			out.write(("900|\r\n").getBytes());
			sock.close();
			in.close();
			out.close();
		}catch(Exception ex){}
	}//closeServer-end
	
	//오버라이딩
	public void mousePressed(MouseEvent me) {
		model2.setRowCount(0); //테이블내용 모두 지우기
		int r = table1.getSelectedRow(); //행선택
		String imTitle = (String)model1.getValueAt(r, 0); //방제목
		for(int i=0;i<model3.getRowCount();i++){
			String roomt = (String)model1.getValueAt(i, 1);//방제목 얻어서 위에서 얻은 방제목가 비교하기 위함
			if(imTitle.equals(roomt)){
				Object ob[] = {model3.getValueAt(i, 0)};//대화명을 꺼내서 
				model2.addRow(ob);                      //대화명을 model2에 뿌린다 
			}//if-end
		}//for-end
	}//mousePressed-end
	public void mouseReleased(MouseEvent me) {}
	public void mouseClicked(MouseEvent me) {}
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	//actionPerformed() : 서버로 요청
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob==createB){ //방만들기와 같은가 비교
			title = JOptionPane.showInputDialog(this,"방제목 입력하세요");
			if(title==null || title.length()<1){
				JOptionPane.showMessageDialog(this, "방제목을 입력해주세요");
				return; //더이상 아래로 진행못하게
			}
			//정상처리
			try{
				out.write(("200|"+title+"\r\n").getBytes()); //인코딩처리까지 해서 서버로 전송
			}catch(Exception ex2){}
		}else if(ob==roominB){ //방들어가기
			int row = table1.getSelectedRow();
			if(row<0){
				JOptionPane.showMessageDialog(this, "방을 먼저 선택하세요");
				return;
			}//if-end
			//정상처리
			title=(model1.getValueAt(row, 0).toString());//객체타입이기때문에 toString, 방제목얻기
			try{
				out.write(("210|"+title+"\r\n").getBytes());//서버로 요청보냄 
				
			}catch(Exception ex2){}
		}else if(ob==roomClient.tf){ //방에서 대화하기
			String msg = roomClient.tf.getText().trim();//대화내용
			if(msg.length()<0){
				return;
			}
			//정상처리
			try{
				out.write(("400|"+msg+"\r\n").getBytes()); //서버로 요청
			}catch(Exception ex3){}
			roomClient.tf.setText("");//대화내용 지우기
		}else if(ob==roomClient.outB){ //대화방에서 나가기
			try{
				out.write(("290|\r\n").getBytes()); //서버로 전송
			}catch(Exception ex2){}
			title = "대기실";
			
		}else if(ob==roomClient.nickB){ //대화명 변경, 구현은 X
			
		}else if(ob==roomClient.sayB){ //귓속말 구현은 X
			
		}else if(ob==exitB){ //종료 
			closeServer();//메서드 호출
			System.exit(0);//프로그램 종료
		}//if-end
	}//actionPerformed-end
	int protocol = 0;
	//run() : 서버가 보내준 정보를 클라이언트 화면에 반영
	public void run() {
		while(true){
			try{
				String msg = in.readLine(); //서버가 보내준 내용 받는다 
				if(msg==null){return;}
				
				StringTokenizer st = new StringTokenizer(msg,"|");
				
				protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol){  //지역변수 충돌안하게 {}로 감싸줌 
				case 100:{ //대기실 입장
					String ob[] = {st.nextToken(),st.nextToken()};
					//                대화명                      위치
					model3.addRow(ob);
					break;
				}//100-end
				case 200:{ //방만들기
					String ob[] = {st.nextToken(),st.nextToken()};
					//방만들기                   방제목                      인원
					model1.addRow(ob);
					break;
				}//200-end
				case 210:{ //방들어가기
					String n = st.nextToken(); //대화명 - 서버가 보내준 
					String t = st.nextToken(); //방제목 - 서버가 보내준
					//model3에서 대기실에서 방제목으로 변경
					for(int i=0;i<model3.getRowCount();i++){
						String imN = (String)model3.getValueAt(i, 0); //대화명 얻기
						if(imN.equals(n)){ //대화명 일치하면
							model3.setValueAt(t, i, 1); //대기실을 방제목으로 변경
							break; //for탈출 
						}//if-end
					}//for-end
					//model1 같은방, 인원수 증가
					for(int i=0;i<model1.getRowCount();i++){
						String imTitle = (String)model1.getValueAt(i, 0); //방제목
						if(imTitle.equals(t)){//방이 일치하면 인원 증가
							int inwon = Integer.parseInt(model1.getValueAt(i, 1)+"");
							model1.setValueAt(++inwon, i, 1);
							break; //for탈출
						}
					}//for-end
					//내가 방에 들어 갈때
					if(n.equals(name)){
						roomInProcess();//메서드 호출
					}else if(t.equals(title)){ //다른사람이 방에 들어올때
						Object ob[] = {n};
						roomClient.model1.addRow(ob);//새로운사람 추가
						roomClient.inwon.setText(roomClient.model1.getRowCount()+"");//인원수 정리
						roomClient.ta.append("***["+n+"]님이 입장 하였습니다***\n");
					}//else-if-end
					break;
				}//210-end
				case 400:{
					roomClient.ta.append(""+st.nextToken()+"\r\n");
					break;
				}//400-end
				case 290:{//방퇴장
					String n = st.nextToken(); //서버가 보내준 대화명
					String t = st.nextToken(); //서버가 보내준 대화방 
					//model1 인원정리 
					for(int i=0;i<model1.getRowCount();i++){
						String imTitle = (String)model1.getValueAt(i,0);//방제목
						if(t.equals(imTitle)){ //방제목을 찾아서 
							//인원정리
							int inwon = Integer.parseInt(model1.getValueAt(i, 1)+"");
							if(inwon==1){
								model1.removeRow(i);
							}else{//다른사람이 있을때 인원정리만 한다
								model1.setValueAt(--inwon, i, 1);
							}
							break; //for탈출
						}//if-end
					}//for-end
					
					//model3 위치 갱신 (방이름을 대기실로 변환)
					for(int i=0;i<model1.getRowCount();i++){
						String imName = (String)model3.getValueAt(i, 0);//대화명을 얻어서 
						if(n.equals(imName)){
							model3.setValueAt("대기실", i, 1);//대기실로 변경
							break; //for탈출 
						}//if-end
					}//for-end
					//내가 나갈때 
					if(n.equals(name)){
						roomOutProcess(); //방탈출 메서드 호출
					}else if(t.equals(title)){ //다른 사람이 나갈때
						for(int i=0;i<roomClient.model1.getRowCount();i++){
							String imName = (String)roomClient.model1.getValueAt(i, 0);//대화명꺼냄
							if(imName.equals(n)){//대화명 일치하면, 지금나간사람 삭제
								roomClient.model1.removeRow(i);
								break; //for탈출 
							}
						}//for-end
						//인원정리
						roomClient.inwon.setText(roomClient.model1.getRowCount()+"");//인원수 정리 
						roomClient.ta.append("***["+n+"]님 퇴장하였습니다***\n");
					}//if-end
					break;
				}//290-end
				case 900:{
					
					break;
				}//900-end
				}//switch-end
			}catch(Exception ex1){
				System.out.println("run 서버연결 실패:"+ex1);
				return; //예외 발생해도 다시 돌아가게 
			}//catch-end
		}//while-end
	}//run-end
	
	//사용자 정의 메서드 - 방 들어오기(내가 대화방에 들어가기) 
	public void roomInProcess(){
		roomClient.setVisible(true); //대화방을 보이게 한다 
		roomClient.ta.append("***["+title+"]방에 입장 하셨습니다\n");
		
		for(int i=0;i<model3.getRowCount();i++){
			String imTitle = (String)model3.getValueAt(i,1);//방위치를 얻는다
			if(imTitle.equals(title)){
				Object ob[] = {model3.getValueAt(i,0)}; //대화명을 꺼낸다 
				roomClient.model1.addRow(ob);//대화방에 대화명 출력
			}//if-end
		}//for-end
		roomClient.inwon.setText(roomClient.model1.getRowCount()+""); //대화방 인원정리
		roominB.setEnabled(false);//방들어간후 방들어가기 버튼 비활성화
		createB.setEnabled(false);//방만들기도 비활성화
	}//roomin-end
	//사용자 정의 메서드 - 내가 대화방에서 나갈때 
	public void roomOutProcess(){
		roomClient.ta.setText("");//대화내용 지우기
		roomClient.model1.setRowCount(0);//테이블 내용 모두 지우기 
		int a = roomClient.model1.getRowCount();
		roomClient.inwon.setText(a+"");//인원수 다시 세팅
		roomClient.setVisible(false);//대화창 안보이게 한다
		createB.setEnabled(true);//방만들기 버튼 활성화
		roominB.setEnabled(true);//방들어가기 활성화 
		
	}//roomOut-end
	//main
	public static void main(String[] args) {
		new MainClient("192.168.0.34");
	}//main-end
	
}//class-end
