<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%--login.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
  <div align="center" class="body">
    <h2>로그인</h2>
     <!-- user 모델빈 이름, 컨트롤러의 setUpForm()메서드에 대응된다 -->
       <form:form modelAttribute="userDTO" method="post" action="login.html">
         <spring:hasBindErrors name="user">
           <font color="red">
             <c:forEach var="error" items="${errors.globalErrors}">
               <spring:message code="${error.code}"/>
             </c:forEach>
           </font>
         </spring:hasBindErrors>
         
         <table>
           <tr height="40px">
             <td>user ID</td>
             <td>
               <!-- path="userId"는 UserDTO모델변수이다 -->
               <form:input path="userId" cssClass="userId"/>
               <font color="red"> <!-- 에러메시지출력 -->
                 <form:errors path="userId"/>
               </font>
             </td>
           </tr>
           
           <tr height="40px">
             <td>패스워드</td>
             <td>
               <!-- path="password"는 UserDTO모델변수이다 -->
               <form:input path="password" cssClass="password"/>
               <font color="red"> <!-- 에러메시지출력 -->
                 <form:errors path="password"/>
               </font>
             </td>
           </tr>
           
           <tr>
             <td colspan="2" align="center">
               <input type="submit" value="로그인">
               <input type="reset" value="리셋">
             </td>
           </tr>
         </table>
         
       </form:form>
       
  </div>
</body>
</html>