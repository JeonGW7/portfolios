package ch23_db;
import java.sql.*;
public class Test04_Mysql {
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
			System.out.println("드라이버 로딩 실패"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD); //DB연결
			System.out.println("DB연결 성공");
			String sql = "";
			//insert
			sql = "insert into test4 values ('h123','홍길동','010-2323-565'),"
					+ "('h124','이순신','010-5555-666'),"
					+ "('h125','허수경','010-4545-7878')";
			stmt = con.createStatement(); 
			//stmt.executeUpdate(sql);
			//update
			sql = "update test4 set name='이효리' where name ='허수경'";
			stmt.executeUpdate(sql);
			//delete
			sql = "delete from test4 where name ='이효리'";
			//stmt.executeUpdate(sql);
			//list:select 
			sql = "select * from test4";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String hakbun = rs.getString("hakbun");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				System.out.println("학번:"+hakbun);
				System.out.println("이름:"+name);
				System.out.println("전화번호:"+tel);
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
