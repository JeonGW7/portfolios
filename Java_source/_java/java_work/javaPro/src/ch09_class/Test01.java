package ch09_class;
//String class ����� ����
public class Test01 {

	public static void main(String[] args) {
		String str = "GoodAfternoon";
		//            012345678910 �ε���
		String s1 =str.substring(4); //index 5���� ������ ���ڿ� ����
		System.out.println(s1);
		//
		String s2 = str.substring(4,9);//index 4���� 8���� ���ڿ� ���� 
		System.out.println(s2);
	}//main-end
}//class-end
