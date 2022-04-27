package ch15_io;
import java.io.*;
public class Test08_buff_byteWR {
	public static void main(String[] args) throws Exception{
		//==================================================================================
		//d.txt ����
		//==================================================================================
//		FileOutputStream fos = new FileOutputStream("d.txt");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d.txt")); // �� 2���� 1�ٷ� �ۼ�
		for(int i=1;i<=10;i++){
			bos.write(i);
		}//for-end
		bos.close();
		//==================================================================================
		//d.txt�� ���� �б�
		//==================================================================================
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d.txt"));
		int a;
		while((a=bis.read())!= -1){//���ϳ��� �ƴѵ��� �ݺ�����
			System.out.print(a+" ");
		}//while-end
		bis.close();
	}//main-end
}//class-end
