package ch06_array;
//3���� �迭 : �� �� �� 
// 2�� 2�� 3�� 
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
		for(int i=0;i<2;i++){ //��
			for(int j=0;j<2;j++){ //��
				for(int k=0;k<3;k++){ //��
					System.out.print(c[i][j][k]+" ");
								 	// ��  ��   ��
				}//inner-for
				System.out.println(); //�౸��
			}//middle-for
			System.out.println(); //�� ����
		}//out-for
	}//main-end
}//class-end
