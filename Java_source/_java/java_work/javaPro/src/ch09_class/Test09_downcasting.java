package ch09_class;
class PanMae3{
	protected String pum;
	protected int su;
	protected int dan;
	//디폴트 생성자
	public PanMae3(){}
	//인자 있는 생성자
	public PanMae3(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	//사용자 정의 메서드 
	public void disp(){
		System.out.println(); 
		System.out.println(pum+"--"+su+"--"+dan);
	}
}//class-end
//파생클래스
class SalePanMae3 extends PanMae3{
	private double rate;//할인율
	//디폴트 생성자
	public SalePanMae3(){}
	//인자있는 생성자
	public SalePanMae3(String pum,int su,int dan,double rate){
		super(pum,su,dan); //상위클래스 생성자 호출
		this.rate = rate;
	}
	//오버라이딩
	public void disp(){
		System.out.println();
		System.out.println("pum: "+pum);
		System.out.println("su: "+su);
		System.out.println("dan: "+dan);
	}
	//사용자 정의 메서드
	public void halinAk(){
		System.out.println("할인액: "+(dan*rate));
	}
	
}//class-end
public class Test09_downcasting {
	public static void main(String[] args) {
		PanMae3 p[] = new PanMae3[4]; //배열생성
		p[0] = new PanMae3("비빔밥",3,6000);
		p[1] = new SalePanMae3("설렁탕",5,8000,0.2);
		p[2] = new PanMae3("인도카레",2,9000);
		p[3] = new SalePanMae3("갈비탕",1,12000,0.2);
		for(int i=0;i<p.length;i++){
			p[i].disp();
			if(p[i] instanceof SalePanMae3){
				((SalePanMae3)p[i]).halinAk();
			}
		}
	}//main-end
}//class-end
