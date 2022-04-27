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
			//System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD); //DB연결
			//System.out.println("DB연결 성공");
			String sql = "";
			//insert
			sql = "insert into test2 values ('kim','김길동','kim@daum.net'),"
					+ "('lee','이순신','lee@naver.com'),"
					+ "('lee2','이동국','kim@nate.com')";
			stmt = con.createStatement(); 
			//stmt.executeUpdate(sql);
			//update
			sql = "update test2 set name='이시안' where name ='이동국'";
			//stmt.executeUpdate(sql);
			//delete 
			sql = "delete from test2 where name ='이순신'";
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		}catch(SQLException ex){
			System.out.println("DB연결 실패:"+ex);
		}
	}
}
