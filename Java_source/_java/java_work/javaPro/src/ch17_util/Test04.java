package ch17_util;
import java.util.List;
import java.util.ArrayList;
public class Test04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //��ü����
		list.add("kim");
		list.add("lee");
		list.add("park");
		//���� for�� ����Ͽ� ����Ͻÿ�
		for(String s:list){
			System.out.println(s);
		}
	}//main-end
}//class-end
