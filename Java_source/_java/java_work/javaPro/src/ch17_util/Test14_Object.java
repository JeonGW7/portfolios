package ch17_util;
//hashCode() : �ڹ� ��ü�� �ĺ��ϴ� �ؽ��ڵ带 �����ϴ� �޼��� 
//��� ��ü�� �ؽ��ڵ�� �����ȴ�
//getClass() : ��ü�� Ŭ�����̸��� Class������ �����ϴ� �޼��� 
//toString() : ��ü�� ���ڿ��� ��ȯ (java.util.Date(),StringBuffer���� ���� ���)
class Demo{}
public class Test14_Object {
	public static void main(String[] args) {
		Demo A = new Demo();
		Demo B = new Demo();
		Demo C = new Demo();
		System.out.println("AŬ���� �̸�:"+A.getClass());
		System.out.println("BŬ���� �̸�:"+B.getClass());
		System.out.println("CŬ���� �̸�:"+C.getClass());
		System.out.println();
		System.out.println("A�ؽ� �ڵ�:"+A.hashCode());
		System.out.println("B�ؽ� �ڵ�:"+B.hashCode());
		System.out.println("C�ؽ� �ڵ�:"+C.hashCode());
		System.out.println();
		System.out.println("A��ü ���ڿ�:"+A.toString());
		System.out.println("B��ü ���ڿ�:"+B.toString());
		System.out.println("C��ü ���ڿ�:"+C.toString());
		System.out.println();
	}//main-end
}//class-end
