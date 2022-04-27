package ch17_util;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
//Generic을 사용한 예제, 컴파일시 에러 발생
public class Test02_generic {
	//사용자 정의메서드
	private void testCollection(){
		List<String> list = new ArrayList<String>();//객체 생성
		list.add(new String("Hello"));
		list.add(new String("Good"));
		//list.add(new Integer(1234)); //컴파일 에러 - 제너릭으로 인해 에러 
		disp(list); //메서드 호출
	}//testCollection-end
	//사용자 정의메서드
	@SuppressWarnings("rawtypes")
	public void disp(Collection c){
		Iterator iter = c.iterator();
		while(iter.hasNext()){
			String item = (String)iter.next();
			System.out.println(item);
		}//while-end
	}//disp-end
	public static void main(String[] args) {
		Test02_generic t = new Test02_generic(); //객체 생성
		t.testCollection();
	}

}
