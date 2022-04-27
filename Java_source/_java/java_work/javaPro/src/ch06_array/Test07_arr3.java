package ch06_array;
//3차원 배열 : 면 행 열 
// 2면 2행 3열 
// a b c
// d e f
//
// g h i
// j k l
public class Test07_arr3 {

	public static void main(String[] args) {
		char c[][][] = {
				{
				{'a','b','c'},
				{'d','e','f'},
				},
				{
				{'g','h','i'},
				{'j','k','l'},
				}
		};
		for(int i=0;i<2;i++){ //면
			for(int j=0;j<2;j++){ //행
				for(int k=0;k<3;k++){ //열
					System.out.print(c[i][j][k]+" ");
								 	// 면  행   열
				}//inner-for
				System.out.println(); //행구분
			}//middle-for
			System.out.println(); //면 구분
		}//out-for
	}//main-end
}//class-end
