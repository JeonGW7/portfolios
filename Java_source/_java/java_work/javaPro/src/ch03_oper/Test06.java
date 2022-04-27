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
		//객체 비교
		String s1 = new String("abc");
		Object ob = new Object();
		
		//객체 instanceof 클래스 
		//오른쪽 클래스가 왼쪽 객체보다 크거나 같으면 true 
		 System.out.println(str instanceof String);//true
		 System.out.println(str instanceof Object);//true
		 System.out.println(ob instanceof Object);//true
		 System.out.println(ob instanceof String);//false
		   
		
	}//main-end

}//class-end
