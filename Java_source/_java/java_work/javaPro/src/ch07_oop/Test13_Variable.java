package ch07_oop;
//static 변수를 잘못 사용한 예제 
class SangPum13{
	//전역변수=클래스변수=필드=프로터티=property
	private String pum; //품명
	private int su; //수량
	//private static int dan; //단가
	private int dan; //단가
	
	//생성자
	public SangPum13(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	
	//사용자 정의 메서드 
	public void disp(){
		System.out.println(pum+"--"+su+"--"+dan);
	}
}
public class Test13_Variable {
	public static void main(String[] args) {
		SangPum13 banana = new SangPum13("바나나", 1, 3500); //객체생성
		SangPum13 apple = new SangPum13("사과", 3, 6000);
		SangPum13 orange = new SangPum13("오렌지", 5, 3500);
		banana.disp();
		apple.disp();
		orange.disp();
	}//main-end
}//class-end
