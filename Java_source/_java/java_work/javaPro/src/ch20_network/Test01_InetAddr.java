package ch20_network;
import java.net.*;
public class Test01_InetAddr {
	public static void main(String[] args) {
		try{
			InetAddress addr[] = InetAddress.getAllByName(args[0]);//������ ������ ip�������
			for(int i=0;i<addr.length;i++){
				System.out.println(addr[i].getHostName());//������ �̸�
				System.out.println(addr[i].getHostAddress());//������ �ּ� 
			}
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main-end
}//class-end
