package ch06_array;
//�������� : �ڵ����� �ʱ�ȭ �ȴ�
//�������� : �ڵ����� �ʱ�ȭ �ȵȴ�
//�迭�� ���������� �ڵ� �ʱ�Ȯ�� �ȴ� **** ***
public class Test02_arr {

	public static void main(String[] args) {
		int a[] = new int[3];  //0
		double d[] = new double[3];  //0.0
		char ch[] = new char[3]; //����
		String str[] = new String[3]; //null �Ǵ� ""
		for(int i=0;i<3;i++){
			System.out.println(a[i]+"~"+d[i]+"~"+ch[i]+"~"+str[i]);
		}
	}//main-end
}//class-end
