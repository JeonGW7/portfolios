package ch06_array;

public class Test04_arr {

	public static void main(String[] args) {
		int a[] = {10,20,30};
		int b[]; //�迭 ����
		b=a; //���۷��� ���� �Ҵ� �ȴ� 
		for(int i=0;i<3;i++){
			System.out.println(a[i]+"-"+b[i]); //a�� b ���� ���� ���
		}
		System.out.println("a.length: "+a.length);
		System.out.println("b.length: "+b.length); //���� ���� �����ϱ� ������ ���̵� ����
	}//main-end

}//class-end
