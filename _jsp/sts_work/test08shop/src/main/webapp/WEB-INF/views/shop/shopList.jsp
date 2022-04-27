<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/jspheader.jsp" %>    
    <%--shopList.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>상품 목록표 [등록된 총 상품수:${list.size()}]</h2>
 
  <table>
  <tr>
  <td align="center" colspan="3">
    <form name="searchForm" method="get" action="${ctxpath}/shop/shopList.do">
      <input type="search" name="search" id="search">
      <input type="submit" value="검색">
    </form>
  </td>
  </tr>
  
  <tr>
      <c:set var="cnt" value="-1"/>
      
      <c:forEach var="shopDto" items="${list}">
        
        <c:set var="cnt" value="${cnt+1}"/>
        <c:if test="${cnt%3==0}">
          </tr>
          <tr>
        </c:if>
        
         <td>
         <table border="1">
         
          <tr align="center" bgcolor="#d0d0d0" height="120%">
            <td colspan="2">
              ${shopDto.name}
            </td>
          </tr>
          
          <tr>
            <td colspan="2" align="center">
              <c:if test="${shopDto.stock>0}">
                <img src="${ctxpath}/resources/shopimgs/${shopDto.image}" width="150" height="150">
              </c:if>
              
              <c:if test="${shopDto.stock==0}">
                 ${shopDto.name}은 품절
              </c:if>
            </td>
          </tr>
        
          <tr>
            <td>상품코드</td>
            <td>${shopDto.code}</td>
          </tr>
          
          <tr>
            <td>가격</td>
            <td>${shopDto.price}</td>
          </tr>
          
          <tr>
            <td>출시날짜</td>
            <td>${shopDto.regdate}</td>
          </tr>
          
          <tr>
            <td>제조회사</td>
            <td>${shopDto.comp}</td>
          </tr>
          
          <tr>
            <td>남은물량</td>
            <td>
            <c:if test="${shopDto.stock>0}">
              ${shopDto.stock}
            </c:if>
            
            <c:if test="${shopDto.stock==0}">
                             품절
            </c:if>
            </td>
          </tr>
        </table>
      </td>
      
    </c:forEach>
    
    </tr>
  </table>
</body>
</html>