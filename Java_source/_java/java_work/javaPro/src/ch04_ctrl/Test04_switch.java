package ch04_ctrl;

public class Test04_switch {
	public static void main(String[] args) {
		//� ���� �Է� �޾� Ȧ������ ¦�������� �����Ͽ� ��� �Ͻÿ�
		int su = Integer.parseInt(args[0]);
		//switch(���� �Ǵ� ����){
		switch(su%2){
		case 0:
			System.out.println(su+"�� ¦��");
			break;
		case 1:
			System.out.println(su+"�� Ȧ��");
			break;
		}//switch-end
		
	}//main-end
}//class-end
