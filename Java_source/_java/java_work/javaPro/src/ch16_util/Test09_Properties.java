package ch16_util;
import java.util.*;
//getProperty(key) : 값을 얻을 때 
//put(key,value) : 값을 넣을 때 
public class Test09_Properties {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.put("driver", "com.mysql.jdbc.Driver");
		pro.put("url", "jdbc:mysql://localhost:3306/mydb");
		pro.put("user", "root");
		pro.put("pwd", "12345");
		//속성 가져오기
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
		
		//Enumeration 사용 , 순서없이 처리
		Enumeration en = pro.propertyNames();
		while(en.hasMoreElements()){ //요소가 있는동안 반복수행 
			String k = (String)en.nextElement();//key값을 얻는다
			String v = pro.getProperty(k); //k에 해당하는 값을 얻는다 
			System.out.println(k+":"+v);
		}//while-end
	}//main-end
}//class-end
