package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//창종료 직접하세요 
@SuppressWarnings("serial")
public class Test07_Mouse extends Frame implements MouseMotionListener{
	//변수
	Point point = new Point(0,0); //마우스 커서의 좌표값 넣을 변수 
	Color cols[] = {Color.red,Color.blue,Color.green,Color.yellow,Color.pink,Color.gray,Color.orange};
	//생성자
	public Test07_Mouse(){
		addWindowListener(new MyWin());//이벤트 등록
		addMouseMotionListener(this);//이벤트 등록
		setSize(450, 450);
		setVisible(true);
	}
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);//프로그램 종료
		}
	}
	//메서드
	public void mouseDragged(MouseEvent me){
		point = me.getPoint();//마우스 포인터값을 전역변수에 넣는다
		repaint();//다시 그리기, JVM에 의해서 update->clearRect->paint 
	}
	public void mouseMoved(MouseEvent me){}
	public void update(Graphics g){
		paint(g);
	}
	//paint
	public void paint(Graphics g){
		int c=(int)(Math.random()*cols.length);
		g.setColor(cols[c]);//색상설정
		g.drawOval(point.x, point.y, 15, 15);
	}
	
	//main
	public static void main(String[] args) {
		new Test07_Mouse();
	}
}
