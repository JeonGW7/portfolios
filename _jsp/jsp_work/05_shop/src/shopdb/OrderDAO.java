package shopdb;
import java.sql.*;
import javax.sql.*;//DataSource
import javax.naming.*;//lookup

import java.util.Vector;

//주문 처리 
//DAO:비지니스 로직 
public class OrderDAO {

	public OrderDAO(){}//생성자

	//커넥션 얻기 
	public Connection getCon() throws Exception{
		Context ct=new InitialContext();
		DataSource ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		return ds.getConnection();
	}//getCon()-end
	
	//--------------------
	// 1. 주문 insert
	//--------------------
	 public void insertOrder(OrderDTO dto){
		 Connection con=null;
		 PreparedStatement pstmt=null;
		 
		 try{
			 con=getCon();//케넥션 얻기 
			 
			 String sql="insert into shop_order(ordno,userid,pro_no,"+
					  "quantity,orddate,state) values(0,?,?,?,NOW(),?)";
					  
			 pstmt=con.prepareStatement(sql);//생성시 인자 들어간다 
			 
			 pstmt.setString(1, dto.getUserid());
			 pstmt.setInt(2, dto.getPro_no());
			 pstmt.setString(3,dto.getQuantity());
			 pstmt.setString(4, "1");
			 
			 pstmt.executeUpdate();//쿼리 수행 *********
			 
		 }catch(Exception ex){
			 System.out.println("insertOrder() 예외 :"+ex);
		 }finally{
			 try{
				 if(pstmt != null){pstmt.close();}
				 if(con != null){con.close();}
			 }catch(Exception ex2){}
		 }//finally-end
	 }//insertOrder()-end
	//--------------------
	//2. 1명 주문 목록 보여주기
	// userid 
	//--------------------
	public Vector<OrderDTO> getOrder(String userid){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="";
		Vector<OrderDTO> vec=new Vector<OrderDTO>();
		
		try{
			con=getCon();
			sql="select * from shop_order where userid=?";
			pstmt=con.prepareStatement(sql);//생성시 인자 들어간다 
			pstmt.setString(1, userid);//?값
			rs=pstmt.executeQuery();//select 쿼리 수행 
			
			OrderDTO dto=null;
			while(rs.next()){
				dto=new OrderDTO();
				
				//rs내용을 dto에 넣는다 
				dto.setUserid(rs.getString("userid"));
				dto.setQuantity(rs.getString("quantity"));
				dto.setOrddate(rs.getTimestamp("orddate"));//년월일 시분초
				
				dto.setOrdno(rs.getInt("ordno"));
				dto.setState(rs.getString("state"));
				dto.setPro_no(rs.getInt("pro_no"));
				
				vec.add(dto);//dto를 vec에 넣기
			}//while-end
			
		}catch(Exception ex){
			System.out.println("getOrder() 예외 :"+ex);
		}finally{
			 try{
				 if(rs != null){rs.close();}
				 if(pstmt != null){pstmt.close();}
				 if(con != null){con.close();}
			 }catch(Exception ex2){}
		 }//finally-end
		return vec;
	}//getOrder()-end
	
	
	//--------------------
	//3. 모든 주문 목록 보여주기
	//--------------------
	
	public Vector getOrderList(){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="";
		Vector<OrderDTO> vec=new Vector<OrderDTO>();
		
		try{
			con=getCon();//커넥션 얻기 
			sql="select * from shop_order order by ordno asc";
			
			pstmt=con.prepareStatement(sql);//생성자 인자 들어간다
			rs=pstmt.executeQuery();//select, 쿼리 수행
			
			OrderDTO dto=null;
			
			while(rs.next()){
				dto=new OrderDTO();//객체생성
				
				//rs내용을 dto에 넣는다
				
				dto.setUserid(rs.getString("userid"));
				dto.setQuantity(rs.getString("quantity"));
				dto.setOrddate(rs.getTimestamp("orddate"));//년월일 시분초
				
				dto.setOrdno(rs.getInt("ordno"));
				dto.setState(rs.getString("state"));
				dto.setPro_no(rs.getInt("pro_no"));
				
				vec.add(dto);//dto를 vec에 넣기
				
			}//while-end
		}catch(Exception ex){
			System.out.println("getOrderList() 예외 :"+ex);
		}finally{
			 try{
				 if(rs != null){rs.close();}
				 if(pstmt != null){pstmt.close();}
				 if(con != null){con.close();}
			 }catch(Exception ex2){}
		 }//finally-end
		
		return vec;//front-end로 리턴 
		
	}//getOrderList()-end
}//class-end
