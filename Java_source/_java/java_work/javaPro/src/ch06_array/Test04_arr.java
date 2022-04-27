package ch06_array;

public class Test04_arr {

	public static void main(String[] args) {
		int a[] = {10,20,30};
		int b[]; //배열 선언
		b=a; //레퍼런스 값이 할당 된다 
		for(int i=0;i<3;i++){
			System.out.println(a[i]+"-"+b[i]); //a와 b 같은 값이 출력
		}
		System.out.println("a.length: "+a.length);
		System.out.println("b.length: "+b.length); //같은 것을 참조하기 때문에 길이도 같음
	}//main-end

}//class-end
