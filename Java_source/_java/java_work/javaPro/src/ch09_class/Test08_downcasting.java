package ch09_class;
//downcasting
//강제형변환
class Super2{
	//사용자 정의 메서드
	public void disp(){
		System.out.println("슈퍼 클래스.disp() called");
	}
}//class-end
//파생클래스
class Sub2 extends Super2{
	//오버라이딩
	public void disp(){
		System.out.println("파생 클래스 disp() called");
	}
	//사용자 정의 메서드
	public void kk(){
		System.out.println("파생클래스.kk() called");
	}
}//class-end
public class Test08_downcasting {
	public static void main(String[] args) {
		Super2 s = new Super2();
		s.disp();
		//
		s = new Sub2(); //상위클래스 변수로 하위객체 처리, upcasting
		s.disp();
		((Sub2)s).kk(); //downcasting 
	}//main-end
}//class-end
