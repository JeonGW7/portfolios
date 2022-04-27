<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="shopdb.*"
    %>
<%--productDetail.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>productDetail.jsp</title>
  <link href="style.css" rel="stylesheet" type="text/css">
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript" src="script.js"></script>
</head>
<body topmargin="20">
  <%@ include file="top.jsp" %>
  
  <%
  ProductDAO productDAO=ProductDAO.getDao(); //dao객체얻기
  String code=request.getParameter("code");
  int pro_no=Integer.parseInt(request.getParameter("pro_no"));
  ProductDTO productDTO=productDAO.getProduct(pro_no); //dao메서드 호출
  %>
  <table width="80%" align="center" bgcolor="#FFFF99">
    <tr>
      <td align="center" bgcolor="#ffffcc">
        <table width="80%" align="center" bgcolor="#ffff99">
          
          <tr bgcolor="#996600">
            <td colspan="3" align="center">
              <%=productDTO.getName()%>
            </td>
          </tr>
          
          <tr>
            <td width="20%">
              <img src="../imgs/<%=productDTO.getImage()%>" height="150" width="150">
            </td>
            
             <td width="30%" valign="top">
               <table border="1" width="100%" height="100%">
                 <tr>
                   <td><b>상품이름:</b><%=productDTO.getName()%></td>
                 </tr>
                 
                 <tr>
                   <td><b>가격:</b><%=productDTO.getPrice()%></td>
                 </tr>
                 
                 <tr>
                   <td><b>입고날짜:</b><%=productDTO.getRegdate()%></td>
                 </tr>
                 
                 <tr>
                   <td><b>남은물량:</b>
                   <%
                   if(productDTO.getStock()>0){
                	   out.println(productDTO.getStock());
                   }else{
                	   out.println("품절");
                   }
                   %>
                   </td>
                 </tr>
               </table>
             </td>
             <td width="50%" valign="top"><b>상세설명</b>
             <br>
             <%=productDTO.getDetail()%>
             </td>
          </tr>
          <tr>
            <td colspan="3" align="center">
              <a href="javaScript:productUpdate('<%=productDTO.getPro_no()%>')">수정하기</a>&nbsp;&nbsp;
              <a href="javaScript:productDelete('<%=productDTO.getPro_no()%>')">삭제하기</a>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
  <%@ include file="bottom.jsp" %>
  <form name="updateForm" method="post" action="updateForm.jsp">
    <input type="hidden" name="pro_no">
  </form>
  <form name="delForm" method="post" action="productInsertPro.jsp?flag=delete">
    <input type="hidden" name="pro_no">
  </form>
</body>
</html>