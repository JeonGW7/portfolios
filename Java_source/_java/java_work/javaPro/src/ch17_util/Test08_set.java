package ch17_util;
import java.util.*;
//Set:인터페이스
//HashSet: 클래스
public class Test08_set {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//객체생성
		set.add("총무과");
		set.add("인사과");
		set.add("인사과");
		set.add("인사과");
		set.add("총무과");
		System.out.println("size() 갯수:"+set.size());
		System.out.println();
		//단축for
		for(String s:set){
			System.out.println(s);
		}
		System.out.println();
		//
		Iterator iter = set.iterator();
		while(iter.hasNext()){ //자료가 있는 동안 반복 수행
			System.out.println(iter.next());
		}
	}//main-end
}//class-end
