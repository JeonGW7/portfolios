package ch06_array;
// 0.0 < Math.random() < 1.0 ������ ������ ���� �߻� ��Ų��
// 1970/1/1/0:0:0 �������� �ؼ� random���� ���Ѵ�
public class Test08_random {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			System.out.println(Math.random());
		}
		//
		//�ֻ��� ���� ���ϱ�
		//�ֻ��� ���� �� �ִ� ���� ���� �� : 1
		//�ֻ��� ���� �� �ִ� ������ : 6
		for(int i=1;i<=10;i++){
			int a = (int)(Math.random()*6+1);
			System.out.print(a+" ");
		}//for-end
		System.out.println();
		//10~100������ ������ ���Ͻÿ�
		//int b = (int)(Math.random()*(ū��-������+1)+���� �� �ִ� ���� ���� �� 
		//int b = (int)(Math.random()*(100-10+1)+10;
		for(int i=1;i<=10;i++){
			int b = (int)(Math.random()*(100-10+1))+10;
			System.out.print(b+" ");
		}
	}//main-end
}//class-end
