package ch05_ctrl_for;

public class Test04_for2 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(j+" ");
			} //inner for
			System.out.println();
		}//outer for
		// 
		System.out.println();
		//
		// ****
		// ****
		// ****
		// ****
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print("*");
			} //inner for
			System.out.println();
		}//outer for
		System.out.println();
		//
		// *
		// **
		// ***
		// ****
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			} //inner for
			System.out.println();
		}//outer for
		System.out.println();
		//
		//    *
		//   **
		//  ***
		// ****
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}//main-end
}//class-end
