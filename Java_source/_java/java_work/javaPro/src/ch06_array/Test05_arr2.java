package ch06_array;
//2���� �迭
public class Test05_arr2 {

	public static void main(String[] args) {
		int a[][] ={
				{10,20,30},
				{40,50,60},
				{70,80,90}
		}; 
		//3�� 3��
		System.out.println("�� ����: "+a.length); //3
		System.out.println("�� ����: "+a[0].length); //3
		System.out.println("�� ����: "+a[1].length); //3
		System.out.println("�� ����: "+a[2].length); //3
		//
		for(int i=0;i<a.length;i++){//��
			for(int j=0;j<a[i].length;j++){//��
				System.out.print(a[i][j]+" ");
			}//inner for
			System.out.println();
		}//out-for
	}//main-end
}//class-end
