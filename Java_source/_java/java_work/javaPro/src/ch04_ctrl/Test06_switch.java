package ch04_ctrl;

public class Test06_switch {

	public static void main(String[] args) throws Exception{
		//연산자를 입력받아서 그에 해당하는 연산을 하시오
		int x = 10;
		int y = 7;
		System.out.print("+ - * / % 중 하나를 입력 하세요 >> ");
		 
		while(true){
			char oper = (char)System.in.read(); // 1문자만 받을 수 있다.
			if(oper=='0'){
				System.out.println("종료");
				System.exit(0);
			}else{
				switch(oper){
				case '+':
					System.out.println(x+y);
					break;
				case '-':
					System.out.println(x-y);
					break;
				case '*':
					System.out.println(x*y);
					break;
				case '/':
					System.out.println(x/y);
					break;
				case '%':
					System.out.println(x%y);
					break;
				default:
					//System.out.println("연산자를 정확하게 입력하세요.");
				}//switch-end
			}
		}
		
		
	}//main-end
}//class-end
