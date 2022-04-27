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
			System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException cnf){
			System.out.println("����̹� �ε� ����:"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD);
			System.out.println("DB���� ����");
			String sql = "";
			//insert
			sql = "insert into test3 values('hong','h123','ȫ�浿','hong@daum.net','�����'),"
					+ "('lee','l123','�̼���','lee@naver.com','��󳲵�'),"
					+ "('gab','g123','������','gab@nate.com','��⵵')";
			stmt = con.createStatement();
			//stmt.executeUpdate(sql);
			//update 
			sql = "update test3 set name='������' where name='������'";
			//stmt.executeUpdate(sql);
			sql = "delete from test3 where name ='������'";
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
			System.out.println("DB���� ����:"+ex);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex5){}
		}
	}
}