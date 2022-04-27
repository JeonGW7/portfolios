package ch17_util;
//hashCode() : 자바 객체를 식별하는 해쉬코드를 리턴하는 메서드 
//모든 객체는 해쉬코드로 관리된다
//getClass() : 객체의 클래스이름을 Class형으로 리턴하는 메서드 
//toString() : 객체를 문자열로 반환 (java.util.Date(),StringBuffer에서 많이 사용)
class Demo{}
public class Test14_Object {
	public static void main(String[] args) {
		Demo A = new Demo();
		Demo B = new Demo();
		Demo C = new Demo();
		System.out.println("A클래스 이름:"+A.getClass());
		System.out.println("B클래스 이름:"+B.getClass());
		System.out.println("C클래스 이름:"+C.getClass());
		System.out.println();
		System.out.println("A해쉬 코드:"+A.hashCode());
		System.out.println("B해쉬 코드:"+B.hashCode());
		System.out.println("C해쉬 코드:"+C.hashCode());
		System.out.println();
		System.out.println("A객체 문자열:"+A.toString());
		System.out.println("B객체 문자열:"+B.toString());
		System.out.println("C객체 문자열:"+C.toString());
		System.out.println();
	}//main-end
}//class-end
