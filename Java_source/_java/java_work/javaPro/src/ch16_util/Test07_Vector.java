package ch16_util;
import java.util.*;
//Vector는 스레드 기능이 있다 //Hashtable
//add() : 벡터에 객체 추가
//get() : 백테요소 얻기, 즉 객체 리턴
//size() : 벡터 사이즈 리턴, 즉 자료 갯수 리턴
//remove() : 벡터 요소 지우기
public class Test07_Vector {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(); //객체생성
		String s1 = "hello1";
		String s2 = "hello2";
		String s3 = "hello3";
		String s4 = "hello4";
		String s5 = "hello5";
		String s6 = "hello6";
		//vec에 개체 넣기
		vec.add(s1); //index 0
		vec.add(s2); //index 1
		vec.add(s3); //index 2
		vec.add(s4); //index 3 만약 index3을 지우면 index는 자동으로 메겨진다 
		vec.add(s5); //index 4
		vec.add(s6); //index 5
		
		System.out.println("요소 갯수:"+vec.size());
		System.out.println("index 3: "+vec.get(3));
		
		for(int i=0;i<vec.size();i++){
			System.out.println((String)vec.get(i));
		}
		System.out.println();
		vec.remove(1); //index 1 삭제 
		//Enumeration : 나열형 자료를 받을 때 사용, 순서 없이 처리된다 
		Enumeration en = vec.elements();
		while(en.hasMoreElements()){ //요소가 있는동안 반복수행 	
			String s = (String)en.nextElement();
			System.out.println(s);
		}
	}//main-end
}//class-end
