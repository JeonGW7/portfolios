<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="shopdb.*"
    import="java.util.*"
    %>
<%--orderPro.jsp--%>
<%--객체생성--%>
<jsp:useBean id="cartMgr" class="shopdb.CartMgr" scope="session"/>

<%--객체생성--%>
<jsp:useBean id="orderDAO" class="shopdb.OrderDAO"/>

<%
ProductDAO productDAO=ProductDAO.getDao(); //dao객체 얻는다
Hashtable hcart=cartMgr.getCartList(); //장바구니 내용을 모두 받는다
Enumeration hcartKeys=hcart.keys(); //모든 키를 받는다

if(hcart.size()!=0){ //장바구니에 내용이 있으면
	while(hcartKeys.hasMoreElements()){ //내용이 있는 동안 반복수행
		OrderDTO orderDTO=(OrderDTO)hcart.get(hcartKeys.nextElement());
		orderDAO.insertOrder(orderDTO); //insert
		productDAO.reduceProduct(orderDTO); //남은 물량 계산,orderDTO에 있는 quantity계산
		cartMgr.deleteCart(orderDTO); //장바구니 비우기
	}//while-end
	%>
	<script>
	  alert("주문 처리를 하였습니다");
	  location.href="orderList.jsp"; //주문목록
	</script>
	<%
}else{ //장바구니 내용이 없으면
	%>
	<script>
	  alert("장바구니가 비어있습니다");
	  location.href="productList.jsp"; //상품목록
	</script>
	<%
}//else-end
%>