package ch16_util;
import java.util.*;
public class Test03_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //�ν��Ͻ� ��ü��� - �߻�Ŭ�������� new �Ұ���
		int year = cal.get(Calendar.YEAR); //�⵵
		int month = cal.get(Calendar.MONTH)+1; //�� 0(1��) 1(2��) ~~~ 11(12��)
		int day = cal.get(Calendar.DATE); //��
		int h = cal.get(Calendar.HOUR); //�ð�
		int m = cal.get(Calendar.MINUTE); //��
		int s = cal.get(Calendar.SECOND); // ��
		System.out.println(year+"/"+month+"/"+day+" "+h+":"+m+":"+s);
		System.out.println(year+"��"+month+"��"+day+"��"+h+"��"+m+"��"+s+"��");
	}//main-end
}//class-end
