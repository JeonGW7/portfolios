package ch10_interface_abs;
abstract class Abc{
	abstract public void aa();//추상메서드
	public void bb(){//일반메서드
		System.out.println("추상클래스.bb()일반메서드 called");
	}
}//class-end
class Mbc extends Abc{
	//오버라이딩
	public void aa(){
		System.out.println("추상메서드 aa()추상메서드 called");
	}
}
public class Test04_abs {
	public static void main(String[] args) {
		Abc abc = new Mbc();//상위클래스 변수로 하위 객체 처리
		abc.aa();
		abc.bb();
	}//main-end
}//class-end
