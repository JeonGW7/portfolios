package ch11_awt;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test06_Mouse extends Frame implements MouseListener,MouseMotionListener {
	//변수
	private String msg="HI";//paint() => JVM에 의해서 호출
	private int xpos=100,ypos=100;//마우스 포인터값
	//생성자
	public Test06_Mouse(){
		super("마우스 이벤트 처리");
		addWindowListener(new MyWin());
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(450,450);
		setVisible(true);
	}//cons-end
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end
	//메서드
	//사용자 정의 메서드
	private void setValue(String msg,int x,int y){
		this.msg = msg;
		this.xpos = x;
		this.ypos = y;
		repaint();//다시그리기,jvm에 의해서 update() 호출 >> clearRect() 호출 >> paint() 호출
	}
	//paint
	public void paint(Graphics g){
		g.drawString(msg+"["+xpos+","+ypos+"]",xpos,ypos);
	}
	//오버라이딩
	public void mousePressed(MouseEvent me){
		setValue("mousePressed",me.getX(),me.getY());
	}
	public void mouseReleased(MouseEvent me){
		setValue("mouseReleased",me.getX(),me.getY());
	}
	public void mouseClicked(MouseEvent me){
		setValue("mouseClicked",me.getX(),me.getY());
	}
	public void mouseEntered(MouseEvent me){
		System.out.println("마우스커서가 창안으로 들어왔음");
	}
	public void mouseExited(MouseEvent me){
		System.out.println("마우스커서가 창밖으로 나갔음");
	}
	
	public void mouseDragged(MouseEvent me){
		setValue("mouseDragged",me.getX(),me.getY());
	}
	public void mouseMoved(MouseEvent me){
		setValue("mouseMoved",me.getX(),me.getY());
	}
	
	//main
	public static void main(String[] args) {
		new Test06_Mouse();
	}//main-end
	
}//class-end
