package ch07_oop;
//static 메서드는 static 선언된 변수,메서드만 사용(호출)가능하다
//static 메서드에서는 this사용 못한다(이미 클래스에 소속되어 있기 때문)
//this:자신의 객체를 뜻한다
//static메서드는 객체생성 하지 않고 호출가능하다 : 클래스.method : Math.max(55.33)
public class Test11_static_Variable {
	static int b = 100;
	public static void aa(){
		System.out.println("aa() called");
	}
	public static void main(String[] args) {
		aa();
		System.out.println("b:"+b);
//		this.b=700;//static안에서 this사용불가
		System.out.println(Math.max(100, 90));
		System.out.println(Math.min(100, 90));
		System.out.println(Math.abs(-8));
		System.out.println(Math.PI);
		System.out.println(Math.ceil(7.1));//올림값
		System.out.println(Math.floor(5.7));//내림값
		System.out.println(Math.round(7.1));//사사오입 5이상은 올림
		System.out.println(Math.round(5.7));//사사오입  5미만은 내림 
	}

}
