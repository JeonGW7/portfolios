package ch19_Swing;
import java.awt.*;//Layout
import java.awt.event.*;//�̺�Ʈ ó��
import javax.swing.*;
//JTable
@SuppressWarnings({ "serial", "unused" })
public class Test05_table extends JFrame{
	//����
	JTable table;
	//������
	public Test05_table(){
		String cols[]={"�̸�","����","�̸���"};//���̺� �� ����
		Object ob[][] = 
				{{"������","16","s@daum.net"},{"�̵���","18","l@naver.com"},
				{"����","41","w@nate.com"},{"�����","15","h@daum.net"},
				{"�����","17","m@naver.com"},{"���븮","35","mm@daum.net"},{"�趱��","30","k@daum.net"},
				{"��ȿ��","45","lee@naver.com"},{"�̻��","50","ll@naver.com"},
				{"������","16","g@daum.net"}};
		table = new JTable(ob,cols); //���̺� ����
		JScrollPane jScrollPane = new JScrollPane(table); //table�� ������ ������ ��ũ�ѹ� �����ϱ� ���ؼ� 
		this.getContentPane().add(jScrollPane); //this��������, JFrame�� Component���̱�
		setSize(300, 300);
		setVisible(true);
		//���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	//�޼���
	public static void main(String[] args) {
		new Test05_table();
	}//main-end
}//class-end
