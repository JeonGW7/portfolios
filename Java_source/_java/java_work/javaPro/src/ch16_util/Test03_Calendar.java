package ch16_util;
import java.util.*;
public class Test03_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //인스턴스 객체얻기 - 추상클래스여서 new 불가능
		int year = cal.get(Calendar.YEAR); //년도
		int month = cal.get(Calendar.MONTH)+1; //월 0(1월) 1(2월) ~~~ 11(12월)
		int day = cal.get(Calendar.DATE); //일
		int h = cal.get(Calendar.HOUR); //시간
		int m = cal.get(Calendar.MINUTE); //분
		int s = cal.get(Calendar.SECOND); // 초
		System.out.println(year+"/"+month+"/"+day+" "+h+":"+m+":"+s);
		System.out.println(year+"년"+month+"월"+day+"일"+h+"시"+m+"분"+s+"초");
	}//main-end
}//class-end
