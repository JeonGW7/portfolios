package ch10_interface_abs;

interface AA{
	int MAX=100; //static final int MAX=100;
	public void aa();
	public void bb();
}
class AAA implements AA{
	//�������̵�
	public void aa(){
		System.out.println("MAX:"+MAX);
		//MAX=1000;//������ �Ұ���
		System.out.println("aa() called~~");
	}
	public void bb(){
		System.out.println("bb() called~~");
	}
}
public class Test01_interface {
	public static void main(String[] args) {
		AA A = new AAA(); //���� Ŭ���� ������ ���� ��ü ó��
		A.aa();
		A.bb();
	}
	
}
