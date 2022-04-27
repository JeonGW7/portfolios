package ch11_awt;
import java.awt.*; //frame
import java.awt.event.*; //이벤트 처리
@SuppressWarnings("serial")
//인터페이스 사용:windowlistener
public class Test01_window extends Frame implements WindowListener {
	//변수
	//생성자: 객체 초기화가 목적이다
	public Test01_window(){
		super("창종료");
		addWindowListener(this);//이벤트 등록 
		setSize(450, 450);//창크기 width,height
		setVisible(true);//창을 보여준다 
	}//cons-end
	
	//메서드
	
	public static void main(String[] args) {
		new Test01_window();//객체생성,생성자 호출 
	}//main-end
	
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();//리소스 반환, 종료 구문을 쓸 때는 dispose()를 생략해도 된다. 
		System.exit(0);//프로그램 종료, 창닫기 가능
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {//창을 아이콘화
	}

	@Override
	public void windowDeiconified(WindowEvent e) {//창을 비아이콘화
	}

	@Override
	public void windowActivated(WindowEvent e) {//창 활성화
	}

	@Override
	public void windowDeactivated(WindowEvent e) {//창 비활성화
	}
}//class-end
