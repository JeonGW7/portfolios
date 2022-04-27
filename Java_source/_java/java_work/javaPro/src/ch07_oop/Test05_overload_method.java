package ch07_oop;

public class Test05_overload_method {
	public void sum(int a,int b){
		System.out.println("sum(int a, int b) called");
		System.out.println("합: "+(a+b));
	}
	public void sum(float a,float b){
		System.out.println("sum(float a, float b) called");
		System.out.println("합: "+(a+b));
	}
	public void sum(double a,double b){
		System.out.println("sum(double a, double b) called");
		System.out.println("합: "+(a+b));
	}
	public static void main(String[] args) {
		Test05_overload_method t = new Test05_overload_method(); //객체 생성
		t.sum(10.5, 7.7);
		t.sum(23.3f, 11.1f);
		t.sum(77, 88);

	}

}
