package ch05_ctrl_for;
//continue: �ٽ� �ݺ� loop�� �����ϰ� �Ѵ�

public class Test10_continue {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			if(i%2 !=0){//Ȧ���̸�
				continue; //�ٽ� �ݺ�loop�� �����Ѵ�.
			}
			System.out.print(i+" "); //¦���� ���
		}
	}//main-end
}//class-end
