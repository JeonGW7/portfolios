package ch07_oop;
//매개변수, 리턴형 둘다 사용하는 메서드 예제
//접근제한자 리턴형 메서드이름(인수,매개변수,,){}
public class Test04_method {
	public int aa(int a,int b){
		System.out.println("aa(int a,int b) called");
		int s = a+b;
		return s;
	}
	public double bb(double a,double b){
		System.out.println("bb(doulbe a double b) called");
		double s = a+b;
		return s;
	}
	
	public static void main(String[] args) {
		Test04_method t = new Test04_method();//객체생성(heap영역에 메모리 할당),생성자 호출
		int ss = t.aa(10, 5);//메서드 호출, 리턴값을 받는다
		System.out.println("ss: "+ss);
		//
		double tt = t.bb(55.5, 77.7);//메서드 호출, 리턴값을 받는다
		System.out.println("tt: "+tt);
		
	}//main-end
}//class-end
