package ch00_baekjoon;
import java.util.Scanner;
public class baekjoon1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int count = 0;
		int copy = N;
		while(true){
			N = ((N%10)*10)+(((N/10)+(N%10))%10);
			count++;
			if(copy==N){
				break;
			}
		}
		System.out.println(count);
	}
}
