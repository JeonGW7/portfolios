package ch16_util;
//����Ŭ���� �ǽ� ����
import java.util.*;
public class Test01_wrapper {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		boolean b = true;
		Boolean B = new Boolean(b); //��ü����
		
		int c = 100;
		Integer C = new Integer(c); //��ü ����
		
		double d = 12.5; //�⺻�ڷ���
		Double D = new Double(d); //��ü ����
		
		//��ü �ڷ����� ���ڿ��� ��ȯ�ϴ� �޼��� : toString()
		//toString()�޼���� Object���� �����Ѵ�
		System.out.println(B.toString());
		System.out.println(C.toString());
		System.out.println(D.toString());
		//====================================
		//Vector �ڷ������� ��üŸ�Ը� ���� 
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
