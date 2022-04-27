package ch17_util;
//clone() : 객체 복사
//toString() : 오버라이딩

public class Test15_clone implements Cloneable {
	//변수
	String name;
	//생성자
	public Test15_clone(String name){
		this.name = name;
	}
	//메서드 : 오버라이딩
	public String toString(){
		return name+"입니다";
	}
	
	//main
	public static void main(String[] args) {
		try{
		Test15_clone ob1 = new Test15_clone("아이유");//객체생성
		System.out.println(ob1);
		System.out.println(ob1.toString());
		Double D = new Double(55.5); //객체 생성
		System.out.println(D);
		System.out.println(D.toString());
		System.out.println();
		//객체복사
		
		Test15_clone ob2 = (Test15_clone)ob1.clone();//객체복사, 예외처리 필요
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		//ob1,ob2 비교
		System.out.println(ob1==ob2);//false
		System.out.println(ob1 != ob2);//true
		System.out.println(ob1.toString().equals(ob2.toString()));//문자열 비교이기 때문에 true 
		}catch(Exception ex){
			System.out.println(ex);
		}
		
	}//main-end
}//class-end
