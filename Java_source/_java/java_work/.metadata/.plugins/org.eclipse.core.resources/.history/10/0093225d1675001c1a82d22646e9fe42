package ch15_io;
import java.io.*;
//c.txt 파일로부터 읽기
public class Test07_ByteR {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("c.txt");
			int a = 0;
			while((a=fis.read())!= -1){//파일 끝이 아닌동안 반복수행
				System.out.print(a+" ");
			}
		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			try{
				fis.close();
			}catch(Exception ex2){}
		}
	}//main-end
}//class-end
