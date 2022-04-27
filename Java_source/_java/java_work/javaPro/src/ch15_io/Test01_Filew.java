package ch15_io;
import java.io.*;
//a.txt로 저장 (출력)
//문자스트림 : 유니코드로 처리 , 그래서 메모장으로 읽을 수 있다  
public class Test01_Filew {
	public static void main(String[] args) {
		FileWriter fw = null; //클래스들은 null로 초기화한다 
		try{
			fw = new FileWriter("a.txt");
			for(int i=1;i<=3;i++){
				fw.write("줄번호: "+i+"\n");//파일로 쓰기작업
			}//for-end
		}catch(IOException ex){
			System.out.println(ex);
		}finally{//예외발생과 상관없이 실행되는 구문이다 
			try{
				fw.close();
			}catch(IOException ex2){}
		}//finally-end //닫는걸 무조건 해줘야한다 
	}//main-end
}//class-end
