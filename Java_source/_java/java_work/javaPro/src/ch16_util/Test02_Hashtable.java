package ch16_util;
import java.util.*;
//HashTable �ǽ�
//HashTable�� �˻��� �����ϴ� 
//HashTable�� ������ ����� �ִ� -> ��ٱ��Ͽ� ���
//ht.put() : �ؽ����̺� ������ ���
//ht.get() : �ؽ����̺�κ��� �����͸� ������ ���

public class Test02_Hashtable {
	public static void main(String[] args) {
		Hashtable<String,Object> ht = new Hashtable<String,Object>(); //��ü����
		ht.put("id", "park");
		ht.put("pw", "p12345");
		ht.put("addr", "Seoul");
		ht.put("email","abc@naver.com");
		ht.put("date", new java.util.Date());
		//
		System.out.println("����:"+ht.size());
		System.out.println(ht.get("id"));
		System.out.println(ht.get("pw"));
		System.out.println(ht.get("addr"));
		System.out.println(ht.get("email"));
		System.out.println(ht.get("date"));
	}//main-end
}//class-end
