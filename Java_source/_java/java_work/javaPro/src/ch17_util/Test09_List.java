package ch17_util;
import java.util.*;
//List, ArrayList ��� �� 
//�ߺ� ��� �ȴ�
public class Test09_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("�ѹ���");
		list.add("�ѹ���");
		list.add("�λ��");
		list.add("�λ��");
		list.add("�λ��");
		System.out.println("size() ����:"+list.size()); //�ߺ������ �Ǽ� 5�� ��� 
		//���� for
		for(String s:list){
			System.out.println(s);
		}
		System.out.println();
		//Iterator ���
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){ //�ڷᰡ �ִ� ���� �ݺ� ����
			System.out.println(iter.next());
		}//while-end 
		System.out.println();
		//�Ϲ�for
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}//main-end
}//class-end
