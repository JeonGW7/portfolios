package ch17_util;
import java.util.Scanner;
public class Test07_IO {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //��ü����
		System.out.print("�̸��Է�>>");
		String name = scan.next(); //���ڿ� �Է�
		System.out.print("�����Է�>>");
		int age = scan.nextInt();//���� �Է�
		System.out.print("Ű�Է�>>");
		double ki = scan.nextDouble();//�Ǽ� �Է�
		System.out.printf("�̸�\t����\tŰ\n");
		System.out.printf("%s\t%d\t%5.1f\n",name,age,ki);
		scan.close();
	}//main-end
}//class-end
