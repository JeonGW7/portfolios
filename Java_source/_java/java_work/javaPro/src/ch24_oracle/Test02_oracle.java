package ch24_oracle;
import java.sql.*;
public class Test02_oracle {
	public static void main(String[] args) {
		String DRIVER="oracle.jdbc.driver.OracleDriver";
		String URL="jdbc:oracle:thin:@localhost:1521:XE";
		String USER="scott";
		String PWD="tiger";
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql="";
		try{
			Class.forName(DRIVER);
			System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException cnf){
			System.out.println("����̹� �ε� ����:"+cnf);
		}
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//DB����
			System.out.println("DB���� ����");
			stmt=con.createStatement(); //Statement����
			//insert
			sql="insert into test2 (id,pw,name,addr) values "
					+ "('kim','k123','������','��󳲵�')";
			//stmt.executeUpdate(sql);
			sql="insert into test2 (id,pw,name,addr) values "
					+ "('lee','lee123','�̵���','��õ �۵�')";
			//stmt.executeUpdate(sql);
			sql="insert into test2 (id,pw,name,addr) values "
					+ "('park','p123','������','���� ����')";
			//stmt.executeUpdate(sql);
			//DB���蹮��
			//update������ ���ÿ� update ���̺��̸� set �ʵ��='��', �ʵ��=���� where ����;
			//id�� kim�� ����� �̸��� ���������� �����Ͻÿ�
			sql="update test2 set name='������' where id='kim'";
			//stmt.executeUpdate(sql);//���� ����
			//DB����
			//delete ������ ���ÿ� : delete from ���̺��̸� where ����
			sql="delete from test2 where id='kim'";
			//stmt.executeUpdate(sql);
			
			//select
			rs=stmt.executeQuery("select * from test2");
			while(rs.next()){
				String id=rs.getString("id");
				String pw=rs.getString("pw");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(id+"--"+pw+"--"+name+"--"+addr);
			}
		
			
		}catch(SQLException se){
			System.out.println("DB���� ����");
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex){}
		}
	}//main-end
}//class-end
