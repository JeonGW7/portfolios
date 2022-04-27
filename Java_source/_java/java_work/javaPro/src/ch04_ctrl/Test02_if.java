package ch04_ctrl;

public class Test02_if {

	public static void main(String[] args) {
		//어떤수를 입력 받아서 짝수인지 홀수인지 판정하여 출력 
		int a =Integer.parseInt(args[0]);
		if(a%2==0){
			System.out.println("a는 짝수");
		} else if(a%2!=0){
			System.out.println("a는 홀수");
		}
	}//main-end

}//class-end