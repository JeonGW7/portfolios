package ch20_network;
import java.io.*;
import java.net.*;
public class SimpleServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//변수
		ServerSocket ss = null;//class는 null로 초기화
		Socket sock = null;
		String msg = "반갑습니다 :) 192.168.0.193 서버 입니다";
		DataOutputStream out = null;//writeUTF()
		DataInputStream in = null;//readUTF()
		try{
			ss = new ServerSocket(5555);//서버 소켓 생성
			System.out.println("서버 구동 중");
		}catch(Exception ex){
			System.out.println(ex);
		}
		//
		while(true){
			try{
				sock = ss.accept(); //클라이언트의 요청을 받아서 소켓연결을 한다. 그러면 대화 가능하다 
				out = new DataOutputStream(sock.getOutputStream());
				out.writeUTF(msg);//msg를 클라이언트로 보냄
				in = new DataInputStream(sock.getInputStream());
				System.out.println(in.readUTF());//클라이언트가 보낸 내용을 읽어와서 출력
				out.close();
				in.close();
				sock.close();//서버는 저장만 하고, 실행은 cmd창에서 한다 
			}catch(Exception ex2){
				System.out.println(ex2);
			}
		}//while-end
	}//main-end
}//class-end
