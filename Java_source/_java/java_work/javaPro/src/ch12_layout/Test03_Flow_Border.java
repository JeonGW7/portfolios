package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test03_Flow_Border extends Frame {
	//변수
	Panel pNorth,pSouth;
	Button b1,b2,b3,b4,b5;
	
	//생성자
	public Test03_Flow_Border(){
		super("FlowLayout과 BoarderLayout 둘다 사용");
		b1 = new Button("첫번째버튼");
		b2 = new Button("두번째버튼");
		b3 = new Button("세번째버튼");
		b4 = new Button("네번째버튼");
		b5 = new Button("다섯번째버튼");
		pNorth = new Panel();
		pSouth = new Panel();
		pNorth.setBackground(Color.yellow);
		pSouth.setBackground(Color.cyan);
		//패널에 버튼 붙이기 
		pNorth.add(b1);
		pNorth.add(b2);
		pNorth.add(b3);
		pSouth.add(b4);
		pSouth.add(b5);
		//프레임에 패널 붙이기
		add("North",pNorth);
		add("South",pSouth);
		addWindowListener(new MyWin());
		setSize(450,450);
		setVisible(true);
	}
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Test03_Flow_Border();
	}
}