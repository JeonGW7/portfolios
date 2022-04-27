package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//Graphics ���� 
//â����� inner class�� �Ѵ� 
@SuppressWarnings("serial")
public class Test04_Graphics extends Frame {
	//����
	//������
	public Test04_Graphics(){
		super("�׷��� ����");
		setSize(450, 450);
		setVisible(true);
		addWindowListener(new MyWin());//�̺�Ʈ ���
	}//cons-end
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
		System.exit(0);
		}
	}//inner class-end
	//�޼���
	//paint(): ������ �޼���
	//paint()�޼���� ������â�� ����� ����Ѵ�
	public void paint(Graphics g){
		g.drawString("������ �����", 30, 70);
		g.drawString("������ �ݿ���", 30, 90);
		//
		Font f = new Font("Dialog",Font.BOLD,20);
		g.setFont(f);
		g.drawString("�𷹴� �����", 30, 120);
		g.setFont(new Font("�ü�ü",Font.BOLD,20));
		g.setColor(Color.blue);
		g.drawString("���缮", 30, 150);
		//
		//���׸��� 
		g.setColor(Color.red);
		g.drawLine(50, 160, 150, 160);
		//�簢�� �׸���
		g.drawRect(50, 170, 100, 100);
		//ä���� �簢�� �׸���
		g.fillRect(70, 190, 60, 60);
		//���׸���
		g.setColor(Color.green);
		g.drawOval(50, 170, 100, 100);
		//ä�������׸���
		g.fillOval(70, 190, 60, 60);
	}//paint-end
	//main 
	public static void main(String[] args) {
		new Test04_Graphics();//��ü ����
	}//main-end
}//class-end
