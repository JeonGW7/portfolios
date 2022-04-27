package ch08_const;
//this() : 자신의 클래스 안의 생성자 호출
class Cons{
	String title;
	int num;
	//디폴트 생성자
	public Cons(){}
	//인자 있는 생성자
	public Cons(String title){
		this(title,100);//자신의 클래스 안에 있는 생성자 호출
	}
	//인자 있는 생성자
	public Cons(String title, int num) {
		this.title = title;
		this.num = num;
	}
	//사용자 정의 메소드
	public void disp(){
		System.out.println("title: "+title);
		System.out.println("num: "+num);
		System.out.println();
	}
}//class-end--
public class Test03_this {
	public static void main(String[] args) {
		Cons c1 = new Cons("연습1");
		c1.disp();
		//
		Cons c2 = new Cons("연습2",200);
		c2.disp();
	}//main-end
}//class-end
