package ch19_Swing;
import java.awt.*;//Layout

import javax.swing.*;
@SuppressWarnings("serial")
public class Test01_swing extends JFrame {
	//����
	JButton b1,b2,b3;
	//������
	public Test01_swing(){
		this.getContentPane().setLayout(new FlowLayout());
		ImageIcon icon1 = new ImageIcon("C:\\_util\\Imgs\\a1.gif");
		b1 = new JButton("1��",icon1);
		b1.setToolTipText("ù��° ��ư�Դϴ�");
		this.getContentPane().add(b1);
		
		ImageIcon icon2 = new ImageIcon("C:\\_util\\Imgs\\b1.gif");
		b2 = new JButton("2��",icon2);
		b2.setToolTipText("�ι�° ��ư�Դϴ�");
		this.getContentPane().add(b2);
		
		ImageIcon icon3 = new ImageIcon("C:\\_util\\Imgs\\c1.gif");
		b3 = new JButton("3��",icon3);
		b3.setToolTipText("����° ��ư�Դϴ�");
		this.getContentPane().add(b3);
		
		setSize(400,400); //âũ�� width,height
		setVisible(true);
		//���α׷� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���α׷� ����
	}//cons-end
	//main
	public static void main(String[] args) {
		new Test01_swing(); //��ü����, ������ ȣ��
	}//main-end
}//class-end
