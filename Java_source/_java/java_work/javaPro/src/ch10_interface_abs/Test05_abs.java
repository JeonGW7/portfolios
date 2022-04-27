package ch10_interface_abs;
//추상클래스 예제
abstract class Abs{
	String name;//변수
	public Abs(String name){ //셍성자
		this.name = name;
	}
	//일반메서드
	public void aa(){
		System.out.println("추상클래스 안의 일반 메서드 aa() called ");
	}
	//추상메서드
	abstract public void disp();
}
public class Test05_abs extends Abs{
	//생성자 
	public Test05_abs(String name) {
		super(name);
	}
	//오버라이딩
	public void disp(){
		System.out.println("추상클래스안의 추상메서드 disp() called ");
		System.out.println("이름:"+name);
	}
	public static void main(String[] args) {
		Abs abs = new Test05_abs("아이유");//상위클래스 변수로 하위 객체 처리 
		abs.aa();
		abs.disp();
	}//main-end
}//class-end
