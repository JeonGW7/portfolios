package ch20_network;
import java.net.*;
import java.io.*;
public class SimpleClient {
	public static void main(String[] args) {
		//����
		Socket sock = null;
		DataInputStream in = null; 
		DataOutputStream out = null;
		String msg = "Ŭ���̾�Ʈ 192.168.0.193 �Դϴ�"+args[1];
		try{
			sock = new Socket(args[0],5555);
			//				   ����ip    port
			in = new DataInputStream(sock.getInputStream());
			System.out.println(in.readUTF()); //������ ������ ���� ���
			out = new DataOutputStream(sock.getOutputStream());
			out.writeUTF(msg);//������ ������
			in.close();
			out.close();
			sock.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main-end
}//class-end
