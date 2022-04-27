package ch16_util;
import java.util.*;
//getProperty(key) : ���� ���� �� 
//put(key,value) : ���� ���� �� 
public class Test09_Properties {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.put("driver", "com.mysql.jdbc.Driver");
		pro.put("url", "jdbc:mysql://localhost:3306/mydb");
		pro.put("user", "root");
		pro.put("pwd", "12345");
		//�Ӽ� ��������
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String user = pro.getProperty("user");
		String pwd = pro.getProperty("pwd");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd);
		System.out.println();
		//
		
		//Enumeration ��� , �������� ó��
		Enumeration en = pro.propertyNames();
		while(en.hasMoreElements()){ //��Ұ� �ִµ��� �ݺ����� 
			String k = (String)en.nextElement();//key���� ��´�
			String v = pro.getProperty(k); //k�� �ش��ϴ� ���� ��´� 
			System.out.println(k+":"+v);
		}//while-end
	}//main-end
}//class-end
