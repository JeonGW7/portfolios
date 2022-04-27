package ch23_db;
import java.sql.*; //JDBC �������̽� 
public class Test06_board {
	public static void main(String[] args) {
		String DRIVER ="com.mysql.jdbc.Driver"; //��Ű��.��Ű��.��Ű��.Ŭ���� 
		String URL = "jdbc:mysql://localhost:3306/mydb";
		String USER = "root";
		String PWD = "12345";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null; //select�� ���
		try{
			Class.forName(DRIVER);
			System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException cnf){
			System.out.println("����̹� �ε� ����: "+cnf);
		}
		
		try{
			con = DriverManager.getConnection(URL,USER,PWD);//DB����
			System.out.println("DB���� ����");
			stmt=con.createStatement(); //Statement ����, �������� ���� �ʿ�
			String sql = "";
			//insert
			sql = "insert into board(num,title,name,content,wdate) values(0,'�������','������','No No No',NOW())";
			//stmt.executeUpdate(sql); //���� ����
			//update : ȫ�浿�� ȫ������� �����Ͻÿ�, p.k�� �����༭ ����
			sql = "update board set name='ȫ���' where num=1";
			//stmt.executeUpdate(sql);//���� ����
			//delete : num=1�� ������ ����
			sql = "delete from board where num=1";
			//stmt.executeUpdate(sql);
			//select - list
			sql = "select * from board";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String name = rs.getString("name");
				String content = rs.getString("content");
				String wdate = rs.getString("wdate");
				System.out.println(num+"=="+title+"--"+name+"--"+content+"--"+wdate);
			}//while-end
		}catch(SQLException se){
			System.out.println("DB���� ����:"+se);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//main-end
}//class-end
