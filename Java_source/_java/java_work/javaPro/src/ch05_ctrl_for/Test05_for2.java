package ch05_ctrl_for;

public class Test05_for2 {

	public static void main(String[] args) {
		//    *
		//   ***
		//  *****
		// *******
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){ //4 3 2 1
				System.out.print(" ");
			} //inner for
			for(int k=1;k<=(i*2-1);k++){ // 1 3 5 7
				System.out.print("*");
			} // inner for
			System.out.println();
		}//out-for
		//노동부에서 문제 낸 반복문 - 구구단 출력
		//2중 for
		//2*1=2  3*1 =3 ... 9*1=9
		//2*2=4  3*2 =6 ... 9*2=18
		// .. 
		//2*9=18  3*9 =27 ... 9*9=81
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}//inner-for
			System.out.println();
		}//outer-for
	}//main-end
}//class-end
