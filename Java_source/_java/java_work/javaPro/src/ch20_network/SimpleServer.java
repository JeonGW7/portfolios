package ch20_network;
import java.io.*;
import java.net.*;
public class SimpleServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//����
		ServerSocket ss = null;//class�� null�� �ʱ�ȭ
		Socket sock = null;
		String msg = "�ݰ����ϴ� :) 192.168.0.193 ���� �Դϴ�";
		DataOutputStream out = null;//writeUTF()
		DataInputStream in = null;//readUTF()
		try{
			ss = new ServerSocket(5555);//���� ���� ����
			System.out.println("���� ���� ��");
		}catch(Exception ex){
			System.out.println(ex);
		}
		//
		while(true){
			try{
				sock = ss.accept(); //Ŭ���̾�Ʈ�� ��û�� �޾Ƽ� ���Ͽ����� �Ѵ�. �׷��� ��ȭ �����ϴ� 
				out = new DataOutputStream(sock.getOutputStream());
				out.writeUTF(msg);//msg�� Ŭ���̾�Ʈ�� ����
				in = new DataInputStream(sock.getInputStream());
				System.out.println(in.readUTF());//Ŭ���̾�Ʈ�� ���� ������ �о�ͼ� ���
				out.close();
				in.close();
				sock.close();//������ ���常 �ϰ�, ������ cmdâ���� �Ѵ� 
			}catch(Exception ex2){
				System.out.println(ex2);
			}
		}//while-end
	}//main-end
}//class-end
