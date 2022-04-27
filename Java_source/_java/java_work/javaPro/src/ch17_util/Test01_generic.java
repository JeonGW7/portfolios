package ch17_util;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList; //List�������̽�, ArrayList Ŭ���� ��Ӱ��� 
import java.util.Collection;

//Iterator�� Enumeration�� Collection�� �����ؼ� �޾Ƴ� �� �ִ� ����� ������ �ִ� 
//Generic�� ������� ���� ����  
public class Test01_generic {
	//����� ���� �޼���
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void testCollection(){
		List list = new ArrayList();
		list.add(new String("Hello"));
		list.add(new String("Good"));
		list.add(new Integer(123)); //����� �����߻�
		disp(list); //�޼��� ȣ��
	}//testCollection-end
	//����� ���� �޼���
	@SuppressWarnings("rawtypes")
	public void disp(Collection c){
		Iterator iter = c.iterator();
		while(iter.hasNext()){ //�ڷᰡ �ִµ��� �ݺ����� 
			String item = (String)iter.next();
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		Test01_generic t = new Test01_generic(); //��ü����
		t.testCollection(); //�޼��� ȣ��
	}//main-end
}//class-end
