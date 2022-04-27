package ch00_baekjoon;
import java.util.Scanner;
public class baekjoon2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int hab = A*B*C;
		int arr[] = new int[10];
		while(hab>0){
			arr[hab%10]++;
			hab /= 10;
		}
		for(int s: arr){
			System.out.println(s);
		}	
	}
}
