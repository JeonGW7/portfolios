package ch03_oper;

public class Test06 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "yes";
		System.out.println(str.equals("yes")); //true
		System.out.println(str.equals("Yes")); //false
		System.out.println(str.equals("YES")); //false
		//
		System.out.println(str.equalsIgnoreCase("Yes")); //true
		System.out.println(str.equalsIgnoreCase("YES")); //true
		System.out.println();
		//��ü ��
		String s1 = new String("abc");
		Object ob = new Object();
		
		//��ü instanceof Ŭ���� 
		//������ Ŭ������ ���� ��ü���� ũ�ų� ������ true 
		 System.out.println(str instanceof String);//true
		 System.out.println(str instanceof Object);//true
		 System.out.println(ob instanceof Object);//true
		 System.out.println(ob instanceof String);//false
		   
		
	}//main-end

}//class-end
