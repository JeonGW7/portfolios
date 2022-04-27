package ch15_io;
import java.io.*;
//���� ��� ���� ����
//���� ��� ���� �б�
public class Test03_buffWR {
	public static void main(String[] args) throws Exception{
//		FileWriter fw = new FileWriter("b.txt");
//		BufferedWriter bw = new BufferedWriter(fw);//��ü����
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));//�� 2���� ��ģ��
		//���Ϸ�(b.txt)���ڿ� ���� 
		for(int i=1;i<=5;i++){
			bw.write("�ٹ�ȣ:"+i+"\n");
		}//for-end
		bw.close(); //////******
		//----------------------
		//���Ϸκ���(b.txt)���ڿ� �б�
		//----------------------
//		FileReader fr = new FileReader("b.txt");
//		BufferedReader br = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));//�� 2���� ��ģ��
		//���Ϸ� ���� �� ���δ����� �о ȭ�鿡 ���
		String str="";
		while((str=br.readLine())!=null){//���� ���� null�� �ƴѵ��� �ݺ� ���� 
			System.out.println(str);
		}//while-close
		br.close();
	}//main-end
}//class-end
