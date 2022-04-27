package ch16_util;
import java.util.*;

//StringTokenizer : 문자열 파싱 하는 기능이 있다
//메서드
//nextToken() : 파싱된 문자열을 차례로 반환(리턴)해준다
//hasMoreTokens() : nextToken()한 뒤에 Token이 남아 있는지 여부 확인 
//countTokens() : 토큰 갯수 리턴

public class Test08_StringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("김떡순|짬짜면|순대국|샌드위치|김밥","|"); // |은 분리기호
		System.out.println("파싱된 문자열 총 개수:"+st.countTokens());
		while(st.hasMoreTokens()){ //토큰이 있는 동안 반복 수행
			System.out.println(st.nextToken()); //파싱된 문자열을 차례로 리턴해준다 
		}//while-end
		System.out.println();
		//---------------------
		//String.split()
		//---------------------
		String str = "서울시:마포구:대흥동 ";
		String temp[] = str.split(":"); //문자열 파싱 |같은 특수문자로는 파싱불가능 
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}//main-end
}//class-end
