package ch06_array;

public class Test06_arr2 {

	public static void main(String[] args) {
		int jum[][] ={
				{100,80,90},
				{80,80,90},
				{88,99,100}
		}; 
		int sum=0; //���� ������ ������ �ݵ�� 0���� �ʱ�ȭ �ؾ� �Ѵ�
		for(int i=0;i<jum.length;i++){//��
			for(int j=0;j<jum[i].length;j++){//��
				System.out.print(jum[i][j]+"\t");
				sum += jum[i][j];
			}//inner for
			System.out.printf("%5d %8.1f \n",sum,(sum/3.0));
			sum = 0; // �� ���� ����� ���� ���ϱ� ���� �ʱ�ȭ
		}//out-for
	}//main-end
}//class-end
