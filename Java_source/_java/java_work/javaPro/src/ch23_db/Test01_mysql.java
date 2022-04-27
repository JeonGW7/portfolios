package ch23_db;
import java.sql.*; //JDBC인터페이스  
//JDBC 인터페이스 : DriverManager, Connection, Statement, PreparedStatement, ResultSet 제공
public class Test01_mysql {
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
			//System.out.println("DB연결 성공");
			String sql="";
			//insert
			sql = "insert into test values ('aa','a123','에이','미국'),('bb','b123','비비','미국')";
			stmt = con.createStatement(); //statement 생성
			//stmt.executeUpdate(sql); //쿼리 수행 
			
			
			//update
			//'이효리'를 이상순으로 수정
			sql = "update test set name='이상순' where name='이효리'";
			//stmt.executeUpdate(sql); //쿼리 수행 
			
			
			//delete 
			//'이상순'을 삭제 
			sql = "delete from test where name='이상순'";
			stmt.executeUpdate(sql);
			
			//list:select
			sql="select * from test";
			rs = stmt.executeQuery(sql); //쿼리 수행 , 위 쿼리 결과를 저장
			while(rs.next()){
				String id = rs.getString("id");
				//						 DB필드명
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(id+"--"+pw+"--"+name+"--"+addr);
			}//while-end
			
			
			
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException ex){
			System.out.println("DB연결 실패:"+ex);
		}
	}//main-end
}//class-end
