package ch11_awt;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test08_key extends Frame implements KeyListener{
	//변수
	Image im;
	int x,y;
	//생성자
	public Test08_key(){
		x=100;
		y=100;
		im=Toolkit.getDefaultToolkit().getImage("C:\\_util\\icon.jpg");
		addWindowListener(new MyWin());
		addKeyListener(this); //이벤트 등록
		setSize(450, 450);
		setVisible(true);
	}
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	//inner class
	//메서드
	//paint
	public void paint(Graphics g){
		g.drawImage(im,x,y,this);
	}
	//오버라이드
	public void keyPressed(KeyEvent ke){
		switch(ke.getKeyCode()){
		case KeyEvent.VK_UP:
			y-=5; break;
		case KeyEvent.VK_DOWN:
			y+=5; break;
		case KeyEvent.VK_LEFT:
			x-=5; break;
		case KeyEvent.VK_RIGHT:
			x+=5; break;
		}//switch-end
		repaint();//update->clearRect->paint 
	}//keypressed()-end
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	//main
	public static void main(String[] args) {
		new Test08_key();
	}

}
