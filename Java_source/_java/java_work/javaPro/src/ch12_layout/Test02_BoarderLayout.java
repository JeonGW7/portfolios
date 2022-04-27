package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test02_BoarderLayout extends Frame{
	//����
	Button b1,b2,b3,b4,b5;
	//������
	public Test02_BoarderLayout(){
		super("BoarderLayout");//ù�ٿ� ����
		b1 = new Button("ù��°��ư");
		b2 = new Button("�ι�°��ư");
		b3 = new Button("����°��ư");
		b4 = new Button("�׹�°��ư");
		b5 = new Button("�ټ���°��ư");
		//window�迭�� default layout: BoarderLayout�̴� 
		
		//�����̳�(Frame)�� ������Ʈ ���̱� 
		add("North",b1);
		add("South",b2);
		add("East",b3);
		add("West",b4);
		add("Center",b5);
		addWindowListener(new MyWin());
		setSize(450, 450);
		setVisible(true);
	}//cons-end
	//inner-class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end
	
	public static void main(String[] args) {
		new Test02_BoarderLayout();
	}

}
