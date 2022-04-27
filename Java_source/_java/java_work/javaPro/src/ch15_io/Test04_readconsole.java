package ch15_io;
import java.io.*;
//System.in은 InputStream의 객체이기때문에 
//InputStreamReader 생성자 인수로 전달된다 //new InputStreamReader(System.in)
//그런다음에 InputStreamReader 객체가 BufferedReader 생성자 인수로 전달된다 
//이런 방법을 거쳐서 키보드로부터 값을 입력 받는다
//new BufferedReader(new InputStreamReader(System.in))
public class Test04_readconsole {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어점수>>");
		String strKor = br.readLine();
		int kor = Integer.parseInt(strKor);
		System.out.print("영어점수>>");
		String strEng = br.readLine();
		int eng = Integer.parseInt(strEng);
		int sum = kor+eng;
		System.out.println("합:"+sum);
	}//main-end
}//class-end
