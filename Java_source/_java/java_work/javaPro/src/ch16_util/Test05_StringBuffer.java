package ch16_util;
//StringBuffer : �������ڿ� ó��
public class Test05_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //��ü����
		System.out.println("capacity �뷮:"+sb.capacity());
		sb.append("Hello");
		sb.append("Good");
		sb.append("Very");
		sb.append("Hello");
		sb.append("Good");
		System.out.println(sb.toString());
		System.out.println("���ڿ� ����,����: "+sb.length());
		System.out.println("capacity �뷮:"+sb.capacity());
		//
		//��������
		sb.reverse();
		System.out.println(sb.toString());
		//����
		sb.reverse();
		sb.delete(0, 5); //index 5�������� ����
		System.out.println(sb);
	}//main-end
}//class-end
