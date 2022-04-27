package ch12_layout;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Test01_flowlayout extends Frame {
	//����
	Button b1,b2,b3,b4,b5;
	//������: ��ü(�ʵ�)�ʱ�ȭ�� �����̴� 
	public Test01_flowlayout(){
		super("Layout ����");
		b1 = new Button("ù��°��ư");
		b2 = new Button("�ι�°��ư");
		b3 = new Button("����°��ư");
		b4 = new Button("�׹�°��ư");
		b5 = new Button("�ټ���°��ư");
		//FlowLayout����
		setLayout(new FlowLayout());
		this.add(b1); //this ��������
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		//�����̳�(frame)�� ���۳�Ʈ(��ư) ���̱� 
		addWindowListener(new MyWin());
		setSize(450,450);
		setVisible(true);
	}
	//inner class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end

	public static void main(String[] args) {
		new Test01_flowlayout();
	}//main-end
}//class-end
