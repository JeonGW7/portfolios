package ch00_baekjoon;
import java.util.Scanner;
public class baekjoon8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int hab = 0;
		for(int i=1;i<=n;i++){
			hab += i;
		}
		System.out.println(hab);
		scan.close();
	}

}
