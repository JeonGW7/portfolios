package ch23_db;
import java.sql.*; //JDBC�������̽�  
//JDBC �������̽� : DriverManager, Connection, Statement, PreparedStatement, ResultSet ����
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
			System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException cnf){
			System.out.println("����̹� �ε� ����"+cnf);
		}
		try{
			con = DriverManager.getConnection(URL,USER,PWD); //DB����
			//System.out.println("DB���� ����");
			String sql="";
			//insert
			sql = "insert into test values ('aa','a123','����','�̱�'),('bb','b123','���','�̱�')";
			stmt = con.createStatement(); //statement ����
			//stmt.executeUpdate(sql); //���� ���� 
			
			
			//update
			//'��ȿ��'�� �̻������ ����
			sql = "update test set name='�̻��' where name='��ȿ��'";
			//stmt.executeUpdate(sql); //���� ���� 
			
			
			//delete 
			//'�̻��'�� ���� 
			sql = "delete from test where name='�̻��'";
			stmt.executeUpdate(sql);
			
			//list:select
			sql="select * from test";
			rs = stmt.executeQuery(sql); //���� ���� , �� ���� ����� ����
			while(rs.next()){
				String id = rs.getString("id");
				//						 DB�ʵ��
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(id+"--"+pw+"--"+name+"--"+addr);
			}//while-end
			
			
			
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException ex){
			System.out.println("DB���� ����:"+ex);
		}
	}//main-end
}//class-end
