package ch06_array;
//로또 1~45 
public class Test09_lotto {

	public static void main(String[] args) {
		int lotto[] = new int[6]; //배열 생성
		for(int i=0;i<6;i++){
			lotto[i] = (int)(Math.random()*(45-1+1))+1;
			//중복 값이 나올 때 무효화 처리 하기위해 
			for(int j=0;j<i;j++){
				if(lotto[i]==lotto[j]){
					//같은 값이 나오면 무효화
					i--;
					break;//for탈출
				}//if-end
			}//inner-for
		}//out-for
		//
		//배열값 출력
		for(int i=0;i<6;i++){
			System.out.print(lotto[i]+" ");
		}
	}//main-end

}//class-end
