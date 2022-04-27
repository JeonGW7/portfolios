package ch04_ctrl;

public class Test01_if {

	public static void main(String[] args) {
		//어떤 수를 입력 받아서 양수인지 음수인지 판정하여 출력하세요
		//Run - Run Configuration - argument에 임의의 값을 넣고 테스트
		int a=Integer.parseInt(args[0]);
		if(a>0){
			System.out.println(a+"는 양수");
		} else{
			System.out.println(a+"는 음수");
		}
	}//main-end

}//class-end
