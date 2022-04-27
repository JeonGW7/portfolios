package ch15_io;
import java.io.*;
public class Test02_FileR {
	public static void main(String[] args) {
		FileReader fr = null;
		try{
			fr = new FileReader("a.txt");
			int a;
			while((a=fr.read())!= -1){ //파일 끝이 아닌동안 반복수행 
				System.out.print((char)a);
			}//while-end
		}catch(IOException ex){
			System.out.println(ex);
		}finally{
			try{
				fr.close();
			}catch(IOException ex2){}
		}//finally-end
		
	}//main-end
}//class-end
