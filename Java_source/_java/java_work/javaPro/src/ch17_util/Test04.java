package ch17_util;
import java.util.List;
import java.util.ArrayList;
public class Test04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //객체생성
		list.add("kim");
		list.add("lee");
		list.add("park");
		//단축 for를 사용하여 출력하시오
		for(String s:list){
			System.out.println(s);
		}
	}//main-end
}//class-end
