package ch07_oop;
//�����ε�, �Ű�����, ���ϰ� �ޱ�
public class Test06_overload_method {
	public int sum(int a,int b,int c){
		System.out.println("sum(int a, int b,int c) called");
		int s = a+b+c;
		return s;
	}
	public double sum(double a,double b){
		System.out.println("sum(double a, double b) called");
		double s = a+b;
		return s;
	}
	public static void main(String[] args) {
		Test06_overload_method t = new Test06_overload_method();//��ü����
		int s = t.sum(10, 20, 30); //�޼��� ȣ��, ����� ����
		System.out.println("s: "+s);
		//
		double d= t.sum(22.5, 33.5);
		System.out.println("d: "+d);
		
	}//main-end
}//class-end