package ch07_oop;

public class Test02_method {
	//사용자정의 메서드
	public void aa(){
		System.out.println("aa() called");
	}
	public void bb(){
		System.out.println("bb() called");
	}
	
	public static void main(String[] args) {
		Test02_method t2 = new Test02_method(); // 객체생성, 생성자 
		t2.aa();
		t2.bb(); //bb()호출하고 >> 제어권이 넘어가서 >> bb() {내용을}처리하고 } 닫는 괄호를 만나면 호출했던 곳으로 되돌아 온다 
	}//main-end

}//class-end
