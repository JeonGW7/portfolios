package ch15_io;
import java.io.*;
public class Test09_data_byteWR {
	public static void main(String[] args) throws Exception{
//		FileOutputStream fos = new FileOutputStream("e.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e.txt"));
		//DataOutputStream�� �پ��� �ڷ����� ���Ͽ� ���� �۾��� �� �� �ִ� 
		dos.writeByte(127);//byte�ִ�, 128���ʹ� ���� , (-128~127)
		dos.writeChar('A');
		dos.writeInt(32767);
		dos.writeFloat(22.5f); //f�� �ٿ������
		dos.writeDouble(22.5); //d �������� 22.5d
		dos.writeBoolean(true);
		//dos.writeChars("�ѱ�\n"); //\n�� ����� readline���� �о�ö� �ؿ����� �ȵ���´�, �ѱ��� ������
		dos.writeUTF("������"); //�ѱ� ���ڵ�ó������ �ϴ� �޼���, �� �޼���� ä�� ���α׷� �� ����
		dos.close(); 
		//--------------------------------------------------------------------------
		//e.txt�� ���� ���� �б� 
		DataInputStream dis = new DataInputStream(new FileInputStream("e.txt"));
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
//		System.out.println(dis.readLine()); //��� ����
		System.out.println(dis.readUTF()); //�ѱ����ڵ�ó������ �ϴ� �޼���,ä�����α׷����� ��� �� ����
		dis.close();
	}//main-end
}//class-end
