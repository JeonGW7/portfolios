package ch07_oop;
//�Ű�����, ������ �Ѵ� ����ϴ� �޼��� ����
//���������� ������ �޼����̸�(�μ�,�Ű�����,,){}
public class Test04_method {
	public int aa(int a,int b){
		System.out.println("aa(int a,int b) called");
		int s = a+b;
		return s;
	}
	public double bb(double a,double b){
		System.out.println("bb(doulbe a double b) called");
		double s = a+b;
		return s;
	}
	
	public static void main(String[] args) {
		Test04_method t = new Test04_method();//��ü����(heap������ �޸� �Ҵ�),������ ȣ��
		int ss = t.aa(10, 5);//�޼��� ȣ��, ���ϰ��� �޴´�
		System.out.println("ss: "+ss);
		//
		double tt = t.bb(55.5, 77.7);//�޼��� ȣ��, ���ϰ��� �޴´�
		System.out.println("tt: "+tt);
		
	}//main-end
}//class-end
