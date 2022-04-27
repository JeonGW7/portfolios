package ch09_class;

class PersonSuper{
	protected String name;
	//디폴트 생성자
	public PersonSuper(){}
	//인자 있는 생성자
	public PersonSuper(String name){
		this.name = name;
	}
	//사용자 정의 메서드
	public void disp(){
		System.out.println("이름: "+name);
	}
}//class-end
//파생클래스
class PersonSub extends PersonSuper{
		private double left_eye;//왼쪽 시력
		private double right_eye;//오른쪽 시력
		//디폴트 생성자
		public PersonSub(){}
		//인자있는 생성자
		public PersonSub(String name,double left_eye,double right_eye){
			super(name); //슈퍼 클래스 생성자 호출
			this.left_eye = left_eye;
			this.right_eye = right_eye;
		}
		//오버라이딩: 상속받은 메서드 내용 재정의
		public void disp(){
			System.out.println("이름: "+name);
			System.out.println("왼쪽 시력: "+left_eye);
			System.out.println("오른쪽 시력: "+right_eye);
		}
}//class-end
//파생클래스
class PersonSin extends PersonSuper{
		private String addr;
		private String tel;
		//디폴트 생성자
		public PersonSin(){}
		//인자있는 생성자
		public PersonSin(String name,String addr,String tel){
			super(name);
			this.addr = addr;
			this.tel = tel;
		}
		//오버라이딩: 상속받은 메서드 내용 재정의
		public void disp(){
			System.out.println("이름: "+name);
			System.out.println("주소: "+addr);
			System.out.println("전화번호: "+tel);
		}
}//class-end
public class Test05_extends {

	public static void main(String[] args) {
		PersonSub sub = new PersonSub("이효리",1.2,1.5);
		sub.disp();
		System.out.println();
		PersonSin sin = new PersonSin("유재석","서울","010-1234-5678");
		sin.disp();
	}//main-end
}//class-end
