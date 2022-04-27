package ch05_ctrl_for;

public class Test07_do_while {

	public static void main(String[] args) {
		//do-while문으로 
		//"afternoon"를 5번 출력하기
		int i =1;
		do{
			System.out.println("afternoon");
			i++;
		}while(i<=5);
		System.out.println();
		//
		//1~50까지의 3의배수 출력하기, if,do-while문 사용
		i =1;
		do{
			if(i%3==0){
				System.out.print(i+" ");
			}
			i++;
		}while(i<=50);
		System.out.println();
		//
		//1에서 300까지 10의 배수 출력하기 if,do-while문 사용
		i =1;
		do{
			if(i%10==0){
				System.out.print(i+" ");
			}
			i++;
		}while(i<=300);
	}//main-end
}//class-end
