package ch17_util;

public class Test16_String {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1==s2);//true ����ó�� ����� ���� ���ڿ��� ������ ���� �ּҸ� �����Ѵ�  

		String str1 = new String("abc"); //�ּҺ�(������)
		String str2 = new String("abc"); //�ּҺ�(������)
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//���ڿ���-true 
		System.out.println(str1.toString().equals(str2.toString())); //��ü�� ���ڿ��� ��ȯ - true
	}//main-end
}//class-end
