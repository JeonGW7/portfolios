package mypa;
import java.sql.*;
import java.util.*; //Vector,List,ArrayList
//DAO : Data Access Object (DB처리) CRUD작업 : insert,select,update,delete
public class BoardDAO {
	private String DRIVER="com.mysql.jdbc.Driver";
	private String URL="jdbc:mysql://localhost:3306/mydb";
	private String USER="root";
	private String PWD="12345";
	//생성자:초기화 작업
	public BoardDAO(){
		try{
			Class.forName(DRIVER); //드라이버 로딩
			System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패:"+cnf);
		}
	}
	//insert
	public void insertDB(BoardDTO dto){
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=DriverManager.getConnection(URL,USER,PWD); //DB연결
			String sql="insert into board2(num,writer,subject,content,pw,wdate,ip) values(0,?,?,?,?,NOW(),?)";
			pstmt=con.prepareStatement(sql); //생성시 인자가 들어감 -> sql먼저써야함
			//?값 채우기
			pstmt.setString(1,dto.getWriter());
			pstmt.setString(2,dto.getSubject());
			pstmt.setString(3,dto.getContent());
			pstmt.setString(4,dto.getPw());
			pstmt.setString(5,dto.getIp());
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("insertDB()예외 발생:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//insertDB()-end
	//리스트
	public List getList(){
		List<BoardDTO> list=null;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//DB연결
			stmt=con.createStatement(); //Statement생성
			String sql="select * from board2 order by num desc";
			rs=stmt.executeQuery(sql); //실행시 인자 들어간다
			list=new ArrayList<BoardDTO>(); //객체 생성
			while(rs.next()){
				BoardDTO dto=new BoardDTO(); //객체생성
				//rs내용을 dto담는다
				//dto를 list담는다 
				//list를 리턴 ,클라이언트로 
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPw(rs.getString("pw"));
				dto.setWdate(rs.getString("wdate"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setIp(rs.getString("ip"));
				list.add(dto);//list.jsp화면에 반영,컴파일(저장)
			}//while-end
		}catch(Exception ex){
			System.out.println("getList() 예외발생"+ex);
		}finally{//예외가 발생해도,정상처리가 되도,앞에 return문이 있어도 finally절은 처리된다
			try{
				if(rs!=null){rs.close();}
				if(stmt!=null){rs.close();}				
				if(con!=null){rs.close();}				
			}catch(Exception ex2){}
		}//finally-end
		return list;//클라이언트로 보낸다
	}//getList()-end
	//------------------------------
	// 글내용 보기, 조회수 증가
	//------------------------------
	public BoardDTO getBoard(int num){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BoardDTO dto=null;
		String sql="";
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//DB연결
			//조회수 증가 
			sql="update board2 set readcount=readcount+1 where num="+num;
			pstmt=con.prepareStatement(sql); //생성시 인자들어간다
			pstmt.executeUpdate(); //쿼리 수행
			//글내용 보기 작업
			pstmt=con.prepareStatement("select * from board2 where num="+num);
			rs=pstmt.executeQuery(); //쿼리수행
			if(rs.next()){
				//rs내용을 dto에 넣는다 
				dto=new BoardDTO(); //객체생성
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPw(rs.getString("pw"));
				dto.setWdate(rs.getString("wdate"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setIp(rs.getString("ip"));
			}//if-end
		}catch(Exception ex){
			System.out.println("getBoard() 예외발생:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return dto; //클라이언트로 보낸다, front-end
	}//getBoard()-end
	//=====================
	// 글수정 폼, 클라이언트 화면에 반영
	//=====================
	public BoardDTO getUpdate(int num){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BoardDTO dto=null;
		String sql="";
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//DB연결
			pstmt=con.prepareStatement("select * from board2 where num="+num);
			rs=pstmt.executeQuery(); //쿼리 수행
			if(rs.next()){
				//rs내용을 dto에 저장 
				//dto를 클라이언트로 보낸다(return한다)
				dto=new BoardDTO(); //객체생성
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPw(rs.getString("pw"));
				dto.setWdate(rs.getString("wdate"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setIp(rs.getString("ip"));
			}
		}catch(Exception ex){
			System.out.println("getUpdate() 예외발생:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return dto; //front-end로 보낸다
	}//getUpdate()-end
	//=====================
	// DB글수정, update
	//=====================
	public int updateBoard(BoardDTO dto){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="";
		String dbpw="";
		int x=-100; //x=1 정상수정,x=-1 암호틀림
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//DB연결
			pstmt=con.prepareStatement("select pw from board2 where num=?");
			pstmt.setInt(1, dto.getNum()); //?값 채우고
			rs=pstmt.executeQuery(); //쿼리수행
			if(rs.next()){
				dbpw=rs.getString("pw");
				if(dbpw.equals(dto.getPw())){ //암호가 일치하면 글수정
					sql="update board2 set writer=?,subject=?,content=? where num=?";
					pstmt=con.prepareStatement(sql); //생성시 인자들어감 
					//?값 채워줌
					pstmt.setString(1, dto.getWriter());
					pstmt.setString(2, dto.getSubject());
					pstmt.setString(3, dto.getContent());
					pstmt.setInt(4, dto.getNum());
					pstmt.executeUpdate(); //쿼리수행,글 수정
					x=1; //글 수정
				}else{ //암호가 일치하지 않을때 
					x=-1; 
				}
			}
		}catch(Exception ex){
			System.out.println("updateBoard() 예외발생:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return x;
	}//updateBoard()-end
	//=====================
	// DB글삭제
	//=====================
	public void deleteBoard(int num){
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=DriverManager.getConnection(URL,USER,PWD); //DB연결
			String sql="delete from board2 where num="+num;
			pstmt=con.prepareStatement(sql); //생성시 인자 들어간다
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("deleteBoard() 예외발생"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//deleteBoard-end
//	public static void main(String[] args) {
//		new BoardDAO();
//	}
}//class-end
