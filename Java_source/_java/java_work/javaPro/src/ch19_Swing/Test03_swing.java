package ch19_Swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class Test03_swing extends Frame implements ActionListener{
	//����
	Button b1,b2,b3;
	//������
	public Test03_swing(){
		b1 = new Button("Message");
		b2 = new Button("confirm");
		b3 = new Button("input");
		
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);//���� ����
		
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);//���� ��
		
		b1.setFont(new Font("Dialog",Font.BOLD,16));
		b2.setFont(new Font("Dialog",Font.BOLD,16));
		b3.setFont(new Font("Dialog",Font.BOLD,16));//��Ʈ
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);//�̺�Ʈ ���
		
		setLayout(new FlowLayout());
		//Frame�� ������Ʈ ���̱�
		add(b1);
		add(b2);
		add(b3);
		//���α׷� ����,���� inner class 
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		setSize(400, 400);
		setVisible(true);
	}//cons-end
	//�޼���:�������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this, "message");
		}else if(e.getSource()==b2){
			JOptionPane.showConfirmDialog(this, "confirm");
		}else if(e.getSource()==b3){
			String name = JOptionPane.showInputDialog(this,"��ȭ���� �Է��ϼ���");
			//��ȭ���� �Է¹޾Ƽ� 
			//����� ��ȭ���� ...�Դϴ� ���
			System.out.println("����� ��ȭ���� "+name+" �Դϴ�");
			
		}
	}//actionPerformed()-end
	public static void main(String[] args) {
		new Test03_swing();//��ü����, ������ ȣ�� 
	}//main-end
}//class-end
