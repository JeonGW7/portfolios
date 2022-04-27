package ch17_util;
import java.util.*;
public class Test11_Vector {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();//객체생성
		vec.add("무대리");//index=0
		vec.add("김기사");//index=1
		vec.add("갑돌이");//index=2
		vec.add("갑순이");//index=3
		vec.add("월매");//index=4
		vec.add("춘향이");//index=5
		System.out.println("자료갯수 size() : "+vec.size());
		//단축for 사용
		for(String s: vec){
			System.out.println(s);
		}
		System.out.println();
		//일반 for
		for(int i=0;i<vec.size();i++){
			System.out.println(vec.get(i));
		}
	}//main-end
}//class-end
