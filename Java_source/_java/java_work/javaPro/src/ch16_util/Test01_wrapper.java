package ch16_util;
//래퍼클래스 실습 예제
import java.util.*;
public class Test01_wrapper {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		boolean b = true;
		Boolean B = new Boolean(b); //객체생성
		
		int c = 100;
		Integer C = new Integer(c); //객체 생성
		
		double d = 12.5; //기본자료형
		Double D = new Double(d); //객체 생성
		
		//객체 자료형을 문자열로 변환하는 메서드 : toString()
		//toString()메서드는 Object에서 제공한다
		System.out.println(B.toString());
		System.out.println(C.toString());
		System.out.println(D.toString());
		//====================================
		//Vector 자료형에는 객체타입만 들어간다 
		Vector vec = new Vector();
		vec.add(new Integer(123));
		vec.add(B); // Boolean
		vec.add(D); // Double 
		int a1 = (Integer)vec.get(0);
		boolean b1 = (Boolean)vec.get(1);
		double d1 = (Double)vec.get(2);
		System.out.println("a1:"+a1);
		System.out.println("b1:"+b1);
		System.out.println("d1:"+d1);
		
	}//main-end
}//class-end
