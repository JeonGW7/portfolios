package ch05_ctrl_for;
//continue: 다시 반복 loop를 수행하게 한다

public class Test10_continue {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			if(i%2 !=0){//홀수이면
				continue; //다시 반복loop를 수행한다.
			}
			System.out.print(i+" "); //짝수만 출력
		}
	}//main-end
}//class-end
