<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="shopdb.*"
    %>
<%--orderList.jsp--%>
<%--객체 생성 --%>
<jsp:useBean id="orderDAO" class="shopdb.OrderDAO"/>
<%
ProductDAO productDAO=ProductDAO.getDao(); //dao객체얻기
%>
<%@ include file="top.jsp" %>
<%
if(session.getAttribute("memId")==null){ //로그인상태가 아니면
	response.sendRedirect("loginForm.jsp");
}else{ //로그인 상태이면
	memId=(String)session.getAttribute("memId");
}//else-end
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>orderList.jsp</title>
  <link href="style.css" rel="stylesheet" type="text/css">
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript" src="script.js"></script>
</head>
<body bgcolor="#996600" topmargin="20">
  <table width="80%" bgcolor="#ffff99">
    <tr>
      <td colspan="5" align="center">
        <font size="5"><b><%=memId%>님의 구매목록</b></font>
      </td>
    </tr>
    <tr>
      <td align="center" bgcolor="#ffffcc">
        <table width="95%" bgcolor="#ffff99">
          <tr bgcolor="#996600">
            <td>주문번호</td>
            <td>제품</td>
            <td>주문수량</td>
            <td>주문날짜</td>
            <td>주문상태</td>
          </tr>
          <%
          Vector vec=orderDAO.getOrder(memId); //1명이 주문한 목록 가져오기
          if(vec.size()==0){ //구매목록이 없으면
        	  out.println("구매록록이 없습니다");
          }else{ //구매목록이 있으면
        	  for(int i=0;i<vec.size();i++){
        		  OrderDTO orderDTO=(OrderDTO)vec.get(i);
        		  int pro_no=orderDTO.getPro_no(); //상품 일련 번호
        		  ProductDTO productDTO=productDAO.getProduct(pro_no);
        		  %>
        		  <tr>
        		    <td><%=orderDTO.getOrdno()%></td>
        		    <%--제품,상품이름을 클릭하면 상세보기로 이동--%>
            		<td>
            		  <a href="javaScript:productDetail('<%=productDTO.getCode()%>')">
            		    <%=productDTO.getName() %>
            		  </a>
            		</td>
           			<td><%=orderDTO.getQuantity()%></td>
           			<td><%=orderDTO.getOrddate()%></td>
           			<%--주문상태 --%>
           			<td>
           			<%
           			switch(Integer.parseInt(orderDTO.getState())){
           			case 1:
           				out.println("접수중");
           				break;
           			case 2:
           				out.println("접수");
           				break;
           			case 3:
           				out.println("입금확인");
           				break;
           			case 4:
           				out.println("배송준비");
           				break;
           			case 5:
           				out.println("배송중");
           				break;
           			default:
           				out.println("배송완료");
           			}//switch-end
           			%>
           			</td>
        		  </tr>
        		  <%
        	  }//for-end
          }//else-end
          %>
        </table>
      </td>
    </tr>
  </table>
</body>
</html>