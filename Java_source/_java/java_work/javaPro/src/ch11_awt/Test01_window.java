package ch11_awt;
import java.awt.*; //frame
import java.awt.event.*; //�̺�Ʈ ó��
@SuppressWarnings("serial")
//�������̽� ���:windowlistener
public class Test01_window extends Frame implements WindowListener {
	//����
	//������: ��ü �ʱ�ȭ�� �����̴�
	public Test01_window(){
		super("â����");
		addWindowListener(this);//�̺�Ʈ ��� 
		setSize(450, 450);//âũ�� width,height
		setVisible(true);//â�� �����ش� 
	}//cons-end
	
	//�޼���
	
	public static void main(String[] args) {
		new Test01_window();//��ü����,������ ȣ�� 
	}//main-end
	
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();//���ҽ� ��ȯ, ���� ������ �� ���� dispose()�� �����ص� �ȴ�. 
		System.exit(0);//���α׷� ����, â�ݱ� ����
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {//â�� ������ȭ
	}

	@Override
	public void windowDeiconified(WindowEvent e) {//â�� �������ȭ
	}

	@Override
	public void windowActivated(WindowEvent e) {//â Ȱ��ȭ
	}

	@Override
	public void windowDeactivated(WindowEvent e) {//â ��Ȱ��ȭ
	}
}//class-end
