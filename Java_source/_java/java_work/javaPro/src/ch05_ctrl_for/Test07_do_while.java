package ch05_ctrl_for;

public class Test07_do_while {

	public static void main(String[] args) {
		//do-while������ 
		//"afternoon"�� 5�� ����ϱ�
		int i =1;
		do{
			System.out.println("afternoon");
			i++;
		}while(i<=5);
		System.out.println();
		//
		//1~50������ 3�ǹ�� ����ϱ�, if,do-while�� ���
		i =1;
		do{
			if(i%3==0){
				System.out.print(i+" ");
			}
			i++;
		}while(i<=50);
		System.out.println();
		//
		//1���� 300���� 10�� ��� ����ϱ� if,do-while�� ���
		i =1;
		do{
			if(i%10==0){
				System.out.print(i+" ");
			}
			i++;
		}while(i<=300);
	}//main-end
}//class-end
