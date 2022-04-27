package ch02_dataType;
//Integer.parseInt("123") : 문자열을 정수로 변환
// 123+"" : 숫자를 문자열로 변환 
public class Test03 {

	public static void main(String[] args) {
		String str = "123";
		String str2 = "456";
		int a =Integer.parseInt(str); //문자열을 정수로 전환
		int b =Integer.parseInt(str2); 
		int s = a+b;
		System.out.println(s);
		System.out.println(str+str2); //문자열 연결,연산은 안된다 
		//
		// 숫자를 문자열로 변환
		int c =123;
		String str3 = c+""; // 문자열로 변환
		System.out.println(c+c);//연산
		System.out.println(str3+str3);//문자열 연결
	}//main-end

}//class-end
