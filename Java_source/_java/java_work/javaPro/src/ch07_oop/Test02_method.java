package ch07_oop;

public class Test02_method {
	//��������� �޼���
	public void aa(){
		System.out.println("aa() called");
	}
	public void bb(){
		System.out.println("bb() called");
	}
	
	public static void main(String[] args) {
		Test02_method t2 = new Test02_method(); // ��ü����, ������ 
		t2.aa();
		t2.bb(); //bb()ȣ���ϰ� >> ������� �Ѿ�� >> bb() {������}ó���ϰ� } �ݴ� ��ȣ�� ������ ȣ���ߴ� ������ �ǵ��� �´� 
	}//main-end

}//class-end
