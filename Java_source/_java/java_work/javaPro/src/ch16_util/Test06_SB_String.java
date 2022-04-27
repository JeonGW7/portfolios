package ch16_util;
//String과 StringBuffer속도차 구하기
public class Test06_SB_String {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		long start,end;
		start = System.currentTimeMillis(); //시스템의 현재시간 구하기
		String str = ""; //변수
		for(int i=1;i<=10000;i++){
			str += i;
			str += "+";
		}
		end = System.currentTimeMillis(); //작업 종료시간 구하기
		System.out.println("end-start: "+(end-start)+"밀리초");
		//---------------------
		//StringBuffer 
		//---------------------
		start = System.currentTimeMillis(); //시작시간 
		StringBuffer sb = new StringBuffer(); //객체 생성
		for(int i=1;i<=1000000;i++){
			sb.append(i);
			sb.append("+");
		}
		end = System.currentTimeMillis(); //작업종료시간 
		System.out.println("StringBuffer 연산시간:"+(end-start)+"밀리초");
	}//main-end
}//class-end
