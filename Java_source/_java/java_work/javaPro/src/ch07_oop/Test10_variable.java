package ch07_oop;
//전역변수 : 자동으로 초기화 된다, 클래스 안에, 메서드 밖에서 선언
//지역변수 : 자동으로 초기화 안된다. 메서드 안에서 선언 
public class Test10_variable {
	int x; //전역변수
	double y;
	String irum;
	@SuppressWarnings("unused")
	public void aa(){
		int a;
		double b;
		String name;
//		System.out.println("a:"+a); //초기화가 되지않아 에러
//		System.out.println("b:"+b);
//		System.out.println("name:"+name);
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("irum:"+irum);
	}
	public static void main(String[] args) {
		Test10_variable t = new Test10_variable();//객체생성
		t.aa();
	}//main-end
}//class-end
