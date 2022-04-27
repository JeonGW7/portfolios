package ch08_const;

class SinSang{
	String name; //전역변수=클래스변수=필드=property
	int age;
	double ki;
	//default 생성자
	public SinSang(){}
	//인자 있는 생성자
	public SinSang(String name,int age,double ki){
		this.name = name;
		this.age = age;
		this.ki = ki;
	}
	public SinSang(int age,String name,double ki){
		this.name = name;
		this.age = age;
		this.ki = ki;
	}
	//사용자 정의 메서드
	public void disp(){
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("키:"+ki);
	}
}

public class Test02_cons {
	public static void main(String[] args) {
		SinSang kim = new SinSang("김제동",45,170.7);
		SinSang yim = new SinSang(32,"임영웅",182.7);
		kim.disp();
		yim.disp();
	}//main-end
}//class-end
