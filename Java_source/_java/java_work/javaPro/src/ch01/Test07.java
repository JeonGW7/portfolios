package ch01;
//��� ȣ���� �ڱ� �ڽ��� �ż��带 ȣ�� �ϴ� ��
public class Test07 {

	public static void main(String[] args) {
		Test07 t7 = new Test07();//��ü����
		t7.aa(); // ��ü.�޼���()
	}//main-end
	public void aa(){
		System.out.println("aa()");
		aa(); // �ڽ��� �޼��� ȣ��
	}
}//class-end
