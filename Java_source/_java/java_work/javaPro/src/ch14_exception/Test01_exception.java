package ch14_exception;
//런타임 제외
//1.배열값을 넣지않고 실행
//2.a를 입력하고 실행
//3.숫자를 77 입력하고 실행
//4.연산에러 if(num%0==0) 으로 수정
public class Test01_exception {

	public static void main(String[] args) {
		try{
			int num = Integer.parseInt(args[0]);
			//if(num%2==0){
			if(num%0==0){
				System.out.println(num+"은 짝수");
			}else{
				System.out.println(num+"은 홀수");
			}
		}catch(ArrayIndexOutOfBoundsException ex1){
			System.out.println("배열예외"+ex1);
		}catch(NumberFormatException ex2){
			System.out.println("숫자를 입력 하세요"+ex2);
		}catch(ArithmeticException ex3){
			System.out.println("연산에러 0으로 나눌 수 없음"+ex3);
		}finally{
			System.out.println("finally절 수행, 예외발생과 상관없이 실행한다");
		}
	}//main-end
}//class-end
