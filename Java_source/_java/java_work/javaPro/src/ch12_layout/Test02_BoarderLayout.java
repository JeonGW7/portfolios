package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test02_BoarderLayout extends Frame{
	//변수
	Button b1,b2,b3,b4,b5;
	//생성자
	public Test02_BoarderLayout(){
		super("BoarderLayout");//첫줄에 기재
		b1 = new Button("첫번째버튼");
		b2 = new Button("두번째버튼");
		b3 = new Button("세번째버튼");
		b4 = new Button("네번째버튼");
		b5 = new Button("다섯번째버튼");
		//window계열의 default layout: BoarderLayout이다 
		
		//컨테이너(Frame)에 컴포넌트 붙이기 
		add("North",b1);
		add("South",b2);
		add("East",b3);
		add("West",b4);
		add("Center",b5);
		addWindowListener(new MyWin());
		setSize(450, 450);
		setVisible(true);
	}//cons-end
	//inner-class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end
	
	public static void main(String[] args) {
		new Test02_BoarderLayout();
	}

}
