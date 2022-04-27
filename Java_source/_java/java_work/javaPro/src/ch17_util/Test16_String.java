package ch17_util;

public class Test16_String {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1==s2);//true 변수처럼 사용할 때는 문자열이 같으면 같은 주소를 참조한다  

		String str1 = new String("abc"); //주소비교(참조비교)
		String str2 = new String("abc"); //주소비교(참조비교)
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//문자열비교-true 
		System.out.println(str1.toString().equals(str2.toString())); //객체를 문자열로 변환 - true
	}//main-end
}//class-end
