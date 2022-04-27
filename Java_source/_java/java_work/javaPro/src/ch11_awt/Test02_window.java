package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//inner class 사용 예제
@SuppressWarnings("serial")
public class Test02_window extends Frame {
	//변수
	//생성자:객체(필드)초기화가 목적이다
	public Test02_window(){
		super("inner class");
		addWindowListener(new MyWin()); //이벤트 등록 
		setSize(450,450);
		setVisible(true);//창표시
	}//cons-end
	class MyWin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent we){
			dispose();//리소스반환
			System.exit(0);//프로그램 종료
		}
	}//inner class-end
	//메서드
	//main
	public static void main(String[] args) {
		new Test02_window();
	}//main-end
}//class-end
