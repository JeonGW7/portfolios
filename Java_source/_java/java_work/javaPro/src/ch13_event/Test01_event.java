package ch13_event;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
//�̺�Ʈ ó���Ϸ���
//1. Ŭ���� �Ǵ� �������̽��� ��� �޴´�
//2. �̺�Ʈ ����� �Ѵ� 
//3. �ش�޼��� �������̵� �Ѵ� 
public class Test01_event extends Frame implements ActionListener {
	//����
	TextField tf1,tf2;
	TextArea ta;
	//������
	public Test01_event(){
		super("eventó��"); //ù�ٿ�
		tf1 = new TextField();
		tf2 = new TextField();
		ta = new TextArea();
		ta.setBackground(Color.cyan);
		tf1.setFont(new Font("�ü�ü",Font.BOLD,17));
		tf2.setFont(new Font("�ü�ü",Font.BOLD,17));
		ta.setFont(new Font("�ü�ü",Font.BOLD,17));
		//Frame�����̳ʿ� ������Ʈ ���̱�
		add("North",tf1);
		add("Center",ta);
		add("South",tf2);
		addWindowListener(new MyWin());//�̺�Ʈ���
		tf1.addActionListener(this);//�̺�Ʈ ���, �������̽� ��ӹ����� this
		tf2.addActionListener(this);//�̺�Ʈ ���
		
		setSize(450, 450);
		setVisible(true);
	}//cons-end
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end
	//�޼��� - �������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg = "A >> "+tf1.getText();
			ta.append(msg+"\n");
			tf1.setText(""); //���������
			tf2.requestFocus(); //��Ŀ������ 
		}else if(e.getSource()==tf2){
			String msg = "B >> "+tf2.getText();
			ta.append(msg+"\n");
			tf2.setText(""); //���������
			tf1.requestFocus(); // ���� �Դ� �����ϰ� ���� 
		}
	}//actionPerformed-end
	public static void main(String[] args) {
		new Test01_event();
	}//main-end
}//class-end
