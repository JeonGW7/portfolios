package ch09_class;
//downcasting
//��������ȯ
class Super2{
	//����� ���� �޼���
	public void disp(){
		System.out.println("���� Ŭ����.disp() called");
	}
}//class-end
//�Ļ�Ŭ����
class Sub2 extends Super2{
	//�������̵�
	public void disp(){
		System.out.println("�Ļ� Ŭ���� disp() called");
	}
	//����� ���� �޼���
	public void kk(){
		System.out.println("�Ļ�Ŭ����.kk() called");
	}
}//class-end
public class Test08_downcasting {
	public static void main(String[] args) {
		Super2 s = new Super2();
		s.disp();
		//
		s = new Sub2(); //����Ŭ���� ������ ������ü ó��, upcasting
		s.disp();
		((Sub2)s).kk(); //downcasting 
	}//main-end
}//class-end
