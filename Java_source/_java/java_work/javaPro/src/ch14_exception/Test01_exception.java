package ch14_exception;
//��Ÿ�� ����
//1.�迭���� �����ʰ� ����
//2.a�� �Է��ϰ� ����
//3.���ڸ� 77 �Է��ϰ� ����
//4.���꿡�� if(num%0==0) ���� ����
public class Test01_exception {

	public static void main(String[] args) {
		try{
			int num = Integer.parseInt(args[0]);
			//if(num%2==0){
			if(num%0==0){
				System.out.println(num+"�� ¦��");
			}else{
				System.out.println(num+"�� Ȧ��");
			}
		}catch(ArrayIndexOutOfBoundsException ex1){
			System.out.println("�迭����"+ex1);
		}catch(NumberFormatException ex2){
			System.out.println("���ڸ� �Է� �ϼ���"+ex2);
		}catch(ArithmeticException ex3){
			System.out.println("���꿡�� 0���� ���� �� ����"+ex3);
		}finally{
			System.out.println("finally�� ����, ���ܹ߻��� ������� �����Ѵ�");
		}
	}//main-end
}//class-end
