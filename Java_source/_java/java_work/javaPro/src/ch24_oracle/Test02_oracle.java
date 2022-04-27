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
			System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패:"+cnf);
		}
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//DB연결
			System.out.println("DB연결 성공");
			stmt=con.createStatement(); //Statement생성
			//insert
			sql="insert into test2 (id,pw,name,addr) values "
					+ "('kim','k123','김제동','경상남도')";
			//stmt.executeUpdate(sql);
			sql="insert into test2 (id,pw,name,addr) values "
					+ "('lee','lee123','이동국','인천 송도')";
			//stmt.executeUpdate(sql);
			sql="insert into test2 (id,pw,name,addr) values "
					+ "('park','p123','박지성','서울 강남')";
			//stmt.executeUpdate(sql);
			//DB시험문제
			//update형식을 쓰시오 update 테이블이름 set 필드명='값', 필드명=숫자 where 조건;
			//id가 kim인 사람의 이름을 정동원으로 변경하시오
			sql="update test2 set name='정동원' where id='kim'";
			//stmt.executeUpdate(sql);//쿼리 수행
			//DB문제
			//delete 형식을 쓰시오 : delete from 테이블이름 where 조건
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
			System.out.println("DB연결 실패");
		}finally{
			try{
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex){}
		}
	}//main-end
}//class-end
