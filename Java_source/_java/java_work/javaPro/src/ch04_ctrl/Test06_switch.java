package ch04_ctrl;

public class Test06_switch {

	public static void main(String[] args) throws Exception{
		//�����ڸ� �Է¹޾Ƽ� �׿� �ش��ϴ� ������ �Ͻÿ�
		int x = 10;
		int y = 7;
		System.out.print("+ - * / % �� �ϳ��� �Է� �ϼ��� >> ");
		 
		while(true){
			char oper = (char)System.in.read(); // 1���ڸ� ���� �� �ִ�.
			if(oper=='0'){
				System.out.println("����");
				System.exit(0);
			}else{
				switch(oper){
				case '+':
					System.out.println(x+y);
					break;
				case '-':
					System.out.println(x-y);
					break;
				case '*':
					System.out.println(x*y);
					break;
				case '/':
					System.out.println(x/y);
					break;
				case '%':
					System.out.println(x%y);
					break;
				default:
					//System.out.println("�����ڸ� ��Ȯ�ϰ� �Է��ϼ���.");
				}//switch-end
			}
		}
		
		
	}//main-end
}//class-end
