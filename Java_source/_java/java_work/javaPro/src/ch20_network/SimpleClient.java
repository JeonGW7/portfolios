package ch20_network;
import java.net.*;
import java.io.*;
public class SimpleClient {
	public static void main(String[] args) {
		//변수
		Socket sock = null;
		DataInputStream in = null; 
		DataOutputStream out = null;
		String msg = "클라이언트 192.168.0.193 입니다"+args[1];
		try{
			sock = new Socket(args[0],5555);
			//				   서버ip    port
			in = new DataInputStream(sock.getInputStream());
			System.out.println(in.readUTF()); //서버가 보내준 내용 출력
			out = new DataOutputStream(sock.getOutputStream());
			out.writeUTF(msg);//서버로 보낸다
			in.close();
			out.close();
			sock.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main-end
}//class-end
