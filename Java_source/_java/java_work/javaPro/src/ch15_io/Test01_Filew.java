package ch15_io;
import java.io.*;
//a.txt�� ���� (���)
//���ڽ�Ʈ�� : �����ڵ�� ó�� , �׷��� �޸������� ���� �� �ִ�  
public class Test01_Filew {
	public static void main(String[] args) {
		FileWriter fw = null; //Ŭ�������� null�� �ʱ�ȭ�Ѵ� 
		try{
			fw = new FileWriter("a.txt");
			for(int i=1;i<=3;i++){
				fw.write("�ٹ�ȣ: "+i+"\n");//���Ϸ� �����۾�
			}//for-end
		}catch(IOException ex){
			System.out.println(ex);
		}finally{//���ܹ߻��� ������� ����Ǵ� �����̴� 
			try{
				fw.close();
			}catch(IOException ex2){}
		}//finally-end //�ݴ°� ������ ������Ѵ� 
	}//main-end
}//class-end
