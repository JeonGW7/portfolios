package boardre;
import java.util.*; //Vector, List, ArrayList 
import java.sql.*; //Connection,Statement,PreparedStatement,ResultSet
public class BoardDAO {
	private String DRIVER="com.mysql.jdbc.Driver";
	private String URL="jdbc:mysql://localhost:3306/mydb3";
	private String USER="root";
	private String PWD="12345";
	Connection con=null;
	PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet rs=null;
	String sql="";
	//생성자: 객체 초기화
	public BoardDAO(){
		try{
			Class.forName(DRIVER); //드라이버 로딩
			System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패:"+cnf);
		}
	}
	//커넥션 얻기 메서드 만들어놓고 사용하려고 
	private Connection getCon(){
		Connection con=null;
		try{
			con=DriverManager.getConnection(URL,USER,PWD);
			//System.out.println("DB연결 성공");
		}catch(Exception ex){
			System.out.println("DB연결 실패:"+ex);
		}
		return con;
	}//getCon()-end
	//===============================
	// pos 증가 : 글순서
	//===============================
	public void upPos(){
		try{
			con=getCon();
			stmt=con.createStatement();
			sql="update board set pos=pos+1"; //글쓰기,답글쓰기,글순서 메기려고
			stmt.executeUpdate(sql); //쿼리수행 
		}catch(Exception ex){
			System.out.println("upPos()예외:"+ex);
		}finally{
			try{
				if(stmt!=null){stmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//upPos()-end
	//===============================
	// 글쓰기, insert
	//===============================
	public void insertBoard(BoardDTO dto){
		upPos(); //메서드 호출
		try{
			con=getCon();
			sql="insert into board(num,name,subject,content,pos,depth,regdate,ip,pw) values(0,?,?,?,?,?,NOW(),?,?)";
			pstmt=con.prepareStatement(sql);
			//?값채우기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getPos());
			pstmt.setInt(5, dto.getDepth());
			pstmt.setString(6, dto.getIp());
			pstmt.setString(7, dto.getPw());
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("insertBoard()예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//insertBoard()-end
	//===============================
	// 리스트,검색
	//===============================
	public Vector getList(String keyField,String keyWord){
//		System.out.println("keyField:"+keyField);
//		System.out.println("keyWord:"+keyWord);
		Vector <BoardDTO> vec=new Vector<BoardDTO>(); //객체생성
		try{
			con=getCon();
			stmt=con.createStatement(); //생성
			if(keyWord.equals(null) || keyWord.equals("")){
				//전체글목록
				sql="select * from board order by pos asc";
			}else{
				//검색
				sql="select * from board where "+keyField+" like '%"+keyWord+"%' order by pos asc";
			}//else-end
			rs=stmt.executeQuery(sql); //쿼리수행
			while(rs.next()){
				//rs내용을 dto에 저장, dto를 vec에 저장
				BoardDTO dto=new BoardDTO(); //객체생성
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPos(rs.getInt("pos"));
				dto.setDepth(rs.getInt("depth"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setIp(rs.getString("ip"));
				dto.setPw(rs.getString("pw"));
				dto.setCount(rs.getInt("count"));
				vec.add(dto);
			}//while-end
		}catch(Exception ex){
			System.out.println("getList()예외:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(stmt!=null){stmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return vec;
	}//getList()-end
	//===============================
	// 조회수 증가
	//===============================
	public void upCount(int num){
		try{
			con=getCon(); //DB연결
			sql="update board set count=count+1 where num="+num;
			pstmt=con.prepareStatement(sql); //생성시 인자 들어간다
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("upCount()예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//upCount-end
	//===============================
	// 글내용 보기, 글수정 폼
	//===============================
	public BoardDTO getBoard(int num){
		BoardDTO dto=new BoardDTO();
		try{
			con=getCon();
			sql="select * from board where num="+num;
			pstmt=con.prepareStatement(sql); //생성시 인자 들어간다
			rs=pstmt.executeQuery(); //쿼리수행
			if(rs.next()){
				//rs내용을 dto에 저장, dto클라이언트로 리턴
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPos(rs.getInt("pos"));
				dto.setDepth(rs.getInt("depth"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setPw(rs.getString("pw"));
				dto.setCount(rs.getInt("count"));
				dto.setIp(rs.getString("ip"));
			}//if-end
		}catch(Exception ex){
			System.out.println("getBoard()예외:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return dto;
	}//getBoard-end
	//===============================
	// DB글수정, update
	//===============================
	public void updateBoard(BoardDTO dto){
		try{
			con=getCon();
			sql="update board set name=?,subject=?,content=? where num=?";
			pstmt=con.prepareStatement(sql); //생성시 인자들어간다
			//?값 채우기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNum());
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("updateBoard()예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//updateBoard-end
	//===============================
	// DB글삭제
	//===============================
	public void deleteBoard(int num){
		try{
			con=getCon();
			sql="delete from board where num="+num;
			pstmt=con.prepareStatement(sql); //생성시 인자들어간다
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("deleteBoard()예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//deleteBoard-end
	//===============================
	// 답글 위치 확보
	//===============================
	public void replyPos(BoardDTO dto){
		try{
			con=getCon();
			sql="update board set pos=pos+1 where pos>?"; //답글위치확보
			pstmt=con.prepareStatement(sql); //생성시 인자들어간다 
			//?값 채우기
			pstmt.setInt(1, dto.getPos());
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("replyPos()예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//replyPos-end
	//===============================
	// DB에 답글 달기
	//===============================
	public void replyBoard(BoardDTO dto){
		try{
			con=getCon();
			int depth=dto.getDepth()+1;//답글깊이
			int pos=dto.getPos()+1;//글순서
			sql="insert into board(name,subject,content,pos,depth,regdate,pw,count,ip) ";
			sql=sql+" values(?,?,?,?,?,NOW(),?,?,?)";
			pstmt=con.prepareStatement(sql); //생성시 인자들어간다
			//?값 채워넣기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, pos);
			pstmt.setInt(5, depth);
			pstmt.setString(6, dto.getPw());
			pstmt.setInt(7, dto.getCount());
			pstmt.setString(8, dto.getIp());
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("replyBoard()예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//replyBoard-end
}//class-end
