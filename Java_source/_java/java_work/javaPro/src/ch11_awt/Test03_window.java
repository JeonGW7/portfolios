package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//anonymous inner class : �̸����� Ŭ����=����Ŭ���� 
@SuppressWarnings("serial")
public class Test03_window extends Frame {
	//����
	//������
	public Test03_window(){
		super("����Ŭ����");
		setSize(450,450);
		setVisible(true);
		addWindowListener(new WindowAdapter() 
		{//���� Ŭ����
			public void windowClosing(WindowEvent we){ //�������̵�
				dispose();
				System.exit(0);
			}
		});
	}//cons-end
	//�޼���
	public static void main(String[] args) {
		new Test03_window();
	}//main-end
}//class-end
