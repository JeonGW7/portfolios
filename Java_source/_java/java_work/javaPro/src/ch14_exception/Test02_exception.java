package ch14_exception;
//간접처리
//런타임 제외
//1.배열값을 넣지않고 실행
//2.a를 입력하고 실행
//3.숫자를 77 입력하고 실행
//4.연산에러 if(num%0==0) 으로 수정
public class Test02_exception {
	public static void main(String[] args) throws Exception{
		int num = Integer.parseInt(args[0]);
		if(num%0==0){
			System.out.println(num+"은 짝수");
		}else{
			System.out.println(num+"은 홀수");
		}
	}//main-end
}//class-end
