package ch04_ctrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test07_switch {

	public static void main(String[] args) throws Exception {
		//��(��)�� �Է� �޾Ƽ� �� ���� ��¥ ���� ����ϼ���
		//1 2 3 4 5 6 7 8 9 10 11 12
		String strMonth = ""; //���� ���� ����
		int month = 0; //���� ���ڷ� ���� ����
		int days = 0; //��¥�� ���� ���� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//                                                �ѱ��ھ� �о ���ۿ� ����
		System.out.print("��(��)�� �Է��ϼ��� >> ");
		strMonth = br.readLine(); //line������ �д´� 
		month = Integer.parseInt(strMonth); //���ڿ��� ���ڷ� ��ȯ
		if(month<1 || month>12){
			System.out.println("1������ 12�f������ �Է��ϼ��� ");
		}else{
			switch(month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days=31;
					break;
				case 2:
					days=28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days=30;
					break;
			}//switch-end
			System.out.println(month+"����"+days+"���� �ִ� ���Դϴ�. ");
		}//else-end
	}//main-end
}//class-end
