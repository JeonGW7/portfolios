<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="shopdb.*"
    import="java.util.*"
    %>
<%--productInsertPro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
ProductDAO productDAO=ProductDAO.getDao(); //dao객체 얻기
%>
<jsp:useBean id="orderDAO" class="shopdb.OrderDAO"/>
<%
String flag=request.getParameter("flag"); //insert,update,delete 
boolean result=false;
int iti=0; //변수
if(flag.equals("insert")){ //상품 등록
	result=productDAO.insertProduct(request); //dao메서드 호출
	response.sendRedirect("productList.jsp"); //상품 목록 보기
}else if(flag.equals("update")){ //상품 수정
	result=productDAO.updateProduct(request); //dao메서드 호출
	response.sendRedirect("productList.jsp"); //상품 목록 보기
}else if(flag.equals("delete")){ //상품 삭제
	Vector vec=orderDAO.getOrderList();
	if(vec.size()==0){ //주문 목록에 없으면 삭제
		int im_pro_no=Integer.parseInt(request.getParameter("pro_no"));
		result=productDAO.deleteProduct(request, im_pro_no);
		response.sendRedirect("productList.jsp");
	}else{ //주문 목록에 있을 때
		for(int i=0;i<vec.size();i++){
			OrderDTO orderDTO=(OrderDTO)vec.get(i);
			int pro_no=orderDTO.getPro_no();
			if(pro_no==Integer.parseInt(request.getParameter("pro_no"))){
				iti++;
			}//if-end
		}//for-end
		if(iti==0){ //주문상황이 아니면, 삭제
			int im_pro_no=Integer.parseInt(request.getParameter("pro_no"));
			result=productDAO.deleteProduct(request, im_pro_no); //dao메서드 호출
		}else{ //주문상황이면
			result=false;
		%>
		<script>
		  alert("주문 상태라서 삭제 못함");
		  location.href="productList.jsp";
		</script>
		<%
		}//else-end //주문상황이면
	}//else-end //주문 목록에 있을때
}else{ //위의 조건에 맞지 않는 경우
	response.sendRedirect("productList.jsp");
}
%>
