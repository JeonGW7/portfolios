package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//anonymous inner class : 이름없는 클래스=무명클래스 
@SuppressWarnings("serial")
public class Test03_window extends Frame {
	//변수
	//생성자
	public Test03_window(){
		super("무명클래스");
		setSize(450,450);
		setVisible(true);
		addWindowListener(new WindowAdapter() 
		{//무명 클래스
			public void windowClosing(WindowEvent we){ //오버라이딩
				dispose();
				System.exit(0);
			}
		});
	}//cons-end
	//메서드
	public static void main(String[] args) {
		new Test03_window();
	}//main-end
}//class-end
