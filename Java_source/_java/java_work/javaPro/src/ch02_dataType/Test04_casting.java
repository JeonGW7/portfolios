package ch02_dataType;
//�ڵ�����ȯ
//������ ���� �ڷ����� ū������ �ڵ� ����ȯ�� �Ͼ�� 
//�Ҵ�ÿ��� ���� �ڷ����� Ŭ ��, ���� �ڷ������� ����ȯ�� �Ͼ��
//��������ȯ = casting : ������ ����ȯ �ϴ� ��
//int b=12.5; -> ����
//int b=(int)12.5; -> ĳ���� �Ͽ� �Ҵ� 
public class Test04_casting {
	public static void main(String[] args) {
		System.out.println(10+12.5); // int+double = > double
		double a = 1000; //�Ҵ�� �ڵ� ����ȯ�ȴ�
		System.out.println(a); //double������ ��������
		//
//		int b = 12.5; //����
		int c =(int)12.5; // ���� ����ȯ
//		char d =66.6; //����
		char e = (char)66.6; // ��������ȯ
		System.out.println(c);
		System.out.println(e);
		
	}//main-end

}//class-end
