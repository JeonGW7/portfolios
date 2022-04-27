package shopdb;
//파일 업로드
//jdk/jre/lib/ext/cos.jar
//Tomcat/lib/cos.jar
//또는
//현재 프로젝트 WebContent/WEB-INF/lib/cos.jar
//상품 등록하고(파일업로드)할때  cos.jar필요

import java.sql.*;

import javax.sql.*; //DataSource

import java.util.*;

import javax.naming.*; //lookup

import java.io.*; //그림파일 삭제 하기 위해서

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;
import com.sun.xml.internal.ws.resources.HttpserverMessages;

import javax.servlet.http.*; //서블릿

//DAO: 비지니스 로직
public class ProductDAO {
	//싱글톤 객체 사용, 장점:메모리 절약효과
	private ProductDAO(){} //생성자,외부에서 사용못하게 private
	private static ProductDAO instance=new ProductDAO(); //객체생성
	
	//JSP에서 사용할 메서드
	public static ProductDAO getDao(){
		return instance;
	}
	//------------------------
	// 커넥션 풀 사용
	//------------------------
	private Connection getCon() throws Exception{
		Context ct=new InitialContext();
		DataSource ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		return ds.getConnection();
	}//getCon-end
	//------------------------
	//  1. 상품목록 리스트
	//------------------------
	public List getGoodList(){
		String sql="";
		Connection con=null;
		Statement stmt=null; //모든 클래스는 null로 초기화 한다
		ResultSet rs=null;
		List<ProductDTO> list=new ArrayList<ProductDTO>(); //객체생성
		try{
			con=getCon(); //커넥션 얻기
			sql="select * from shop_info";
			stmt=con.createStatement(); //Statement생성
			rs=stmt.executeQuery(sql); //쿼리 수행
			while(rs.next()){
				//rs내용을 dto에 넣고, 그 다음 dto를 list에 넣는다 
				ProductDTO dto=new ProductDTO(); //객체생성
				dto.setPro_no(rs.getInt("pro_no"));
				dto.setCode(rs.getString("code"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setStock(rs.getInt("stock"));
				dto.setDetail(rs.getString("detail"));
				dto.setComp(rs.getString("comp"));
				//dto.setRegdate(rs.getDate("regdate"));
				dto.setRegdate(rs.getTimestamp("regdate"));//년월일 시분초
				dto.setImage(rs.getString("image"));
				list.add(dto); //모델빈 객체(dto)를 list에 넣는다
			}//while-end
		}catch(Exception ex){
			System.out.println("getGoodList() 예외:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(stmt!=null){stmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return list;
	}//getGoodList-end
	//------------------------
	// 상세보기
	//------------------------
	public ProductDTO getDetail(String code){
		Connection con=null;
		Statement stmt=null; 
		ResultSet rs=null;
		String sql="";
		ProductDTO dto=new ProductDTO();
		try{
			con=getCon(); //커넥션얻기
			sql="select * from shop_info where code='"+code+"'";
			stmt=con.createStatement(); //Statement생성
			rs=stmt.executeQuery(sql); //쿼리수행
			while(rs.next()){
				//rs내용을 dto에 넣는다
				dto.setPro_no(rs.getInt("pro_no"));
				dto.setCode(rs.getString("code"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setStock(rs.getInt("stock"));
				dto.setDetail(rs.getString("detail"));
				dto.setComp(rs.getString("comp"));
				//dto.setRegdate(rs.getDate("regdate"));
				dto.setRegdate(rs.getTimestamp("regdate"));
				dto.setImage(rs.getString("image"));
			}//while-end
		}catch(Exception ex){
			System.out.println("getDetail() 예외:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(stmt!=null){stmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return dto;
	}//getDetail-end
	//--------------------------
	// getProduct()
	// pro_no에 해당하는 정보를 리턴해준다 
	//--------------------------
	public ProductDTO getProduct(int pro_no){
		Connection con=null;
		PreparedStatement pstmt=null; 
		ResultSet rs=null;
		ProductDTO dto=null;
		String sql="";
		try{
			con=getCon(); //커넥션 얻기
			sql="select * from shop_info where pro_no=?";
			pstmt=con.prepareStatement(sql); //생성시 인자 들어간다
			pstmt.setInt(1, pro_no);
			rs=pstmt.executeQuery(); //쿼리수행
			while(rs.next()){
				dto=new ProductDTO(); //객체생성
				//rs내용을 dto에 넣는다
				dto.setPro_no(rs.getInt("pro_no"));
				dto.setCode(rs.getString("code"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setStock(rs.getInt("stock"));
				dto.setDetail(rs.getString("detail"));
				dto.setComp(rs.getString("comp"));
				dto.setRegdate(rs.getDate("regdate"));
				//dto.setRegdate(rs.getTimestamp("regdate"));
				dto.setImage(rs.getString("image"));
			}//while-end
		}catch(Exception ex){
			System.out.println("getProduct() 예외:"+ex);
		}finally{
			try{
				if(rs!=null){rs.close();}
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return dto;
	}//getProduct-end
	//--------------------------
	// 남은 물량 계산
	//--------------------------
	public void reduceProduct(OrderDTO dto){
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=getCon();
			String sql="update shop_info set stock=(stock-?) where pro_no=?";
			pstmt=con.prepareStatement(sql); //생성시 인자들어간다
			pstmt.setString(1, dto.getQuantity()); //수량
			pstmt.setInt(2, dto.getPro_no()); //상품 일련번호
			pstmt.executeUpdate(); //쿼리수행
		}catch(Exception ex){
			System.out.println("reduceProduct() 예외"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
	}//reduceProduct-end
	//관리자가 하는 일
	
	//--------------------------------------------------------
	// insert 상품등록(관리자가 하는 일), 서블릿 사용 HttpServletRequest
	//--------------------------------------------------------
	public boolean insertProduct(HttpServletRequest request){
		boolean re=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		//JSP의 경우 : 실제 경로 얻기 : 그림 등록 하기 위해
		//<%=config.getServletContext().getRealPath("/")%> 이것을 사용하세요
		//<%=application.getRealPath("/")%>
		
		//서블릿에서 실제경로 얻기 : 그림 등록하기 위해
		//request.getRealPath("/");
		//request.getServletContext().getRealPath("/"); => 이것이 더 정확함
		
		//JSP 그림 웹화면에 출력
		//<%=request.getContextPath%> ==> 프로젝트 이름이 컨텍스트 이름이다
		
		try{
			con=getCon(); //커넥션 얻기
			String realPath=request.getServletContext().getRealPath("/"); //실제 경로 얻기
			String uploadPath=realPath+"/imgs/"; //상품이 동록될 위치
			//파일 업로드는 MultipartRequest 생성시 업로드 된다 
			MultipartRequest mul=new MultipartRequest(request,uploadPath,5*1024*1024,"utf-8",new DefaultFileRenamePolicy());
			String sql="";
			sql="insert into shop_info(pro_no,name,code,price,stock,detail,comp,regdate,image) values(0,?,?,?,?,?,?,NOW(),?)";
			pstmt=con.prepareStatement(sql); //생성시 인자 들어간다
			//?값 채우기
			pstmt.setString(1, mul.getParameter("name")); //*********
			pstmt.setString(2, mul.getParameter("code"));
			pstmt.setInt(3, Integer.parseInt(mul.getParameter("price")));
			pstmt.setInt(4, Integer.parseInt(mul.getParameter("stock")));
			pstmt.setString(5, mul.getParameter("detail"));
			pstmt.setString(6, mul.getParameter("comp"));
			if(mul.getFilesystemName("image")!=null){ //그림이 있으면
				pstmt.setString(7, mul.getFilesystemName("image"));
			}else{ //그림이 없으면
				pstmt.setString(7, "ready.jpg");
			}//else-end
			int count=pstmt.executeUpdate(); //쿼리수행,insert 
			if(count==1){
				re=true;
			}//if-end
		}catch(Exception ex){
			System.out.println("insertProduct() 예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return re; //정상이면 true, 아니면 false
	}//insertProduct-end
	//----------------------------
	// 상품 update(관리자가 하는 일)
	//----------------------------
	public boolean updateProduct(HttpServletRequest request){
		boolean result=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		String sql="";
		try{
			con=getCon(); //커넥션 얻기 
			String realPath=request.getServletContext().getRealPath("/");
			String uploadPath=realPath+"/imgs/";
			int size=5*1024*1024; //5MB
			//파일 업로드, 그림파일 올리기
			MultipartRequest mul=new MultipartRequest(request,uploadPath,size,"utf-8",new DefaultFileRenamePolicy());
			if(mul.getFilesystemName("image")==null){ //그림 파일이 없으면 이전 그림 파일 그대로 사용
				sql="update shop_info set name=?,stock=?,detail=?,price=?,code=?,comp=? where pro_no=?";
				pstmt=con.prepareStatement(sql); //생성시 인자들어간다
				//?값 채우기
				pstmt.setString(1,mul.getParameter("name"));
				pstmt.setInt(2,Integer.parseInt(mul.getParameter("stock")));
				pstmt.setString(3,mul.getParameter("detail"));
				pstmt.setInt(4,Integer.parseInt(mul.getParameter("price")));
				pstmt.setString(5,mul.getParameter("code"));
				pstmt.setString(6,mul.getParameter("comp"));
				pstmt.setInt(7,Integer.parseInt(mul.getParameter("pro_no")));
			}else{ //새로운 이미지로 바꿀때, 먼저 이전 그림파일을 삭제한다
				int im_pro_no=Integer.parseInt(mul.getParameter("pro_no"));
				String sql2="";
				sql2="select image from shop_info where pro_no="+im_pro_no;
				Statement stmt=con.createStatement(); //Statement생성
				ResultSet rs=stmt.executeQuery(sql2); //쿼리수행, 실행시 인자들어간다
				if(rs.next()){ //이미지 존재 하면, 삭제
					File f=new File(uploadPath+rs.getString("image"));
					if(f.isFile()){ //그림 파일이 있으면 삭제 
						f.delete(); 
					}//if-end
				}//if-end
				rs.close();
				stmt.close();
				//-------------
				//update 구문 작성
				//-------------
				sql="update shop_info set name=?,stock=?,detail=?,price=?,code=?,comp=?,image=? where pro_no=?";
				pstmt=con.prepareStatement(sql); //생성시 인자 들어간다
				//?값 채우기
				pstmt.setString(1, mul.getParameter("name"));
				pstmt.setInt(2,Integer.parseInt(mul.getParameter("stock")));
				pstmt.setString(3,mul.getParameter("detail"));
				pstmt.setInt(4,Integer.parseInt(mul.getParameter("price")));
				pstmt.setString(5,mul.getParameter("code"));
				pstmt.setString(6,mul.getParameter("comp"));
				pstmt.setString(7,mul.getFilesystemName("image"));
				pstmt.setInt(8,Integer.parseInt(mul.getParameter("pro_no")));
			}//else-end
			int cnt=pstmt.executeUpdate();//쿼리수행
			if(cnt==1){
				result=true; //default로 false 
			}//if-end
		}catch(Exception ex){
			System.out.println("updateProduct 예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return result;
	}//updateProduct-end
	//----------------------------
	// shop_info테이블의 행=row=record삭제 (관리자가 하는 일)
	// 그림파일 삭제 (업로드 된 그림 삭제)
	//----------------------------
	public boolean deleteProduct(HttpServletRequest request,int pro_no){
		boolean result=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=getCon(); //커넥션 얻기
			//그림파일 삭제 
			String sql2="select image from shop_info where pro_no="+pro_no;
			String realPath=request.getServletContext().getRealPath("/");
			String uploadPath=realPath+"/imgs/";
			Statement stmt=con.createStatement(); //Statement생성
			ResultSet rs=stmt.executeQuery(sql2); //쿼리 수행
			if(rs.next()){ //그림파일 존재 하면, 이미지 삭제
				File f=new File(uploadPath+rs.getString("image"));
				if(f.isFile()){ //파일이 존재 하면
					f.delete(); 
				}//if-end
			}//if-end
			rs.close();
			stmt.close();
			//-------------------------  여기까지가 그림파일 삭제
			//DB의 shop_info테이블의 레코드(row)삭제
			String sql="";
			sql="delete from shop_info where pro_no=?";
			pstmt=con.prepareStatement(sql); //생성시 인자들어감
			pstmt.setInt(1, pro_no);
			int cnt=pstmt.executeUpdate(); //쿼리수행
			if(cnt>0){
				result=true;
			}//if-end
		}catch(Exception ex){
			System.out.println("deleteProduct() 예외:"+ex);
		}finally{
			try{
				if(pstmt!=null){pstmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex2){}
		}//finally-end
		return result; //true | false 
	}//deleteProduct-end
}//class-end

















