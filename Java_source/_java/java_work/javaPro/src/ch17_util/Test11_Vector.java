package ch17_util;
import java.util.*;
public class Test11_Vector {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();//��ü����
		vec.add("���븮");//index=0
		vec.add("����");//index=1
		vec.add("������");//index=2
		vec.add("������");//index=3
		vec.add("����");//index=4
		vec.add("������");//index=5
		System.out.println("�ڷ᰹�� size() : "+vec.size());
		//����for ���
		for(String s: vec){
			System.out.println(s);
		}
		System.out.println();
		//�Ϲ� for
		for(int i=0;i<vec.size();i++){
			System.out.println(vec.get(i));
		}
	}//main-end
}//class-end
