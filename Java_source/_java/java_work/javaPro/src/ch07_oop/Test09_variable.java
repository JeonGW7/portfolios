package ch07_oop;
//�������� �� �������� �� �������� 
public class Test09_variable {
	public void aa(){
		int a=10; //��������
		{
			int b=20;//��������
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			{
				@SuppressWarnings("unused")
				int c=30;//�������� 
			}
//			System.out.println("c:"+c); //c������ ���������� ������ ����� ����� �� ��� �����߻�
		}
	}//aa()-end
	public static void main(String[] args) {
		Test09_variable t = new Test09_variable(); //��ü����
		t.aa();
		
	}//main-end
}//class-end
