package ch08_const;
import java.awt.*;
@SuppressWarnings("serial")
public class Test04_super extends Frame {
	//������
	public Test04_super(){
		super("����1");//���� Ŭ���� ������ ȣ��
		setBackground(Color.gray);//����
		setSize(450,450);//âũ�� 
		setVisible(true);//âǥ��
		
//		super.setBackground(Color.gray);//����
//		super.setSize(450,450);//âũ�� 
//		super.setVisible(true);//âǥ��
		
//		this.setBackground(Color.gray);//����
//		this.setSize(450,450);//âũ�� 
//		this.setVisible(true);//âǥ��
	}
	public static void main(String[] args) {
		new Test04_super();//��ü����,������ ȣ��
	}//main-end
}//class-end
