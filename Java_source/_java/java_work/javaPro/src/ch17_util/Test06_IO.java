package ch17_util;
import java.util.Scanner;
public class Test06_IO {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է�>>");
		int age = scan.nextInt(); //�����Է¹ޱ�
		System.out.printf("����:%d\n",age);
		System.out.println();
		System.out.print("Ű�Է�>>");
		double ki = scan.nextDouble();
		System.out.printf("Ű:%6.1f\n",ki);
		scan.close();
	}
}
