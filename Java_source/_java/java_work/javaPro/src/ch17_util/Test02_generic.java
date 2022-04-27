package ch17_util;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
//Generic�� ����� ����, �����Ͻ� ���� �߻�
public class Test02_generic {
	//����� ���Ǹ޼���
	private void testCollection(){
		List<String> list = new ArrayList<String>();//��ü ����
		list.add(new String("Hello"));
		list.add(new String("Good"));
		//list.add(new Integer(1234)); //������ ���� - ���ʸ����� ���� ���� 
		disp(list); //�޼��� ȣ��
	}//testCollection-end
	//����� ���Ǹ޼���
	@SuppressWarnings("rawtypes")
	public void disp(Collection c){
		Iterator iter = c.iterator();
		while(iter.hasNext()){
			String item = (String)iter.next();
			System.out.println(item);
		}//while-end
	}//disp-end
	public static void main(String[] args) {
		Test02_generic t = new Test02_generic(); //��ü ����
		t.testCollection();
	}

}
