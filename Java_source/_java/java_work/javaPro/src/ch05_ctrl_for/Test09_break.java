package ch05_ctrl_for;
//break : switch-case ���� ���������� �ʼ��� �������
//break : �ݺ� loop�� �������� �� ����ϱ⵵ �Ѵ�. 
public class Test09_break {

	public static void main(String[] args) {
		for(int i=1;i<=10000;i++){
			System.out.print(i+" ");
			if(i==10) break; //for���� ����������
		}//for-end
		System.out.println();
		//
		int j = 1;
		while(j<=10){
			System.out.print(j+" ");
			if(j==10)break; //�ݺ�loopŻ��
			j++;
		}//while-end
	}//main-end
}//class-end
