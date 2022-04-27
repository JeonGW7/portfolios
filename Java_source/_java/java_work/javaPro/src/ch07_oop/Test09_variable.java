package ch07_oop;
//지역변수 안 지역변수 안 지역변수 
public class Test09_variable {
	public void aa(){
		int a=10; //지역변수
		{
			int b=20;//지역변수
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			{
				@SuppressWarnings("unused")
				int c=30;//지역변수 
			}
//			System.out.println("c:"+c); //c변수는 지역변수로 지역을 벗어나면 사용할 수 없어서 에러발생
		}
	}//aa()-end
	public static void main(String[] args) {
		Test09_variable t = new Test09_variable(); //객체생성
		t.aa();
		
	}//main-end
}//class-end
