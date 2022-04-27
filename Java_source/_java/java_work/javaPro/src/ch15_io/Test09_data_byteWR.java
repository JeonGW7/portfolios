package ch15_io;
import java.io.*;
public class Test09_data_byteWR {
	public static void main(String[] args) throws Exception{
//		FileOutputStream fos = new FileOutputStream("e.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e.txt"));
		//DataOutputStream은 다양한 자료형에 대하여 쓰기 작업을 할 수 있다 
		dos.writeByte(127);//byte최대, 128부터는 에러 , (-128~127)
		dos.writeChar('A');
		dos.writeInt(32767);
		dos.writeFloat(22.5f); //f를 붙여줘야함
		dos.writeDouble(22.5); //d 생략가능 22.5d
		dos.writeBoolean(true);
		//dos.writeChars("한글\n"); //\n을 해줘야 readline으로 읽어올때 밑에줄이 안따라온다, 한글은 못읽음
		dos.writeUTF("아이유"); //한글 인코딩처리까지 하는 메서드, 이 메서드로 채팅 프로그램 할 예정
		dos.close(); 
		//--------------------------------------------------------------------------
		//e.txt로 부터 파일 읽기 
		DataInputStream dis = new DataInputStream(new FileInputStream("e.txt"));
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
//		System.out.println(dis.readLine()); //경고가 나옴
		System.out.println(dis.readUTF()); //한글인코딩처리까지 하는 메서드,채팅프로그램에서 사용 할 예정
		dis.close();
	}//main-end
}//class-end
