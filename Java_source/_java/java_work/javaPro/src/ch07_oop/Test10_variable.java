package ch07_oop;
//�������� : �ڵ����� �ʱ�ȭ �ȴ�, Ŭ���� �ȿ�, �޼��� �ۿ��� ����
//�������� : �ڵ����� �ʱ�ȭ �ȵȴ�. �޼��� �ȿ��� ���� 
public class Test10_variable {
	int x; //��������
	double y;
	String irum;
	@SuppressWarnings("unused")
	public void aa(){
		int a;
		double b;
		String name;
//		System.out.println("a:"+a); //�ʱ�ȭ�� �����ʾ� ����
//		System.out.println("b:"+b);
//		System.out.println("name:"+name);
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("irum:"+irum);
	}
	public static void main(String[] args) {
		Test10_variable t = new Test10_variable();//��ü����
		t.aa();
	}//main-end
}//class-end
