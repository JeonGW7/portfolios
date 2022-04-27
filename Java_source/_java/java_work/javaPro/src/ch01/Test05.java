package ch01;
//하나의 프로그램에는 여러개의 클래스를 넣을 수 있다
//저장이름은 : 주 클래스로 한다. main()이 소속된 클래스가 주 클래스이다
//주 클래스는 반드시 public 접근 제한자를 사용해야한다
public class Test05 {
	public static void main(String[] args) {
		//외부 클래스 사용, 객체 생성하고 객체.method() 
		Demo5 d5 = new Demo5(); //객체 생성
		d5.aa();
	}//main-end
}//class-end

class Demo5{
	public void aa(){
		System.out.println("aa() called");
	}
}