package ch00_baekjoon;
import java.util.Scanner;
public class baekjoon1065 {
	public static int hansu(int num){
		int cnt = 0;
		if(num<100){
			return num;
		}else{
			cnt =99;
			if(num==1000){
				num=999;
			}
			for(int i=100;i<=num;i++){
				int x = i/100;
				int y = (i/10)%10;
				int z = i%10;
				if((x-y)==(y-z)){
					cnt++;
				}
			}
		}
		
		return cnt;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(hansu(sc.nextInt()));
		sc.close();
		
	}

}
