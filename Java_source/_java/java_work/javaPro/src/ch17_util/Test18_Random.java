package ch17_util;
import java.util.Random;
//Random클래스 예제 
// 0.0 < Math.random() < 1.0 사이의 난수 발생
public class Test18_Random {
	public static void main(String[] args) {
		Random r =new Random(); //객체생성
		int a1 = r.nextInt(); //임의의 정수 발생
		int a2 = r.nextInt(10); //0~10사이의 난수 발생
		int a3 = r.nextInt(100); //0~100사이의 난수 발생
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		//
		for(int i=1;i<=5;i++){
			System.out.println(r.nextFloat()); //임의의 실수 발생
			System.out.println(r.nextDouble()); //임의의 실수 발생, float보다 정밀도가 높다 
			System.out.println(r.nextBoolean()); //true,false가 임의로 발생
		}
	}//main-end
}//class-end
