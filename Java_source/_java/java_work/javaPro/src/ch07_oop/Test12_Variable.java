package ch07_oop;
//static변수는 그 클래스의 모든 객체가 공유한다 
//static변수 잘 사용한 예

class SingSang12{
	//전역변수
	private String name;
	private int age;
	private static int sungin=20;
	//생성자: 객체 초기화가 목적이다
	public SingSang12(String name,int age){
		this.name = name;
		this.age = age;
	}//cons-end
	//사용자 정의 메서드
	public void disp(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		if(age>=sungin){
			System.out.println("성인");
		} else if(age<sungin){
			System.out.println("미성년자");
		}
		System.out.println();//line-skip
	}//disp()-end
}//class-end
public class Test12_Variable {

	public static void main(String[] args) {
		SingSang12 yim = new SingSang12("임영웅", 32); //객체생성
		SingSang12 jung = new SingSang12("정동원", 15); //객체생성
		SingSang12 lee = new SingSang12("이동국", 43); //객체생성
		yim.disp();
		jung.disp();
		lee.disp();
	}//main-end
}//class-end
