package ch07_oop;
//리턴값이 있는 메소드 연습
//접근제한자-리턴형(자료형)-메소드이름(){처리내용;}
public class Test03_method {
	public int aa(){
		System.out.println("aa() called~");
		return 100;
	}
	public double bb(){
		System.out.println("bb() called~");
		return 12.5;
	}
	public String getName(){
		System.out.println("getName() called");
		return "홍길동";
	}
	//main은  누구에 의해서 호출 되어지는지 쓰시오: JVM 
	public static void main(String[] args) {
		Test03_method t = new Test03_method(); //객체생성(heap영역에 메모리 할당), 생성자 호출
		double d = t.bb();
		System.out.println("d: "+d);
		//
		System.out.println(t.bb());
		//
		System.out.println(t.aa());
		//
		System.out.println(t.getName());
	}//main-end
}//class-end
