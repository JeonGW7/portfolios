package ch09_class;
//클래스 상속 예제
class PanMae{
	protected String pum;//보호필드=전역변수
	protected int su;
	protected int dan;
	//디폴트 생성자
	public PanMae(){}
	//인자가 있는 생성자
	public PanMae(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	//사용자 정의 메서드
	protected void disp(){
		System.out.println(pum+"--"+su+"--"+dan);
	}
}//class-end
//파생 클래스
class PanMaeSub extends PanMae{
	private double rate; //할인율, 전역변수
	//디폴트 생성자
	public PanMaeSub(){}
	//인자가 있는 생성자
	public PanMaeSub(String pum,int su,int dan,double rate){
		super(pum,su,dan); //상위클래스 생성자 호출
		this.rate = rate;
	}
	//오버라이딩:상속받은 메서드 내용 재정의
	public void disp(){
		System.out.println();
		System.out.println("품명:"+pum);
		System.out.println("수량:"+su);
		System.out.println("단가:"+dan);
		System.out.println("할인율:"+rate);
		System.out.println("10할인액:"+(dan*rate)+"원");
		System.out.println("할인가:"+(dan-(dan*rate))+"원");
	}
}
public class Test04_extends {

	public static void main(String[] args) {
		PanMaeSub clo = new PanMaeSub("패딩",1,250000,0.2);
		clo.disp();
	}//main-end
}//class-end
