package ch08_const;
class SuperCons{
	String title;
	int num;
	//디폴트 생성자
	public SuperCons(){}
	//인자 있는 생성자
	public SuperCons(String title,int num){
		this.title = title;
		this.num = num;
	}
	//사용자 정의 메서드
	public void disp(){
		System.out.println("슈퍼 클래스");
		System.out.println(title+"-"+num);
		System.out.println();
	}
}//class-end----
//파생클래스=하위클래스
class Subcons extends SuperCons{
	//생성자
	public Subcons(){
		super("abc",100);//상위클래스 생성자 호출
	}
}//class-end
public class Test05_super {

	public static void main(String[] args) {
		Subcons sub = new Subcons();
		sub.disp();
	}//main-end
}//class-end
