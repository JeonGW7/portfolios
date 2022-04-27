package ch15_io;
import java.io.*;
public class Test06_ByteW {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("c.txt");
			for(int i=1;i<=7;i++){
				fos.write(i); //파일로 쓰기
			}
		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			try{
				fos.close();
			}catch(Exception ex2){}
		}//finally-end
	}//main-end
}//class-end
