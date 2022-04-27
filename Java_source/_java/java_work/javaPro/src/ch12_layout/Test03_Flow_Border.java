package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test03_Flow_Border extends Frame {
	//����
	Panel pNorth,pSouth;
	Button b1,b2,b3,b4,b5;
	
	//������
	public Test03_Flow_Border(){
		super("FlowLayout�� BoarderLayout �Ѵ� ���");
		b1 = new Button("ù��°��ư");
		b2 = new Button("�ι�°��ư");
		b3 = new Button("����°��ư");
		b4 = new Button("�׹�°��ư");
		b5 = new Button("�ټ���°��ư");
		pNorth = new Panel();
		pSouth = new Panel();
		pNorth.setBackground(Color.yellow);
		pSouth.setBackground(Color.cyan);
		//�гο� ��ư ���̱� 
		pNorth.add(b1);
		pNorth.add(b2);
		pNorth.add(b3);
		pSouth.add(b4);
		pSouth.add(b5);
		//�����ӿ� �г� ���̱�
		add("North",pNorth);
		add("South",pSouth);
		addWindowListener(new MyWin());
		setSize(450,450);
		setVisible(true);
	}
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Test03_Flow_Border();
	}
}