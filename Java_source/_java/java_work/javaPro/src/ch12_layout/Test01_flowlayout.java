package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test01_flowlayout extends Frame {
	//변수
	Button b1,b2,b3,b4,b5;
	//생성자: 객체(필드)초기화가 목적이다 
	public Test01_flowlayout(){
		super("Layout 예제");
		b1 = new Button("첫번째버튼");
		b2 = new Button("두번째버튼");
		b3 = new Button("세번째버튼");
		b4 = new Button("네번째버튼");
		b5 = new Button("다섯번째버튼");
		//FlowLayout설정
		setLayout(new FlowLayout());
		this.add(b1); //this 생략가능
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		//컨테이너(frame)에 컴퍼넌트(버튼) 붙이기 
		addWindowListener(new MyWin());
		setSize(450,450);
		setVisible(true);
	}
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end

	public static void main(String[] args) {
		new Test01_flowlayout();
	}//main-end
}//class-end
