package ch15_io;
import java.io.*;
//버퍼 사용 파일 쓰기
//버퍼 사용 파일 읽기
public class Test03_buffWR {
	public static void main(String[] args) throws Exception{
//		FileWriter fw = new FileWriter("b.txt");
//		BufferedWriter bw = new BufferedWriter(fw);//객체생성
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));//위 2줄을 합친것
		//파일로(b.txt)문자열 쓰기 
		for(int i=1;i<=5;i++){
			bw.write("줄번호:"+i+"\n");
		}//for-end
		bw.close(); //////******
		//----------------------
		//파일로부터(b.txt)문자열 읽기
		//----------------------
//		FileReader fr = new FileReader("b.txt");
//		BufferedReader br = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));//위 2줄을 합친것
		//파일로 부터 각 라인단위로 읽어서 화면에 출력
		String str="";
		while((str=br.readLine())!=null){//파일 끝이 null이 아닌동안 반복 수행 
			System.out.println(str);
		}//while-close
		br.close();
	}//main-end
}//class-end
