package ch00_baekjoon;
import java.util.Scanner;
public class baekjoon11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num = sc.next();
		sc.close();
		int arr[] = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			arr[i] = num.charAt(i)-'0';
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
