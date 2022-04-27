package ch17_util;
import java.util.Scanner;
public class Test06_IO {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이입력>>");
		int age = scan.nextInt(); //정수입력받기
		System.out.printf("나이:%d\n",age);
		System.out.println();
		System.out.print("키입력>>");
		double ki = scan.nextDouble();
		System.out.printf("키:%6.1f\n",ki);
		scan.close();
	}
}
