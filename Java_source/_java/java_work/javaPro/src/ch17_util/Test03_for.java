package ch17_util;
import java.util.List;
import java.util.ArrayList;
public class Test03_for {
	public static void main(String[] args) {
		String arr[] = {"kim","lee","park"};
		for(String s:arr){
			System.out.println(s);
		}//for-end
		System.out.println();
		int arr2[] = {10,20,30};
		for(int a:arr2){
			System.out.println(a);
		}//for-end
		System.out.println();
		//List,ArrayList ���
		List<String> list = new ArrayList<String>(); //��ü����
		list.add("����");
		list.add("����");
		list.add("������");
		for(String s:list){
			System.out.println(s);
		}//for-end
		System.out.println();
	}//main-end
}//class-end
