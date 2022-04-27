package ch07_oop;
//static������ �� Ŭ������ ��� ��ü�� �����Ѵ� 
//static���� �� ����� ��

class SingSang12{
	//��������
	private String name;
	private int age;
	private static int sungin=20;
	//������: ��ü �ʱ�ȭ�� �����̴�
	public SingSang12(String name,int age){
		this.name = name;
		this.age = age;
	}//cons-end
	//����� ���� �޼���
	public void disp(){
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		if(age>=sungin){
			System.out.println("����");
		} else if(age<sungin){
			System.out.println("�̼�����");
		}
		System.out.println();//line-skip
	}//disp()-end
}//class-end
public class Test12_Variable {

	public static void main(String[] args) {
		SingSang12 yim = new SingSang12("�ӿ���", 32); //��ü����
		SingSang12 jung = new SingSang12("������", 15); //��ü����
		SingSang12 lee = new SingSang12("�̵���", 43); //��ü����
		yim.disp();
		jung.disp();
		lee.disp();
	}//main-end
}//class-end
