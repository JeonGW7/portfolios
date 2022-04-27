package ch06_array;
// 0.0 < Math.random() < 1.0 사이의 임의의 수를 발생 시킨다
// 1970/1/1/0:0:0 기준으로 해서 random값을 구한다
public class Test08_random {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			System.out.println(Math.random());
		}
		//
		//주사위 값을 구하기
		//주사위 나올 수 있는 가장 작은 값 : 1
		//주사위 나올 수 있는 가지수 : 6
		for(int i=1;i<=10;i++){
			int a = (int)(Math.random()*6+1);
			System.out.print(a+" ");
		}//for-end
		System.out.println();
		//10~100사이의 난수를 구하시오
		//int b = (int)(Math.random()*(큰수-작은수+1)+나올 수 있는 가장 작은 수 
		//int b = (int)(Math.random()*(100-10+1)+10;
		for(int i=1;i<=10;i++){
			int b = (int)(Math.random()*(100-10+1))+10;
			System.out.print(b+" ");
		}
	}//main-end
}//class-end
