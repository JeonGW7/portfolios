package ch09_class;
import java.awt.*;
@SuppressWarnings("serial")
public class Test06_extends extends Frame{
	//����
	
	//������
	public Test06_extends(){
		super("����");
	}
	//�޼���
	
	public static void main(String[] args) {
		//����Ŭ���� ������ ������ü ó��
		Frame f = new Test06_extends();//��ü ����
		f.setSize(450,450);
		f.setVisible(true); //âǥ��
	}//main-end
}//class-end
