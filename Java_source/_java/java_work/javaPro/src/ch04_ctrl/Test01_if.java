package ch04_ctrl;

public class Test01_if {

	public static void main(String[] args) {
		//� ���� �Է� �޾Ƽ� ������� �������� �����Ͽ� ����ϼ���
		//Run - Run Configuration - argument�� ������ ���� �ְ� �׽�Ʈ
		int a=Integer.parseInt(args[0]);
		if(a>0){
			System.out.println(a+"�� ���");
		} else{
			System.out.println(a+"�� ����");
		}
	}//main-end

}//class-end
