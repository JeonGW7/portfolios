package ch14_exception;
//����ó��
//��Ÿ�� ����
//1.�迭���� �����ʰ� ����
//2.a�� �Է��ϰ� ����
//3.���ڸ� 77 �Է��ϰ� ����
//4.���꿡�� if(num%0==0) ���� ����
public class Test02_exception {
	public static void main(String[] args) throws Exception{
		int num = Integer.parseInt(args[0]);
		if(num%0==0){
			System.out.println(num+"�� ¦��");
		}else{
			System.out.println(num+"�� Ȧ��");
		}
	}//main-end
}//class-end
