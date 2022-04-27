package ch00_baekjoon;
import java.util.Scanner;
public class baekjoon10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int arr[] = new int[T];
		for(int i=0;i<T;i++){
			int A = scan.nextInt();
			int B = scan.nextInt();
			arr[i] = A+B;
		}
		scan.close();
		for(int s : arr){
			System.out.println(s);
		}
	}

}
