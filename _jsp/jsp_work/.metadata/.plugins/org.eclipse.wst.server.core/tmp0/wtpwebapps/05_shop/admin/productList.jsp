<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="shopdb.*"
    %>
<%--productList.jsp--%>
<%
ProductDAO productDAO=ProductDAO.getDao(); //dao객체 얻기
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <link href="style.css" rel="stylesheet" type="text/css">
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript" src="script.js"></script>
</head>
<body topmargin="20">
  <%@ include file="top.jsp"%>
  <table width="80%" align="center" bgcolor="#ffff99">
    <tr>
      <td align="center" bgcolor="#ffffcc">
        <table width="95%" align="center" bgcolor="#ffff99" border="1">
          <tr bgcolor="#996600">
            <td align="center">상품명</td>
            <td align="center">가격</td>
            <td align="center">입고날짜</td>
            <td align="center">남은수량</td>
            <td align="center">&nbsp;</td>
          </tr>
          <%
          List<ProductDTO> list=productDAO.getGoodList(); 
          if(list.size()==0){ //상품이 없으면
        	  %>
        	  <tr>
        	    <td colspan="5" align="center">
        	            상품이 없습니다
        	    </td>
        	  </tr>
        	  <%
          }else{ //상품이 있으면
        	  for(int i=0;i<list.size();i++){
        		  ProductDTO productDTO=(ProductDTO)list.get(i);
        		  %>
        		  <tr>
        		    <td><%=productDTO.getName()%></td>
        		    <td><%=productDTO.getPrice()%></td>
        		    <td><%=productDTO.getRegdate()%></td>
        		    <td>
        		    <%
        		    if(productDTO.getStock()>0){ //물량이 있으면
        		    	out.println(productDTO.getStock());
        		    }else{ //물량이 없으면
        		    	out.println("품절");
        		    }
        		    %>
        		    </td>
        		    <td>
        		      <a href="javaScript:productDetail('<%=productDTO.getCode()%>','<%=productDTO.getPro_no()%>')">상세보기</a>
        		    </td>
        		  </tr>
        		  <%
        	  }//for-end
          }//else-end-----------------
          %>
          <tr>
            <td colspan="5" align="center">
              <a href="productInsertForm.jsp">상품등록</a>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
  <%@ include file="bottom.jsp"%>
  <form name="detail" method="post" action="productDetail.jsp">
    <input type="hidden" name="code">
    <input type="hidden" name="pro_no">
  </form>
</body>
</html>