package ch23_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02_Mysql {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/mydb";
		String USER = "root";
		String PWD = "12345";
		
		Connection con = null;
		Statement stmt = null;
		
		try{
			Class.forName(DRIVER); 
			//System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException cnf){
			System.out.println("����̹� �ε� ����"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD); //DB����
			//System.out.println("DB���� ����");
			String sql = "";
			//insert
			sql = "insert into test2 values ('kim','��浿','kim@daum.net'),"
					+ "('lee','�̼���','lee@naver.com'),"
					+ "('lee2','�̵���','kim@nate.com')";
			stmt = con.createStatement(); 
			//stmt.executeUpdate(sql);
			//update
			sql = "update test2 set name='�̽þ�' where name ='�̵���'";
			//stmt.executeUpdate(sql);
			//delete 
			sql = "delete from test2 where name ='�̼���'";
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		}catch(SQLException ex){
			System.out.println("DB���� ����:"+ex);
		}
	}
}
