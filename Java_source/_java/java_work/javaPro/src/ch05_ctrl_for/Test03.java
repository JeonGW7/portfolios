package ch05_ctrl_for;

public class Test03 {
	public static void main(String[] args) {
		//A B ... X Y Z 免仿
		//1锅规过
		for(int i=65;i<=90;i++){
			System.out.print((char)i+" ");
		}
		System.out.println();
		//2锅规过
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch+" ");
		}
		
	}//main-end
}//class-end
