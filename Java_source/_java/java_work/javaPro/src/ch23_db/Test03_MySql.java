package ch23_db;
import java.sql.*;
public class Test03_MySql {
	public static void main(String[] args) {
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/mydb";
		String USER = "root";
		String PWD = "12345";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패:"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD);
			System.out.println("DB연결 성공");
			String sql = "";
			//insert
			sql = "insert into test3 values('hong','h123','홍길동','hong@daum.net','서울시'),"
					+ "('lee','l123','이순신','lee@naver.com','경상남도'),"
					+ "('gab','g123','갑순이','gab@nate.com','경기도')";
			stmt = con.createStatement();
			//stmt.executeUpdate(sql);
			//update 
			sql = "update test3 set name='갑돌이' where name='갑순이'";
			//stmt.executeUpdate(sql);
			sql = "delete from test3 where name ='갑돌이'";
			//stmt.executeUpdate(sql);
			//list:select
			sql = "select * from test3";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String addr = rs.getString("addr");
				System.out.println("id:"+id+" pw:"+pw+" name:"+name+" email:"+email+" addr:"+addr);
			}
		}catch(SQLException ex){
			System.out.println("DB연결 실패:"+ex);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex5){}
		}
	}
}