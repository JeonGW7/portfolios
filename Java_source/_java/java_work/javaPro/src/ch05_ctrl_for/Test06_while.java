package ch05_ctrl_for;

public class Test06_while {

	public static void main(String[] args) {
		//while������ "������ ȭ����" 5�� ����ϱ�
		int i =1; //�ʱ�ġ
		while(i<=5){
			System.out.println("������ ȭ����");
			i++; //����ġ
		}
		System.out.println();
		//
		//1~10���� ���
		i = 1; //���� ����
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}//while-end
		//
		System.out.println();
		//
		//1���� 10���� ¦���� ��� if,while�� ���
		i=1;
		while(i<=10){
			if(i%2==0){
				System.out.print(i+" ");
			}
			i++;
		}//while-end
		System.out.println();
		//
		//1���� ���� 100���� 8�� ��� ���
		i=1;
		while(i<=100){
			if(i%8==0){
				System.out.print(i+" ");
			}
			i++;
		}//while-end
	}//main-end
}//class-end
