package ch09_class;
//upcasting
//상위클래스 변수로 하위 객체 처리하는 것

class PanMae2{
	protected String pum;
	protected int su;
	protected int dan;
	
	//디폴트 생성자
	public PanMae2(){}
	//인자있는 생성자
	public PanMae2(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	//사용자 정의 메서드 
	public void disp(){
		System.out.println(pum+"--"+su+"--"+dan);
	}
}//class-end---
//파생클래스
class SalePanMae extends PanMae2{
	private double rate; //할인율
	// 디폴트 생성자
	public SalePanMae(){}
	// 인자 있는 생성자
	public SalePanMae(String pum,int su,int dan,double rate){
		super(pum,su,dan); //상위 클래스의 생성자 호출 
		this.rate = rate;
	}
	//오버라이딩 : 상속받은 메서드 내용 재정의 
	public void disp(){
		System.out.println();
		System.out.println("pum: "+pum);
		System.out.println("su: "+su);
		System.out.println("dan: "+dan);
		System.out.println("할인가: "+(int)(dan-(dan*rate)));
	}
}//class-end---
public class Test07_upcasting {
	public static void main(String[] args) {
		PanMae2 p = new PanMae2("한우국밥",1,5000);
		p.disp();
		//
		//상위클래스 변수로 하위 객체처리 : 메모리 절약 효과가 있음
		p = new SalePanMae("해물순두부찌개", 1, 7000, 0.2);
		p.disp();
	}//main-end
}//class-end
