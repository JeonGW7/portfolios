package ch16_util;
import java.util.*;

//StringTokenizer : ���ڿ� �Ľ� �ϴ� ����� �ִ�
//�޼���
//nextToken() : �Ľ̵� ���ڿ��� ���ʷ� ��ȯ(����)���ش�
//hasMoreTokens() : nextToken()�� �ڿ� Token�� ���� �ִ��� ���� Ȯ�� 
//countTokens() : ��ū ���� ����

public class Test08_StringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("�趱��|«¥��|���뱹|������ġ|���","|"); // |�� �и���ȣ
		System.out.println("�Ľ̵� ���ڿ� �� ����:"+st.countTokens());
		while(st.hasMoreTokens()){ //��ū�� �ִ� ���� �ݺ� ����
			System.out.println(st.nextToken()); //�Ľ̵� ���ڿ��� ���ʷ� �������ش� 
		}//while-end
		System.out.println();
		//---------------------
		//String.split()
		//---------------------
		String str = "�����:������:���ﵿ ";
		String temp[] = str.split(":"); //���ڿ� �Ľ� |���� Ư�����ڷδ� �Ľ̺Ұ��� 
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}//main-end
}//class-end
