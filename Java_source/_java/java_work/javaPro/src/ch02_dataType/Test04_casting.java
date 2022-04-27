package ch02_dataType;
//자동형변환
//연산할 때는 자료형이 큰쪽으로 자동 형변환이 일어난다 
//할당시에는 왼쪽 자료형이 클 때, 왼쪽 자료형으로 형변환이 일어난다
//강제형변환 = casting : 강제로 형변환 하는 것
//int b=12.5; -> 에러
//int b=(int)12.5; -> 캐스팅 하여 할당 
public class Test04_casting {
	public static void main(String[] args) {
		System.out.println(10+12.5); // int+double = > double
		double a = 1000; //할당시 자동 형변환된다
		System.out.println(a); //double형으로 보여진다
		//
//		int b = 12.5; //에러
		int c =(int)12.5; // 강제 형변환
//		char d =66.6; //에러
		char e = (char)66.6; // 강제형변환
		System.out.println(c);
		System.out.println(e);
		
	}//main-end

}//class-end
