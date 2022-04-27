package ch17_util;
import java.util.*;
//List, ArrayList 사용 예 
//중복 허용 된다
public class Test09_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("총무과");
		list.add("총무과");
		list.add("인사과");
		list.add("인사과");
		list.add("인사과");
		System.out.println("size() 갯수:"+list.size()); //중복허용이 되서 5가 출력 
		//단축 for
		for(String s:list){
			System.out.println(s);
		}
		System.out.println();
		//Iterator 사용
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){ //자료가 있는 동안 반복 수행
			System.out.println(iter.next());
		}//while-end 
		System.out.println();
		//일반for
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}//main-end
}//class-end
