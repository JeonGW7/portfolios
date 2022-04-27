package ch15_io;
import java.io.*;
//Printwriter(OutputStream os) 생성자
//Printwriter(OutputStream os,boolean flushOnNewLine) 생성자
//boolean flushOnNewLine : 줄바꿈 여부 지정(true/false) - true면 줄바꿈
//PrinterWriter(Writer w) 생성자
//PrinterWriter(Writer w, boolean flushOnNewLine) 생성자 
//
//java의 PrintWriter 객체는 Object를 비롯한 모든 형식에 대해서 
//print()와 println()메서드를 지원한다
public class Test05_Printwriter {
	public static void main(String[] args) throws Exception { 
		PrintWriter pp = new PrintWriter(System.out);
		Object ob = new String("유재석");
		String name = "이순신";
		String irum = new String("이방원");
		pp.println(ob);
		pp.println(name);
		pp.println(irum);
		pp.println(100);
		pp.println(100.5);
		pp.println(true);
		pp.println("홍길동");
		pp.println('A');
		
		pp.close();
	}//main-end
}//class-end
