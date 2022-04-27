package ch09_class;
//String class 사용한 예제
public class Test01 {

	public static void main(String[] args) {
		String str = "GoodAfternoon";
		//            012345678910 인덱스
		String s1 =str.substring(4); //index 5부터 끝까지 문자열 발췌
		System.out.println(s1);
		//
		String s2 = str.substring(4,9);//index 4부터 8까지 문자열 발췌 
		System.out.println(s2);
	}//main-end
}//class-end
