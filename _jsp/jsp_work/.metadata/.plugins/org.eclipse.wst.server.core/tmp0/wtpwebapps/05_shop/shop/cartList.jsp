<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="shopdb.*"
    import="java.util.*"
    %>
<%--cartList.jsp--%>
<jsp:useBean id="cartMgr" class="shopdb.CartMgr" scope="session"/>
<%
OrderDTO orderDTO=null;
ProductDTO productDTO=null;
ProductDAO productDAO=null;
Hashtable hcart=null;

try{
	productDAO=ProductDAO.getDao(); //dao객체 얻기
	if(session.getAttribute("memId")==null){ //로그인상태가 아니면
		response.sendRedirect("loginForm.jsp"); //로그인으로 간다
	}else{ //로그인상태이면
		%>
		<html>
		  <head>
		    <link href="style.css" rel="stylesheet" type="text/css">
 			<script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
 			<script type="text/javascript" src="script.js"></script>
		  </head>
		  
		  <body bgcolor="#996600" topmargin="100">
		    <%@ include file="top.jsp" %>
		    <table width="80%" bgcolor="#ffff99">
		      <tr>
		        <td align="center" bgcolor="#ffffcc">
		          <table width="95%" bgcolor="#ffff99" border="1">
		            <tr bgcolor="#996600">
		              <td><font color="#FFFFFF">제품</font></td>
		              <td><font color="#FFFFFF">수량</font></td>
		              <td><font color="#FFFFFF">가격</font></td>
		              <td><font color="#FFFFFF">수정/삭제</font></td>
		              <td><font color="#FFFFFF">조회</font></td>
		            </tr>
		            <%
		              int totalPrice=0; //총금액
		              hcart=cartMgr.getCartList(); //장바구니내용 모두 가져온다
		              if(hcart.size()==0){ //장바구니에 내용이 없으면
		            	  out.println("장바구니 내용이 없습니다");
		              }else{ //장바구니에 내용이 있으면
		            	  out.println("<tr><td align=center colspan=5>장바구니에 들어있는 상품내역</td></tr>");
		              	  Enumeration hcartKeys=hcart.keys();
		              	  while(hcartKeys.hasMoreElements()){ //자료가 있는동안 반복처리
		              		  orderDTO=(OrderDTO)hcart.get(hcartKeys.nextElement());
		              	  	  productDTO=productDAO.getProduct(orderDTO.getPro_no());
		              	  	  int price=productDTO.getPrice(); //가격
		              	  	  int quantity=Integer.parseInt(orderDTO.getQuantity()); //수량
		              	  	  int subTotal=price*quantity; //하나의 물건을 1이상 샀을때
		              	  	  totalPrice += subTotal; //총금액 구한다
		              	  	  %>
		              	  	  <form method="post" action="cartPro.jsp">
								<input type="hidden" name="pro_no" value="<%=productDTO.getPro_no()%>">
								<input type="hidden" name="flag">
								<input type="hidden" name="state" value="2">

								<tr>
								<td><%=productDTO.getName() %></td>

								<td>
								<input type="text" name="quantity" value="<%=orderDTO.getQuantity()%>" size="5">
								</td>

								<td><%=subTotal+"" %></td>

								<td>
								  <input type="button" value="cart수정" onClick="javaScript:cartUpdate(this.form)">
								  <input type="button" value="cart삭제" onClick="javaScript:cartDelete(this.form)">
								</td>

								<td>
								<a href="javaScript:productDetail('<%=productDTO.getCode()%>')">상세보기</a>
								</td>


								</tr>
								</form>
		              	  	  <%
		              	  }//while-end
		              	  %>
		              	  <tr>
		              	    <td colspan="4" align="right">
		              	            총 금액:<%=totalPrice %>
		              	    </td>
		              	    <td align="center">
		              	      <a href="orderPro.jsp">주문하기</a>
		              	    </td>
		              	  </tr>
		              	  <% 
		              }//else-end
		            %>
		          </table>
		        </td>
		      </tr>
		    </table>
		      <form name="detail" method="post" action="productDetail.jsp">
		        <input type="hidden" name="code">
		      </form>
		    <%@ include file="bottom.jsp" %>
		  </body>
		</html>
		<%
	}//else-end
}catch(Exception ex){
	out.println("cartList.jsp 예외:"+ex);
}
%>