package ch17_util;
import java.util.*;
//Set:�������̽�
//HashSet: Ŭ����
public class Test08_set {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//��ü����
		set.add("�ѹ���");
		set.add("�λ��");
		set.add("�λ��");
		set.add("�λ��");
		set.add("�ѹ���");
		System.out.println("size() ����:"+set.size());
		System.out.println();
		//����for
		for(String s:set){
			System.out.println(s);
		}
		System.out.println();
		//
		Iterator iter = set.iterator();
		while(iter.hasNext()){ //�ڷᰡ �ִ� ���� �ݺ� ����
			System.out.println(iter.next());
		}
	}//main-end
}//class-end
