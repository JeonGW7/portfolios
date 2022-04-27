package ch17_util;

public class AutoUnBoxing {
	public static void main(String[] args) {
		int a =10; //stack영역에 저장
		Integer A = a; //heap 영역에 저장(AutoBoxing)
		Integer B = new Integer(100); //heap영역에 저장
		int b = B; //stack영역에 저장 (UnBoxing)
		System.out.println(a);
		System.out.println(A.toString());
		System.out.println(A);
		//
		System.out.println(B.toString());
		System.out.println(b);
	}

}
