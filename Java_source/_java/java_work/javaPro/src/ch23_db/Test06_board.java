package ch23_db;
import java.sql.*; //JDBC 인터페이스 
public class Test06_board {
	public static void main(String[] args) {
		String DRIVER ="com.mysql.jdbc.Driver"; //패키지.패키지.패키지.클래스 
		String URL = "jdbc:mysql://localhost:3306/mydb";
		String USER = "root";
		String PWD = "12345";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null; //select시 사용
		try{
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패: "+cnf);
		}
		
		try{
			con = DriverManager.getConnection(URL,USER,PWD);//DB연결
			System.out.println("DB연결 성공");
			stmt=con.createStatement(); //Statement 생성, 쿼리문을 위해 필요
			String sql = "";
			//insert
			sql = "insert into board(num,title,name,content,wdate) values(0,'박진우글','박진우','No No No',NOW())";
			//stmt.executeUpdate(sql); //쿼리 수행
			//update : 홍길동을 홍길순으로 수정하시오, p.k로 조건줘서 수정
			sql = "update board set name='홍길순' where num=1";
			//stmt.executeUpdate(sql);//쿼리 수행
			//delete : num=1인 데이터 삭제
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
			System.out.println("DB연결 실패:"+se);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//main-end
}//class-end
