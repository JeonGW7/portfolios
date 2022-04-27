package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//Graphics 예제 
//창종료는 inner class로 한다 
@SuppressWarnings("serial")
public class Test04_Graphics extends Frame {
	//변수
	//생성자
	public Test04_Graphics(){
		super("그래픽 예제");
		setSize(450, 450);
		setVisible(true);
		addWindowListener(new MyWin());//이벤트 등록
	}//cons-end
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
		System.exit(0);
		}
	}//inner class-end
	//메서드
	//paint(): 제공된 메서드
	//paint()메서드는 원도우창에 출력을 담당한다
	public void paint(Graphics g){
		g.drawString("오늘은 목요일", 30, 70);
		g.drawString("내일은 금요일", 30, 90);
		//
		Font f = new Font("Dialog",Font.BOLD,20);
		g.setFont(f);
		g.drawString("모레는 토요일", 30, 120);
		g.setFont(new Font("궁서체",Font.BOLD,20));
		g.setColor(Color.blue);
		g.drawString("유재석", 30, 150);
		//
		//선그리기 
		g.setColor(Color.red);
		g.drawLine(50, 160, 150, 160);
		//사각형 그리기
		g.drawRect(50, 170, 100, 100);
		//채워진 사각형 그리기
		g.fillRect(70, 190, 60, 60);
		//원그리기
		g.setColor(Color.green);
		g.drawOval(50, 170, 100, 100);
		//채워진원그리기
		g.fillOval(70, 190, 60, 60);
	}//paint-end
	//main 
	public static void main(String[] args) {
		new Test04_Graphics();//객체 생성
	}//main-end
}//class-end
