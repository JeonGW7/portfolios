package ch15_io;
import java.io.*;
//Printwriter(OutputStream os) ������
//Printwriter(OutputStream os,boolean flushOnNewLine) ������
//boolean flushOnNewLine : �ٹٲ� ���� ����(true/false) - true�� �ٹٲ�
//PrinterWriter(Writer w) ������
//PrinterWriter(Writer w, boolean flushOnNewLine) ������ 
//
//java�� PrintWriter ��ü�� Object�� ����� ��� ���Ŀ� ���ؼ� 
//print()�� println()�޼��带 �����Ѵ�
public class Test05_Printwriter {
	public static void main(String[] args) throws Exception { 
		PrintWriter pp = new PrintWriter(System.out);
		Object ob = new String("���缮");
		String name = "�̼���";
		String irum = new String("�̹��");
		pp.println(ob);
		pp.println(name);
		pp.println(irum);
		pp.println(100);
		pp.println(100.5);
		pp.println(true);
		pp.println("ȫ�浿");
		pp.println('A');
		
		pp.close();
	}//main-end
}//class-end
