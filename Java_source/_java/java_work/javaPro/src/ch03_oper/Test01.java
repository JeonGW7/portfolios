package ch03_oper;

public class Test01 {

	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//
		a = 5;
		b = 7;
		int c = ++a + b--; 
		System.out.println(c);
		// ++¿¬»êÀÚ
		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
		}//for-end
		//
		System.out.println(); //line skip
		int x = 5;
		int y = ++x + ++x;
		System.out.println(y);
 	}//main-end

}//class-end
