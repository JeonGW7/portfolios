package ch06_array;
//전역변수 : 자동으로 초기화 된다
//지역변수 : 자동으로 초기화 안된다
//배열은 지역일지라도 자동 초기확가 된다 **** ***
public class Test02_arr {

	public static void main(String[] args) {
		int a[] = new int[3];  //0
		double d[] = new double[3];  //0.0
		char ch[] = new char[3]; //공백
		String str[] = new String[3]; //null 또는 ""
		for(int i=0;i<3;i++){
			System.out.println(a[i]+"~"+d[i]+"~"+ch[i]+"~"+str[i]);
		}
	}//main-end
}//class-end
