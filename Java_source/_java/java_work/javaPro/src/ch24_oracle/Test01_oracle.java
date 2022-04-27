package ch24_oracle;
import java.sql.*; //JDBC 인터페이스들 사용 
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
			System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패:"+cnf);
		}
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD); //DB연결
			System.out.println("DB연결 성공");
			stmt=con.createStatement();//Statement생성
			
			//insert
			sql="insert into board(num,title,name,content,wdate) "
					+ "values(board_seq.NEXTVAL,'홍길동글','홍길동','안녕하세요',sysdate)";
			//stmt.executeUpdate(sql); //쿼리수행
			sql="insert into board(num,title,name,content,wdate) "
					+ "values(board_seq.NEXTVAL,'이순신글','이순신','안녕하세요',sysdate)";
			//stmt.executeUpdate(sql); //쿼리수행
			sql="insert into board(num,title,name,content,wdate) "
					+ "values(board_seq.NEXTVAL,'박문수글','박문수','안녕하세요',sysdate)";
			//stmt.executeUpdate(sql); //쿼리수행
			
			//update:홍길동을 홍길순으로 수정
			sql="update board set name='홍길순' where num=1";
			//stmt.executeUpdate(sql); //쿼리수행
			
			//delete:홍길순을 삭제
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
			System.out.println("DB연결 실패:"+se);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex3){}
		}//finally-end
		
	}//main-end
}//class-end
