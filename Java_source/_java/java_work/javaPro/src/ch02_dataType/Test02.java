package ch02_dataType;
//�⺻�ڷ��� : boolean (1bit)
//�⺻�ڷ��� : byte(1) char(2) short(2) int(4) long(8)
//�⺻�ڷ��� : float(4) double(8)
//��ġ�� : void
//
//���۷��� �ڷ��� : Ŭ����, �������̽�, �迭 : heap������ �޸� �Ҵ�
//
//���� �Ǵ� ������ �Ǵ� ���̸� : �޸𸮸� �Ҵ� �޾� �� �̸��� �ο��ϴ� �� 
public class Test02 {

	public static void main(String[] args) {
		byte a1=127; //�ִ밪 ���� (-128~+127)
//		byte a1 = 128; //�����߻�
		char a3 = 65; //�ƽ�Ű �ڵ尪 'A'
		char a4 = 'B'; //�ƽ�Ű ���� 
		System.out.println(a1);
		System.out.println(a3);
		System.out.println(a4);
		//
		short a5 = 32767; //-32768 ~ + 32767
		int a6 = 2147483647; //-2147483648~+2147483647
		long a7 = Long.MAX_VALUE; //long�� �ִ밪
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7); 
		//
		float a8 = 12.123456789012345f; // ���е��� ����
		double a9 = 12.123456789012345; // double - default , ���е��� ���� 
		double a10 = 12.123456789012345d; // double 
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		
		
		
	}//main-end

}//class-end
