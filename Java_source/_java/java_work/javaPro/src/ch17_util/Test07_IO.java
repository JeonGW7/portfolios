package ch17_util;
import java.util.Scanner;
public class Test07_IO {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //객체생성
		System.out.print("이름입력>>");
		String name = scan.next(); //문자열 입력
		System.out.print("나이입력>>");
		int age = scan.nextInt();//정수 입력
		System.out.print("키입력>>");
		double ki = scan.nextDouble();//실수 입력
		System.out.printf("이름\t나이\t키\n");
		System.out.printf("%s\t%d\t%5.1f\n",name,age,ki);
		scan.close();
	}//main-end
}//class-end
