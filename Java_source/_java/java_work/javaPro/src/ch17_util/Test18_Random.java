package ch17_util;
import java.util.Random;
//RandomŬ���� ���� 
// 0.0 < Math.random() < 1.0 ������ ���� �߻�
public class Test18_Random {
	public static void main(String[] args) {
		Random r =new Random(); //��ü����
		int a1 = r.nextInt(); //������ ���� �߻�
		int a2 = r.nextInt(10); //0~10������ ���� �߻�
		int a3 = r.nextInt(100); //0~100������ ���� �߻�
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		//
		for(int i=1;i<=5;i++){
			System.out.println(r.nextFloat()); //������ �Ǽ� �߻�
			System.out.println(r.nextDouble()); //������ �Ǽ� �߻�, float���� ���е��� ���� 
			System.out.println(r.nextBoolean()); //true,false�� ���Ƿ� �߻�
		}
	}//main-end
}//class-end
