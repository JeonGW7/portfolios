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
			System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException cnf){
			System.out.println("����̹� �ε� ����"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD); //DB����
			System.out.println("DB���� ����");
			String sql = "";
			//insert
			sql = "insert into test4 values ('h123','ȫ�浿','010-2323-565'),"
					+ "('h124','�̼���','010-5555-666'),"
					+ "('h125','�����','010-4545-7878')";
			stmt = con.createStatement(); 
			//stmt.executeUpdate(sql);
			//update
			sql = "update test4 set name='��ȿ��' where name ='�����'";
			stmt.executeUpdate(sql);
			//delete
			sql = "delete from test4 where name ='��ȿ��'";
			//stmt.executeUpdate(sql);
			//list:select 
			sql = "select * from test4";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String hakbun = rs.getString("hakbun");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				System.out.println("�й�:"+hakbun);
				System.out.println("�̸�:"+name);
				System.out.println("��ȭ��ȣ:"+tel);
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
