package ch07_oop;
//전역변수 : 자동으로 초기화 된다, 클래스 안에, 메서드 밖에서 선언
//지역변수 : 자동으로 초기화 안된다. 메서드 안에서 선언 
class SinSang{
	String name; //전역변수는 그 클래스 안의 모든 메서드에서 사용 가능하다 
	int age;
	double ki;
	//사용자 정의 메서드
	public void setData(String name,int age,double ki){
		//this.전역변수 = 매개변수
		this.name = name;
		this.age = age;
		this.ki = ki;
	}
	//사용자 정의 메서드
	public void disp(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키: "+ki);
	}
}//class-end---
public class Test08_variable {
	public static void main(String[] args) {
		SinSang ss = new SinSang();//객체 생성
		ss.setData("임영웅", 32, 182.7);
		ss.disp();//출력
		//
		ss.setData("박진우", 3, 100);
		ss.disp();
		//
	}//main-end
}//class-end
