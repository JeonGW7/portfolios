package ch16_util;
import java.util.*;
//Vector�� ������ ����� �ִ� //Hashtable
//add() : ���Ϳ� ��ü �߰�
//get() : ���׿�� ���, �� ��ü ����
//size() : ���� ������ ����, �� �ڷ� ���� ����
//remove() : ���� ��� �����
public class Test07_Vector {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(); //��ü����
		String s1 = "hello1";
		String s2 = "hello2";
		String s3 = "hello3";
		String s4 = "hello4";
		String s5 = "hello5";
		String s6 = "hello6";
		//vec�� ��ü �ֱ�
		vec.add(s1); //index 0
		vec.add(s2); //index 1
		vec.add(s3); //index 2
		vec.add(s4); //index 3 ���� index3�� ����� index�� �ڵ����� �ް����� 
		vec.add(s5); //index 4
		vec.add(s6); //index 5
		
		System.out.println("��� ����:"+vec.size());
		System.out.println("index 3: "+vec.get(3));
		
		for(int i=0;i<vec.size();i++){
			System.out.println((String)vec.get(i));
		}
		System.out.println();
		vec.remove(1); //index 1 ���� 
		//Enumeration : ������ �ڷḦ ���� �� ���, ���� ���� ó���ȴ� 
		Enumeration en = vec.elements();
		while(en.hasMoreElements()){ //��Ұ� �ִµ��� �ݺ����� 	
			String s = (String)en.nextElement();
			System.out.println(s);
		}
	}//main-end
}//class-end
