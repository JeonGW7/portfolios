package board;
import java.sql.*; //Connection,Statement,PreparedStatement,ResultSet

import javax.sql.*; //DataSource
import javax.naming.*; //lookup

import java.util.*; //List-ArrayList,Vector
//DAO:CRUD작업
public class BoardDAO {
	private static BoardDAO instance=new BoardDAO();
	private BoardDAO(){} //생성자
	public static BoardDAO getDao(){ //JSP에서 사용할 메서드
		return instance;
	}
	//----------------------
	// 커넥션 풀 사용
	//----------------------
	private Connection getCon() throws Exception{
		Context ct=new InitialContext();
		DataSource ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		return ds.getConnection();
	}
	//----------------------
	// 게시판 글쓰기
	//----------------------
	public void insertBoard(BoardDTO dto){
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=getCon(); //커넥션 얻기
			String sql="insert into board(num,name,subject,content,pw,ip) values(0,?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getPw());
			pstmt.setString(5, dto.getIp());
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("insertBoard() 예외"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}
	
}//class-end
