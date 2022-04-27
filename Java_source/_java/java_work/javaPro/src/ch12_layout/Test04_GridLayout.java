package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test04_GridLayout extends Frame{
	//변수
	Button b1,b2,b3,b4,b5;
	//생성자
	public Test04_GridLayout(){
		super("GridLayout"); //첫줄에
		b1 = new Button("첫번째버튼");
		b2 = new Button("두번째버튼");
		b3 = new Button("세번째버튼");
		b4 = new Button("네번째버튼");
		b5 = new Button("다섯번째버튼");
		//GridLayout 적용
		setLayout(new GridLayout(2, 3)); //2행3열
		//frame에 컨퍼넌트(버튼) 붙이기
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		addWindowListener(new MyWin());
		setSize(450, 450);
		setVisible(true);
	}
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Test04_GridLayout();
	}

}
