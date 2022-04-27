package ch23_db;
import java.sql.*;
public class Test05_Mysql {
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
			sql = "insert into test5 values('홍길동','홍길동글','나 홍길동은 자바공부 중'),"
					+ "('이순신','이순신글','나 이순신은 칼들고 연습중'),"
					+ "('허수경','허수경글','나 허수경은 홈쇼핑 진행중')";
			stmt = con.createStatement();
			//stmt.executeUpdate(sql);
			//Update
			sql = "update test5 set name='홍길순' where name='홍길동'";
			//stmt.executeUpdate(sql);
			//delete
			sql = "delete from test5 where name='홍길순'";
			//stmt.executeUpdate(sql);
			//list:select 
			sql = "select * from test5";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String name = rs.getString("name");
				String title = rs.getString("title");
				String content = rs.getString("content");
				System.out.println("글쓴이:"+name);
				System.out.println("글제목:"+title);
				System.out.println("글내용:"+content);
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
