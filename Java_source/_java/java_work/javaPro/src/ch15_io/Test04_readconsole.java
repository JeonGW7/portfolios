package ch15_io;
import java.io.*;
//System.in�� InputStream�� ��ü�̱⶧���� 
//InputStreamReader ������ �μ��� ���޵ȴ� //new InputStreamReader(System.in)
//�׷������� InputStreamReader ��ü�� BufferedReader ������ �μ��� ���޵ȴ� 
//�̷� ����� ���ļ� Ű����κ��� ���� �Է� �޴´�
//new BufferedReader(new InputStreamReader(System.in))
public class Test04_readconsole {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��������>>");
		String strKor = br.readLine();
		int kor = Integer.parseInt(strKor);
		System.out.print("��������>>");
		String strEng = br.readLine();
		int eng = Integer.parseInt(strEng);
		int sum = kor+eng;
		System.out.println("��:"+sum);
	}//main-end
}//class-end
