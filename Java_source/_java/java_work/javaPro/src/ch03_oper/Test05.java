package ch03_oper;
//���ǿ�����=3�׿�����  ����: (����)?��1:��2 
//ĳ���� ������
public class Test05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = (7>5)?7:5; //7
		int b = (7<5)?7:5; //5
		System.out.println(a);
		System.out.println(b);
		//casting ������
		int c = (int)12.2;
		char d = (char)77;
		char e = (char)77.7;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}//main-end

}//class-end
