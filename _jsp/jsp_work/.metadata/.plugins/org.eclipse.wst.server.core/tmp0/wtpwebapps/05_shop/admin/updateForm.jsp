<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="shopdb.*"
    import="java.util.*"
    %>
<%--updateForm.jsp--%>
<%
int pro_no=Integer.parseInt(request.getParameter("pro_no"));
ProductDAO productDAO=ProductDAO.getDao(); //dao객체 얻기
ProductDTO dto=productDAO.getProduct(pro_no); 
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
  <%@ include file="top.jsp" %>
    <table width="80%" align="center" bgcolor="#FFFF99">
      <tr>
        <td aling="center" bgcolor="#ffffcc">
         <form method="post" action="productInsertPro.jsp?flag=update" encType="multipart/form-data">
          <table width="95%" align="center" bgcolor="#ffff99" border="1">
            <tr>
              <td colspan="2" align="center">
              <font size="5"><b>상품수정</b></font>
              </td>
            </tr>
            
            <tr>
              <td>상품이름</td>
              <td>
              <input type="text" name="name" id="name" size="20" value="<%=dto.getName()%>">
              <input type="hidden" name="pro_no" value="<%=dto.getPro_no()%>">
              </td>
            </tr>
            
            <tr>
              <td>상품코드</td>
              <td><input type="text" name="code" id="code" size="20" value="<%=dto.getCode()%>"></td>
            </tr>
            
            <tr>
              <td>상품가격</td>
              <td><input type="text" name="price" id="price" size="20" value="<%=dto.getPrice()%>"></td>
            </tr>
            
            <tr>
              <td>상품설명</td>
              <td>
              <textarea name="detail" id="detail" rows="10" cols="45"><%=dto.getDetail()%></textarea>
              </td>
            </tr>
            
            <tr>
              <td>상품입고수량</td>
              <td><input type="text" name="stock" id="stock" size="10" value="<%=dto.getStock()%>">개</td>
            </tr>
            
            <tr>
              <td>상품이미지</td>
              <td><input type="file" name="image"></td>
            </tr>
            
            <tr>
              <td>제조회사</td>
              <td><input type="text" name="comp" id="comp" size="20" value="<%=dto.getComp()%>"></td>
            </tr>
            
            <tr>
              <td colspan="2" align="center">
                <input type="submit" value="상품수정">
                <input type="reset" value="취소">
              </td>
            </tr>
          </table> 
         </form>
        </td>
      </tr>
    </table>
  <%@ include file="bottom.jsp" %>
</body>
</html>