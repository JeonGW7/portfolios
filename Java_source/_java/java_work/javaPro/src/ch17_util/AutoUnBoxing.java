package ch17_util;

public class AutoUnBoxing {
	public static void main(String[] args) {
		int a =10; //stack������ ����
		Integer A = a; //heap ������ ����(AutoBoxing)
		Integer B = new Integer(100); //heap������ ����
		int b = B; //stack������ ���� (UnBoxing)
		System.out.println(a);
		System.out.println(A.toString());
		System.out.println(A);
		//
		System.out.println(B.toString());
		System.out.println(b);
	}

}
