package ch17_util;

public class Test17_String {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Good";
		
		System.out.println("문자열 길이,문자열 갯수:"+s1.length());
		System.out.println("문자열 길이,문자열 갯수:"+s2.length());
		
		String s3 = s1.concat(s2);//문자열 합치기
		System.out.println(s3);
		//
		String s4 = "banana"; //a를 e로 치환(replace)
		System.out.println(s4.replace('a', 'e'));
		//
		String s5 = "아이유는 노래도 잘하고 연기도 잘하고 한다네요";//아이유를 임영웅으로 치환하기 
		System.out.println(s5.replace("아이유", "임영웅"));
		//
		String s6 = "GoodAfternoon";
		System.out.println(s6.toLowerCase());//모두 소문자로 변환
		System.out.println(s6.toUpperCase());//모두 대문자로 변환 
	}//main-end
}//class-end
