package ch04_ctrl;

public class Test02_if {

	public static void main(String[] args) {
		//����� �Է� �޾Ƽ� ¦������ Ȧ������ �����Ͽ� ��� 
		int a =Integer.parseInt(args[0]);
		if(a%2==0){
			System.out.println("a�� ¦��");
		} else if(a%2!=0){
			System.out.println("a�� Ȧ��");
		}
	}//main-end

}//class-end