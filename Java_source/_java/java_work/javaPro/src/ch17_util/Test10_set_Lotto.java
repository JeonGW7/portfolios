package ch17_util;
import java.util.*;
public class Test10_set_Lotto {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //��ü����
		while(set.size()<6){
			int a =(int)(Math.random()*45+1); //�ζǹ�ȣ�߻�
			set.add(a+"");//����+"" ���ڸ� ���ڿ��� ��ȯ 
		}
		//���
		for(String s: set){
			System.out.print(s+" ");
		}
	}

}
