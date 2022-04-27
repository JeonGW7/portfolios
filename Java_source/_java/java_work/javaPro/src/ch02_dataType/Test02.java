package ch02_dataType;
//기본자료형 : boolean (1bit)
//기본자료형 : byte(1) char(2) short(2) int(4) long(8)
//기본자료형 : float(4) double(8)
//무치형 : void
//
//레퍼런스 자료형 : 클래스, 인터페이스, 배열 : heap영역에 메모리 할당
//
//변수 또는 변수명 또는 방이름 : 메모리를 할당 받아 그 이름을 부여하는 것 
public class Test02 {

	public static void main(String[] args) {
		byte a1=127; //최대값 대입 (-128~+127)
//		byte a1 = 128; //에러발생
		char a3 = 65; //아스키 코드값 'A'
		char a4 = 'B'; //아스키 문자 
		System.out.println(a1);
		System.out.println(a3);
		System.out.println(a4);
		//
		short a5 = 32767; //-32768 ~ + 32767
		int a6 = 2147483647; //-2147483648~+2147483647
		long a7 = Long.MAX_VALUE; //long의 최대값
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7); 
		//
		float a8 = 12.123456789012345f; // 정밀도가 낮음
		double a9 = 12.123456789012345; // double - default , 정밀도가 높음 
		double a10 = 12.123456789012345d; // double 
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		
		
		
	}//main-end

}//class-end
