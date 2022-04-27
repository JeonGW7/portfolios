package ch17_util;
import java.util.*;
//Map, HashMap
//HashMap은 스레드 기능이 없다
//----------------------
//	key		value
//----------------------
//	"id"	"kim"
//	"pw"	"k123"
//	"name"	"홍길동"
//----------------------

public class Test13_HashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();//객체생성
		map.put("id", "kim");
		map.put("pw", "k123");
		map.put("name", "홍길동");
		map.put("date", new java.util.Date().toString()); 
		// new java.util.Date().toString()
		// StringBuffer >> sb.toString()
		// 객체.toString() : 객체를 문자열로 변환 
		//
		//출력
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("name"));
		System.out.println(map.get("date"));
		
	}//main-end
}//class-end
