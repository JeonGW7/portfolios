package ch10_interface_abs;

interface AA{
	int MAX=100; //static final int MAX=100;
	public void aa();
	public void bb();
}
class AAA implements AA{
	//오버라이딩
	public void aa(){
		System.out.println("MAX:"+MAX);
		//MAX=1000;//값변경 불가능
		System.out.println("aa() called~~");
	}
	public void bb(){
		System.out.println("bb() called~~");
	}
}
public class Test01_interface {
	public static void main(String[] args) {
		AA A = new AAA(); //상위 클래스 변수로 하위 객체 처리
		A.aa();
		A.bb();
	}
	
}
