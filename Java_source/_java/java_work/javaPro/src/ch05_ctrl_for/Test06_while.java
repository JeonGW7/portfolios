package ch05_ctrl_for;

public class Test06_while {

	public static void main(String[] args) {
		//while문으로 "오늘은 화요일" 5번 출력하기
		int i =1; //초기치
		while(i<=5){
			System.out.println("오늘은 화요일");
			i++; //증가치
		}
		System.out.println();
		//
		//1~10까지 출력
		i = 1; //변수 재사용
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}//while-end
		//
		System.out.println();
		//
		//1부터 10까지 짝수만 출력 if,while문 사용
		i=1;
		while(i<=10){
			if(i%2==0){
				System.out.print(i+" ");
			}
			i++;
		}//while-end
		System.out.println();
		//
		//1에서 부터 100까지 8의 배수 출력
		i=1;
		while(i<=100){
			if(i%8==0){
				System.out.print(i+" ");
			}
			i++;
		}//while-end
	}//main-end
}//class-end
