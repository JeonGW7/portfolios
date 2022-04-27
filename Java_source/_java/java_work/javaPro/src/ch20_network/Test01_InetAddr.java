package ch20_network;
import java.net.*;
public class Test01_InetAddr {
	public static void main(String[] args) {
		try{
			InetAddress addr[] = InetAddress.getAllByName(args[0]);//도메인 넣으면 ip얻기위함
			for(int i=0;i<addr.length;i++){
				System.out.println(addr[i].getHostName());//도메인 이름
				System.out.println(addr[i].getHostAddress());//도메인 주소 
			}
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main-end
}//class-end
