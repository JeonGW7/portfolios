package ch16_util;
//StringBuffer : 동적문자열 처리
public class Test05_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //객체생성
		System.out.println("capacity 용량:"+sb.capacity());
		sb.append("Hello");
		sb.append("Good");
		sb.append("Very");
		sb.append("Hello");
		sb.append("Good");
		System.out.println(sb.toString());
		System.out.println("문자열 갯수,길이: "+sb.length());
		System.out.println("capacity 용량:"+sb.capacity());
		//
		//역순으로
		sb.reverse();
		System.out.println(sb.toString());
		//역순
		sb.reverse();
		sb.delete(0, 5); //index 5직전까지 삭제
		System.out.println(sb);
	}//main-end
}//class-end
