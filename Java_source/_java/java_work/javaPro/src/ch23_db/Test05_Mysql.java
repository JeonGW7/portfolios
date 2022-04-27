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
			System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException cnf){
			System.out.println("����̹� �ε� ����:"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD);
			System.out.println("DB���� ����");
			String sql = "";
			//insert
			sql = "insert into test5 values('ȫ�浿','ȫ�浿��','�� ȫ�浿�� �ڹٰ��� ��'),"
					+ "('�̼���','�̼��ű�','�� �̼����� Į��� ������'),"
					+ "('�����','������','�� ������� Ȩ���� ������')";
			stmt = con.createStatement();
			//stmt.executeUpdate(sql);
			//Update
			sql = "update test5 set name='ȫ���' where name='ȫ�浿'";
			//stmt.executeUpdate(sql);
			//delete
			sql = "delete from test5 where name='ȫ���'";
			//stmt.executeUpdate(sql);
			//list:select 
			sql = "select * from test5";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String name = rs.getString("name");
				String title = rs.getString("title");
				String content = rs.getString("content");
				System.out.println("�۾���:"+name);
				System.out.println("������:"+title);
				System.out.println("�۳���:"+content);
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
