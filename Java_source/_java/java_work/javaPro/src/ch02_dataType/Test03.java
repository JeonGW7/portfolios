package ch02_dataType;
//Integer.parseInt("123") : ���ڿ��� ������ ��ȯ
// 123+"" : ���ڸ� ���ڿ��� ��ȯ 
public class Test03 {

	public static void main(String[] args) {
		String str = "123";
		String str2 = "456";
		int a =Integer.parseInt(str); //���ڿ��� ������ ��ȯ
		int b =Integer.parseInt(str2); 
		int s = a+b;
		System.out.println(s);
		System.out.println(str+str2); //���ڿ� ����,������ �ȵȴ� 
		//
		// ���ڸ� ���ڿ��� ��ȯ
		int c =123;
		String str3 = c+""; // ���ڿ��� ��ȯ
		System.out.println(c+c);//����
		System.out.println(str3+str3);//���ڿ� ����
	}//main-end

}//class-end
