package ch17_util;
import java.util.*;
//Map, HashMap
//HashMap�� ������ ����� ����
//----------------------
//	key		value
//----------------------
//	"id"	"kim"
//	"pw"	"k123"
//	"name"	"ȫ�浿"
//----------------------

public class Test13_HashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();//��ü����
		map.put("id", "kim");
		map.put("pw", "k123");
		map.put("name", "ȫ�浿");
		map.put("date", new java.util.Date().toString()); 
		// new java.util.Date().toString()
		// StringBuffer >> sb.toString()
		// ��ü.toString() : ��ü�� ���ڿ��� ��ȯ 
		//
		//���
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("name"));
		System.out.println(map.get("date"));
		
	}//main-end
}//class-end
