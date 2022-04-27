package ch11_awt;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test05_Graphics extends Frame{
	//변수
	Image im;
	//생성자
	public Test05_Graphics(){
		super("이미지 연습");
		im = Toolkit.getDefaultToolkit().getImage("C:\\_util\\back.jpg");
		setSize(950, 650);
		setVisible(true);
		addWindowListener(new MyWin());//이벤트 등록
	}//cons-end
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	//paint 메서드
	public void paint(Graphics g){
		g.drawImage(im,10,45,this);
		g.drawImage(im,10,45,100,100,this);//이미지 크기 조절
	}
	//메서드
	//main
	public static void main(String[] args) {
		new Test05_Graphics();
	}//main-end
}//class-end
