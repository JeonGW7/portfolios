package ch15_io;
import java.io.*;
public class Test08_buff_byteWR {
	public static void main(String[] args) throws Exception{
		//==================================================================================
		//d.txt 쓰기
		//==================================================================================
//		FileOutputStream fos = new FileOutputStream("d.txt");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d.txt")); // 위 2줄을 1줄로 작성
		for(int i=1;i<=10;i++){
			bos.write(i);
		}//for-end
		bos.close();
		//==================================================================================
		//d.txt로 부터 읽기
		//==================================================================================
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d.txt"));
		int a;
		while((a=bis.read())!= -1){//파일끝이 아닌동안 반복수행
			System.out.print(a+" ");
		}//while-end
		bis.close();
	}//main-end
}//class-end
