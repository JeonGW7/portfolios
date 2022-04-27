package ch03_oper;
//조건연산자=3항연산자  형식: (조건)?값1:값2 
//캐스팅 연산자
public class Test05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = (7>5)?7:5; //7
		int b = (7<5)?7:5; //5
		System.out.println(a);
		System.out.println(b);
		//casting 연산자
		int c = (int)12.2;
		char d = (char)77;
		char e = (char)77.7;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}//main-end

}//class-end
