package ch11_awt;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test05_Graphics extends Frame{
	//����
	Image im;
	//������
	public Test05_Graphics(){
		super("�̹��� ����");
		im = Toolkit.getDefaultToolkit().getImage("C:\\_util\\back.jpg");
		setSize(950, 650);
		setVisible(true);
		addWindowListener(new MyWin());//�̺�Ʈ ���
	}//cons-end
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	//paint �޼���
	public void paint(Graphics g){
		g.drawImage(im,10,45,this);
		g.drawImage(im,10,45,100,100,this);//�̹��� ũ�� ����
	}
	//�޼���
	//main
	public static void main(String[] args) {
		new Test05_Graphics();
	}//main-end
}//class-end
