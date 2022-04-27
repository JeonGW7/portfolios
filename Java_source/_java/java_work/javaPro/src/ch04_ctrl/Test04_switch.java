package ch04_ctrl;

public class Test04_switch {
	public static void main(String[] args) {
		//어떤 수를 입력 받아 홀수인지 짝수인지를 판정하여 출력 하시오
		int su = Integer.parseInt(args[0]);
		//switch(변수 또는 수식){
		switch(su%2){
		case 0:
			System.out.println(su+"는 짝수");
			break;
		case 1:
			System.out.println(su+"는 홀수");
			break;
		}//switch-end
		
	}//main-end
}//class-end
