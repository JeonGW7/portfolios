package ch07_oop;
import java.awt.*; //Frame
@SuppressWarnings("serial")
public class Test01 extends Frame{
	//������
	public Test01(){
		super("����1"); //���� Ŭ���� ������ ȣ��
		setSize(450,450); //âũ�� width, height
		setVisible(true); //âǥ��
	}//cons-end
	public static void main(String[] args) {
		new Test01(); //��ü����, ������ ȣ��
	}
}//class-end
