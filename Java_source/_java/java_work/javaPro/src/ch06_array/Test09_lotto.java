package ch06_array;
//�ζ� 1~45 
public class Test09_lotto {

	public static void main(String[] args) {
		int lotto[] = new int[6]; //�迭 ����
		for(int i=0;i<6;i++){
			lotto[i] = (int)(Math.random()*(45-1+1))+1;
			//�ߺ� ���� ���� �� ��ȿȭ ó�� �ϱ����� 
			for(int j=0;j<i;j++){
				if(lotto[i]==lotto[j]){
					//���� ���� ������ ��ȿȭ
					i--;
					break;//forŻ��
				}//if-end
			}//inner-for
		}//out-for
		//
		//�迭�� ���
		for(int i=0;i<6;i++){
			System.out.print(lotto[i]+" ");
		}
	}//main-end

}//class-end
