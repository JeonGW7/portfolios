package ch07_oop;
//static �޼���� static ����� ����,�޼��常 ���(ȣ��)�����ϴ�
//static �޼��忡���� this��� ���Ѵ�(�̹� Ŭ������ �ҼӵǾ� �ֱ� ����)
//this:�ڽ��� ��ü�� ���Ѵ�
//static�޼���� ��ü���� ���� �ʰ� ȣ�Ⱑ���ϴ� : Ŭ����.method : Math.max(55.33)
public class Test11_static_Variable {
	static int b = 100;
	public static void aa(){
		System.out.println("aa() called");
	}
	public static void main(String[] args) {
		aa();
		System.out.println("b:"+b);
//		this.b=700;//static�ȿ��� this���Ұ�
		System.out.println(Math.max(100, 90));
		System.out.println(Math.min(100, 90));
		System.out.println(Math.abs(-8));
		System.out.println(Math.PI);
		System.out.println(Math.ceil(7.1));//�ø���
		System.out.println(Math.floor(5.7));//������
		System.out.println(Math.round(7.1));//������ 5�̻��� �ø�
		System.out.println(Math.round(5.7));//������  5�̸��� ���� 
	}

}
