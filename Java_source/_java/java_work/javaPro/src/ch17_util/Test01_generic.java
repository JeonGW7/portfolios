package ch17_util;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList; //List인터페이스, ArrayList 클래스 상속관계 
import java.util.Collection;

//Iterator는 Enumeration과 Collection을 통합해서 받아낼 수 있는 기능을 가지고 있다 
//Generic을 사용하지 않은 예제  
public class Test01_generic {
	//사용자 정의 메서드
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void testCollection(){
		List list = new ArrayList();
		list.add(new String("Hello"));
		list.add(new String("Good"));
		list.add(new Integer(123)); //실행시 에러발생
		disp(list); //메서드 호출
	}//testCollection-end
	//사용자 정의 메서드
	@SuppressWarnings("rawtypes")
	public void disp(Collection c){
		Iterator iter = c.iterator();
		while(iter.hasNext()){ //자료가 있는동안 반복수행 
			String item = (String)iter.next();
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		Test01_generic t = new Test01_generic(); //객체생성
		t.testCollection(); //메서드 호출
	}//main-end
}//class-end
