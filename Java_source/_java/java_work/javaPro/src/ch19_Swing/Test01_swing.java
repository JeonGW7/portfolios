package ch19_Swing;
import java.awt.*;//Layout

import javax.swing.*;
@SuppressWarnings("serial")
public class Test01_swing extends JFrame {
	//변수
	JButton b1,b2,b3;
	//생성자
	public Test01_swing(){
		this.getContentPane().setLayout(new FlowLayout());
		ImageIcon icon1 = new ImageIcon("C:\\_util\\Imgs\\a1.gif");
		b1 = new JButton("1번",icon1);
		b1.setToolTipText("첫번째 버튼입니다");
		this.getContentPane().add(b1);
		
		ImageIcon icon2 = new ImageIcon("C:\\_util\\Imgs\\b1.gif");
		b2 = new JButton("2번",icon2);
		b2.setToolTipText("두번째 버튼입니다");
		this.getContentPane().add(b2);
		
		ImageIcon icon3 = new ImageIcon("C:\\_util\\Imgs\\c1.gif");
		b3 = new JButton("3번",icon3);
		b3.setToolTipText("세번째 버튼입니다");
		this.getContentPane().add(b3);
		
		setSize(400,400); //창크기 width,height
		setVisible(true);
		//프로그램 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프로그램 종료
	}//cons-end
	//main
	public static void main(String[] args) {
		new Test01_swing(); //객체생성, 생성자 호출
	}//main-end
}//class-end
