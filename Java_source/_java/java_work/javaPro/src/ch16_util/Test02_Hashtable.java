package ch16_util;
import java.util.*;
//HashTable 실습
//HashTable은 검색이 용이하다 
//HashTable은 스레드 기능이 있다 -> 장바구니에 사용
//ht.put() : 해쉬테이블에 넣을때 사용
//ht.get() : 해쉬테이블로부터 데이터를 얻을때 사용

public class Test02_Hashtable {
	public static void main(String[] args) {
		Hashtable<String,Object> ht = new Hashtable<String,Object>(); //객체생성
		ht.put("id", "park");
		ht.put("pw", "p12345");
		ht.put("addr", "Seoul");
		ht.put("email","abc@naver.com");
		ht.put("date", new java.util.Date());
		//
		System.out.println("갯수:"+ht.size());
		System.out.println(ht.get("id"));
		System.out.println(ht.get("pw"));
		System.out.println(ht.get("addr"));
		System.out.println(ht.get("email"));
		System.out.println(ht.get("date"));
	}//main-end
}//class-end
