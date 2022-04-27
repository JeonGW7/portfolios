package ch05_ctrl_for;
//break : switch-case 블럭을 빠져나갈때 필수로 사용했음
//break : 반복 loop를 빠져나갈 때 사용하기도 한다. 
public class Test09_break {

	public static void main(String[] args) {
		for(int i=1;i<=10000;i++){
			System.out.print(i+" ");
			if(i==10) break; //for문을 빠져나간다
		}//for-end
		System.out.println();
		//
		int j = 1;
		while(j<=10){
			System.out.print(j+" ");
			if(j==10)break; //반복loop탈출
			j++;
		}//while-end
	}//main-end
}//class-end
