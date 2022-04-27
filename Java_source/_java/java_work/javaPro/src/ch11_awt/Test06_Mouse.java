package ch11_awt;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test06_Mouse extends Frame implements MouseListener,MouseMotionListener {
	//����
	private String msg="HI";//paint() => JVM�� ���ؼ� ȣ��
	private int xpos=100,ypos=100;//���콺 �����Ͱ�
	//������
	public Test06_Mouse(){
		super("���콺 �̺�Ʈ ó��");
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
	//�޼���
	//����� ���� �޼���
	private void setValue(String msg,int x,int y){
		this.msg = msg;
		this.xpos = x;
		this.ypos = y;
		repaint();//�ٽñ׸���,jvm�� ���ؼ� update() ȣ�� >> clearRect() ȣ�� >> paint() ȣ��
	}
	//paint
	public void paint(Graphics g){
		g.drawString(msg+"["+xpos+","+ypos+"]",xpos,ypos);
	}
	//�������̵�
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
		System.out.println("���콺Ŀ���� â������ ������");
	}
	public void mouseExited(MouseEvent me){
		System.out.println("���콺Ŀ���� â������ ������");
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
