package ch07_oop;
//�������� : �ڵ����� �ʱ�ȭ �ȴ�, Ŭ���� �ȿ�, �޼��� �ۿ��� ����
//�������� : �ڵ����� �ʱ�ȭ �ȵȴ�. �޼��� �ȿ��� ���� 
class SinSang{
	String name; //���������� �� Ŭ���� ���� ��� �޼��忡�� ��� �����ϴ� 
	int age;
	double ki;
	//����� ���� �޼���
	public void setData(String name,int age,double ki){
		//this.�������� = �Ű�����
		this.name = name;
		this.age = age;
		this.ki = ki;
	}
	//����� ���� �޼���
	public void disp(){
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("Ű: "+ki);
	}
}//class-end---
public class Test08_variable {
	public static void main(String[] args) {
		SinSang ss = new SinSang();//��ü ����
		ss.setData("�ӿ���", 32, 182.7);
		ss.disp();//���
		//
		ss.setData("������", 3, 100);
		ss.disp();
		//
	}//main-end
}//class-end
