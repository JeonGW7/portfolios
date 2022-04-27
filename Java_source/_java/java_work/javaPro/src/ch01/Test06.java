package ch01;
//10진
//2진
//8진
//16진
public class Test06 {

	public static void main(String[] args) {
		int a =10; //10진 데이터
		System.out.println(a); //10진 출력
		System.out.println(Integer.toBinaryString(a));//2진
		System.out.println(Integer.toOctalString(a));//8진
		System.out.println(Integer.toHexString(a));//16진
		//int형 최대 최소값 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}//main-end

}//class-end
