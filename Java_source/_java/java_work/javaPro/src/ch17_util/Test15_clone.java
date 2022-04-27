package ch17_util;
//clone() : ��ü ����
//toString() : �������̵�

public class Test15_clone implements Cloneable {
	//����
	String name;
	//������
	public Test15_clone(String name){
		this.name = name;
	}
	//�޼��� : �������̵�
	public String toString(){
		return name+"�Դϴ�";
	}
	
	//main
	public static void main(String[] args) {
		try{
		Test15_clone ob1 = new Test15_clone("������");//��ü����
		System.out.println(ob1);
		System.out.println(ob1.toString());
		Double D = new Double(55.5); //��ü ����
		System.out.println(D);
		System.out.println(D.toString());
		System.out.println();
		//��ü����
		
		Test15_clone ob2 = (Test15_clone)ob1.clone();//��ü����, ����ó�� �ʿ�
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		//ob1,ob2 ��
		System.out.println(ob1==ob2);//false
		System.out.println(ob1 != ob2);//true
		System.out.println(ob1.toString().equals(ob2.toString()));//���ڿ� ���̱� ������ true 
		}catch(Exception ex){
			System.out.println(ex);
		}
		
	}//main-end
}//class-end
