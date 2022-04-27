package ch05_ctrl_for;
//while
//do-while 비교 실습
public class Test08_while_do_while {

	public static void main(String[] args) {
		int i = 10000;
		while(i<=10){ //조건이 먼저 비교 되어지기 때문에 한번도 출력하지 않는다  
			System.out.println("very~~~");
			i++;
		}//while-end
		int j = 10000;
		do{ //처리후 조건을 비교하기 때문에 적어도 1번 출력된다. 
			System.out.println("nice~~~");
			j++;
		}while(j<=10);
		
	}//main-end
}//class-end
