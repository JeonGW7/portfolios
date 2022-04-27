package ch06_array;

public class Test01_arr {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		//
		//¹è¿­
		int x[] = {50,60,70};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		//
		//for
		System.out.println("x.length:"+x.length);
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]); //i=0 1 2
		}
	}//main-end
}//class-end
