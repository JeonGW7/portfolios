package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//inner class ��� ����
@SuppressWarnings("serial")
public class Test02_window extends Frame {
	//����
	//������:��ü(�ʵ�)�ʱ�ȭ�� �����̴�
	public Test02_window(){
		super("inner class");
		addWindowListener(new MyWin()); //�̺�Ʈ ��� 
		setSize(450,450);
		setVisible(true);//âǥ��
	}//cons-end
	class MyWin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent we){
			dispose();//���ҽ���ȯ
			System.exit(0);//���α׷� ����
		}
	}//inner class-end
	//�޼���
	//main
	public static void main(String[] args) {
		new Test02_window();
	}//main-end
}//class-end
