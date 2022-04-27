package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test04_GridLayout extends Frame{
	//����
	Button b1,b2,b3,b4,b5;
	//������
	public Test04_GridLayout(){
		super("GridLayout"); //ù�ٿ�
		b1 = new Button("ù��°��ư");
		b2 = new Button("�ι�°��ư");
		b3 = new Button("����°��ư");
		b4 = new Button("�׹�°��ư");
		b5 = new Button("�ټ���°��ư");
		//GridLayout ����
		setLayout(new GridLayout(2, 3)); //2��3��
		//frame�� ���۳�Ʈ(��ư) ���̱�
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		addWindowListener(new MyWin());
		setSize(450, 450);
		setVisible(true);
	}
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Test04_GridLayout();
	}

}
