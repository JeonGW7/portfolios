package ch19_Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//awt,swing�Բ� ���
@SuppressWarnings("serial")
public class Test02_swing extends JFrame implements ActionListener{
	//����
	JButton b1,b2,b3;
	//������
	public Test02_swing(){
		ImageIcon icon1 = new ImageIcon("C:\\_util\\Imgs\\a1.gif");
		ImageIcon icon2 = new ImageIcon("C:\\_util\\Imgs\\b1.gif");
		ImageIcon icon3 = new ImageIcon("C:\\_util\\Imgs\\c1.gif");
		b1 = new JButton("����",icon1);
		b2 = new JButton("���",icon2);
		b3 = new JButton("����",icon3); //��ư����
		
		b1.setToolTipText("���� ��ȭ ���� �Դϴ�");
		b2.setToolTipText("��� ��ȭ ���� �Դϴ�");
		b3.setToolTipText("���� ��ȭ ���� �Դϴ�");
		
		this.getContentPane().setLayout(new FlowLayout()); //Layout����
		//JFrame�� ������Ʈ ���̱� 
		this.getContentPane().add(b1); //this ��������
		this.getContentPane().add(b2); //this ��������
		this.getContentPane().add(b3); //this ��������
		b1.addActionListener(this);//�̺�Ʈ ���
		b2.addActionListener(this);//�̺�Ʈ ���
		b3.addActionListener(this);//�̺�Ʈ ���
		setSize(400, 400);
		setVisible(true);
		//���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	//�޼��� �������̵�
	public void actionPerformed(ActionEvent e){
//		JOptionPane.showMessageDialog(�θ�ü,message,�ɼ�);
//		JOptionPane.showMessageDialog(�θ�ü,message,"â����",�ɼ�(������));
//		JOptionPane.showMessageDialog(this,message,�ɼ�);
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this, "������ȭ����");
		}else if(e.getSource()==b2){
			JOptionPane.showMessageDialog(this, "����ȭ����","â����:���",JOptionPane.WARNING_MESSAGE);//�ɼ��߰� - warning�������̳���
		}else if(e.getSource()==b3){
			JOptionPane.showMessageDialog(this, "������ȭ����","â����:����",JOptionPane.ERROR_MESSAGE);
		}
	}//actionPerformed()-end
	public static void main(String[] args) {
		new Test02_swing();
	}//main-end
}//class-end
