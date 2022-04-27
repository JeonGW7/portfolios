package ch01;
//재귀 호출은 자기 자신의 매서드를 호출 하는 것
public class Test07 {

	public static void main(String[] args) {
		Test07 t7 = new Test07();//객체생성
		t7.aa(); // 객체.메서드()
	}//main-end
	public void aa(){
		System.out.println("aa()");
		aa(); // 자신의 메서드 호출
	}
}//class-end
