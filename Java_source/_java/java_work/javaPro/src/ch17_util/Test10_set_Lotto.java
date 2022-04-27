package ch17_util;
import java.util.*;
public class Test10_set_Lotto {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //객체생성
		while(set.size()<6){
			int a =(int)(Math.random()*45+1); //로또번호발생
			set.add(a+"");//숫자+"" 숫자를 문자열로 변환 
		}
		//출력
		for(String s: set){
			System.out.print(s+" ");
		}
	}

}
