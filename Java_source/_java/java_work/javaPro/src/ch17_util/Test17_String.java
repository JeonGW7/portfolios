package ch17_util;

public class Test17_String {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Good";
		
		System.out.println("���ڿ� ����,���ڿ� ����:"+s1.length());
		System.out.println("���ڿ� ����,���ڿ� ����:"+s2.length());
		
		String s3 = s1.concat(s2);//���ڿ� ��ġ��
		System.out.println(s3);
		//
		String s4 = "banana"; //a�� e�� ġȯ(replace)
		System.out.println(s4.replace('a', 'e'));
		//
		String s5 = "�������� �뷡�� ���ϰ� ���⵵ ���ϰ� �Ѵٳ׿�";//�������� �ӿ������� ġȯ�ϱ� 
		System.out.println(s5.replace("������", "�ӿ���"));
		//
		String s6 = "GoodAfternoon";
		System.out.println(s6.toLowerCase());//��� �ҹ��ڷ� ��ȯ
		System.out.println(s6.toUpperCase());//��� �빮�ڷ� ��ȯ 
	}//main-end
}//class-end
