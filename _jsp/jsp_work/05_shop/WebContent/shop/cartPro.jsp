<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="shopdb.*"
    %>
<%--cartPro.jsp--%>
<%--객체생성--%>
<jsp:useBean id="cartMgr" class="shopdb.CartMgr" scope="session">
</jsp:useBean>

<jsp:useBean id="orderDTO" class="shopdb.OrderDTO">
  <jsp:setProperty name="orderDTO" property="*"/>
</jsp:useBean>

<%
//지역변수,자바구문
String state=request.getParameter("state");
orderDTO.setState(state);
//--
String flag=request.getParameter("flag"); //update,del
String memId=(String)session.getAttribute("memId");
//--
if(memId==null){ //로그인상태가 아닐때
	response.sendRedirect("loginForm.jsp");
	
}else{ //로그인 상태
	if(flag==null){ //장바구니에 넣기
		orderDTO.setUserid(memId);
		cartMgr.addCart(orderDTO); //장바구니 내용 수정하는 메서드 호출
		%>
		<script>
		  alert("장바구니에 담았습니다");
		  location.href="cartList.jsp"; //장바구니 목록 보기로 간다
		</script>
		<%
	}else if(flag.equals("update")){ //장바구니 수정
		orderDTO.setUserid(memId);
		cartMgr.updateCart(orderDTO); //장바구니 내용 수정하는 메서드 호출
		%>
		<script>
		  alert("장바구니 내용 수정되었습니다");
		  location.href="cartList.jsp"; //장바구니 목록 보기로 간다
		</script>
		<%
	}else if(flag.equals("del")){ //장바구니에서 제거
		cartMgr.deleteCart(orderDTO); //장바구니에서 제거하는 메서드 호출
		%>
		<script>
		  alert("장바구니에 제거하였습니다");
		  location.href="cartList.jsp"; //장바구니 목록 보기로 간다
		</script>
		<%
	}//else if-end
}//else-end
%>