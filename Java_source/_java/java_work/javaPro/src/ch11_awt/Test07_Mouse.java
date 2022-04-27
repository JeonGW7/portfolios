package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//â���� �����ϼ��� 
@SuppressWarnings("serial")
public class Test07_Mouse extends Frame implements MouseMotionListener{
	//����
	Point point = new Point(0,0); //���콺 Ŀ���� ��ǥ�� ���� ���� 
	Color cols[] = {Color.red,Color.blue,Color.green,Color.yellow,Color.pink,Color.gray,Color.orange};
	//������
	public Test07_Mouse(){
		addWindowListener(new MyWin());//�̺�Ʈ ���
		addMouseMotionListener(this);//�̺�Ʈ ���
		setSize(450, 450);
		setVisible(true);
	}
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);//���α׷� ����
		}
	}
	//�޼���
	public void mouseDragged(MouseEvent me){
		point = me.getPoint();//���콺 �����Ͱ��� ���������� �ִ´�
		repaint();//�ٽ� �׸���, JVM�� ���ؼ� update->clearRect->paint 
	}
	public void mouseMoved(MouseEvent me){}
	public void update(Graphics g){
		paint(g);
	}
	//paint
	public void paint(Graphics g){
		int c=(int)(Math.random()*cols.length);
		g.setColor(cols[c]);//������
		g.drawOval(point.x, point.y, 15, 15);
	}
	
	//main
	public static void main(String[] args) {
		new Test07_Mouse();
	}
}
