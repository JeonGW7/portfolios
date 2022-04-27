package ch13_event;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
//이벤트 처리하려면
//1. 클래스 또는 인터페이스를 상속 받는다
//2. 이벤트 등록을 한다 
//3. 해당메서드 오버라이딩 한다 
public class Test01_event extends Frame implements ActionListener {
	//변수
	TextField tf1,tf2;
	TextArea ta;
	//생성자
	public Test01_event(){
		super("event처리"); //첫줄에
		tf1 = new TextField();
		tf2 = new TextField();
		ta = new TextArea();
		ta.setBackground(Color.cyan);
		tf1.setFont(new Font("궁서체",Font.BOLD,17));
		tf2.setFont(new Font("궁서체",Font.BOLD,17));
		ta.setFont(new Font("궁서체",Font.BOLD,17));
		//Frame컨테이너에 컴포넌트 붙이기
		add("North",tf1);
		add("Center",ta);
		add("South",tf2);
		addWindowListener(new MyWin());//이벤트등록
		tf1.addActionListener(this);//이벤트 등록, 인터페이스 상속받을땐 this
		tf2.addActionListener(this);//이벤트 등록
		
		setSize(450, 450);
		setVisible(true);
	}//cons-end
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end
	//메서드 - 오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg = "A >> "+tf1.getText();
			ta.append(msg+"\n");
			tf1.setText(""); //내용지우기
			tf2.requestFocus(); //포커스설정 
		}else if(e.getSource()==tf2){
			String msg = "B >> "+tf2.getText();
			ta.append(msg+"\n");
			tf2.setText(""); //내용지우기
			tf1.requestFocus(); // 서로 왔다 갔다하게 설정 
		}
	}//actionPerformed-end
	public static void main(String[] args) {
		new Test01_event();
	}//main-end
}//class-end
