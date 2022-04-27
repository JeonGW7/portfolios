package ch06_array;

public class Test06_arr2 {

	public static void main(String[] args) {
		int jum[][] ={
				{100,80,90},
				{80,80,90},
				{88,99,100}
		}; 
		int sum=0; //합을 누적할 변수는 반드시 0으로 초기화 해야 한다
		for(int i=0;i<jum.length;i++){//행
			for(int j=0;j<jum[i].length;j++){//열
				System.out.print(jum[i][j]+"\t");
				sum += jum[i][j];
			}//inner for
			System.out.printf("%5d %8.1f \n",sum,(sum/3.0));
			sum = 0; // 그 다음 사람의 합을 구하기 위해 초기화
		}//out-for
	}//main-end
}//class-end
