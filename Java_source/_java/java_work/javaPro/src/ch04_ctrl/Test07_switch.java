package ch04_ctrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test07_switch {

	public static void main(String[] args) throws Exception {
		//달(월)을 입력 받아서 그 달의 날짜 수를 출력하세요
		//1 2 3 4 5 6 7 8 9 10 11 12
		String strMonth = ""; //달을 넣을 변수
		int month = 0; //달을 숫자로 넣을 변수
		int days = 0; //날짜수 넣을 변수 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//                                                한글자씩 읽어서 버퍼에 저장
		System.out.print("달(월)을 입력하세요 >> ");
		strMonth = br.readLine(); //line단위로 읽는다 
		month = Integer.parseInt(strMonth); //문자열을 숫자로 변환
		if(month<1 || month>12){
			System.out.println("1월부터 12웖까지만 입력하세요 ");
		}else{
			switch(month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days=31;
					break;
				case 2:
					days=28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days=30;
					break;
			}//switch-end
			System.out.println(month+"월은"+days+"까지 있는 달입니다. ");
		}//else-end
	}//main-end
}//class-end
