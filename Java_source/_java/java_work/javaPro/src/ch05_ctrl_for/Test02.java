package ch05_ctrl_for;

public class Test02 {
	public static void main(String[] args) {
		//1~10까지 짝수만 출력, if, for문 사용
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}//
		System.out.println();
		// 1~100까지 7의 배수 출력하기 if,for문사용
		for(int i=1;i<=100;i++){
			if(i%7==0){
				System.out.print(i+" ");
			}
		}
	}//main-end
}//class-end
