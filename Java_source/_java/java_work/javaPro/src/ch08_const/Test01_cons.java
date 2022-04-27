package ch08_const;
/**
1.생성자는 클래스이름과 같다 
2.생성자는 리턴형이 없다. 필드(객체)초기화가 목적이다 
3.인수를 갖는다 -> 오버로드가 가능하다 
4.객체생성시 호출된다
*/
class Sung{
	String name;
	int kor;
	//디폴트 생성자
	public Sung(){
//		System.out.println("default 생성자");
		name="";
		kor=0;
	}
	//인자 있는 생성자
	public Sung(String name,int kor){
//		System.out.println("인자 있는 생성자");
		this.name = name;
		this.kor = kor;
	}
	//사용자 정의 메서드
	public void disp(){
		System.out.println("이름:"+name);
		System.out.println("국어점수:"+kor);
		System.out.println();
	}
}//class-end
public class Test01_cons {
	public static void main(String[] args) {
//		new Sung();//디폴트 생성자 호출
//		new Sung("kim",88);//인자있는 생성자 호출
		Sung kim = new Sung("kim",88); //객체생성,생성자 호출 
		Sung lee = new Sung("lee",99);
		Sung park = new Sung("park",100);
		kim.disp();
		lee.disp();
		park.disp();
	}//main-end
}//class-end
