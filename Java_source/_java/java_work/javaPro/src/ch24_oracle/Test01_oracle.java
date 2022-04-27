package ch24_oracle;
import java.sql.*; //JDBC �������̽��� ��� 
public class Test01_oracle {
	@SuppressWarnings("unused")
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
			con=DriverManager.getConnection(URL,USER,PWD); //DB����
			System.out.println("DB���� ����");
			stmt=con.createStatement();//Statement����
			
			//insert
			sql="insert into board(num,title,name,content,wdate) "
					+ "values(board_seq.NEXTVAL,'ȫ�浿��','ȫ�浿','�ȳ��ϼ���',sysdate)";
			//stmt.executeUpdate(sql); //��������
			sql="insert into board(num,title,name,content,wdate) "
					+ "values(board_seq.NEXTVAL,'�̼��ű�','�̼���','�ȳ��ϼ���',sysdate)";
			//stmt.executeUpdate(sql); //��������
			sql="insert into board(num,title,name,content,wdate) "
					+ "values(board_seq.NEXTVAL,'�ڹ�����','�ڹ���','�ȳ��ϼ���',sysdate)";
			//stmt.executeUpdate(sql); //��������
			
			//update:ȫ�浿�� ȫ������� ����
			sql="update board set name='ȫ���' where num=1";
			//stmt.executeUpdate(sql); //��������
			
			//delete:ȫ����� ����
			sql="delete from board where num=1";
			//stmt.executeUpdate(sql);
			
			//select
			rs=stmt.executeQuery("select * from board");
			while(rs.next()){
				int num=rs.getInt("num");
				String title = rs.getString("title");
				String name = rs.getString("name");
				String content = rs.getString("content");
				String wdate = rs.getString("wdate");
				System.out.println(num+"--"+title+"--"+name+"--"+content+"--"+wdate);
			}
			
		}catch(SQLException se){
			System.out.println("DB���� ����:"+se);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex3){}
		}//finally-end
		
	}//main-end
}//class-end
