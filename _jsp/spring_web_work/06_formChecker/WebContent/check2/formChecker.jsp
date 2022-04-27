<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="check.*"
    %>
<%--formChecker.jsp--%>
<%!
//전역변수 선언,메서드 정의
public static void printErr(JspWriter out2,String msg) throws Exception{
	out2.println("<script>");
	out2.println("alert('"+msg+"')");
	out2.println("history.back()");
	out2.println("</script>");
}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

//클라이언트가 보내준 데이터받기
String name=request.getParameter("name");
String id=request.getParameter("id");
String email=request.getParameter("email");
String card=request.getParameter("card");
String ssn1=request.getParameter("ssn1");
String ssn2=request.getParameter("ssn2");
String p1=request.getParameter("p1");
String p2=request.getParameter("p2");

//데이터 유효성 체크
if(FormChecker.isNull(name)){
	printErr(out,"이름을 입력하세요");
	return;
}
if(!FormChecker.isID(id)){
	printErr(out,"ID가 잘못 입력 되었습니다");
	return;
}
if(!FormChecker.isEmail(email)){
	printErr(out,"이메일이 잘못 입력 되었습니다");
	return;
}
if(!FormChecker.isCardNumber(card)){
	printErr(out,"카드번호가 잘못 입력 되었습니다");
	return;
}
if(!FormChecker.isSSN(ssn1, ssn2)){
	printErr(out,"주민번호가 잘못 입력 되었습니다");
	return;
}
if(!FormChecker.isSame(p1, p2)){
	printErr(out,"암호를 입력하지 않았거나, 암호와 암호확인이 일치하지 않습니다");
	return;
}
%>

<%
//입력한 정보를 웹으로 응답 
StringBuffer ssn=new StringBuffer(ssn1);
ssn.append("-");
ssn.append(ssn2);
ssn.replace(0, 6, "******"); //앞번호
ssn.replace(8, 13, "#####"); //뒷번호
//암호
StringBuffer p=new StringBuffer(p1);
p=p.replace(0,p1.length()-1, "*****");
%>
<table border="1" width="50%">
  <tr>
    <td>이름</td>
    <td><%=name %></td>
  </tr>
  <tr>
    <td>ID</td>
    <td><%=id%></td>
  </tr>
  <tr>
    <td>이메일</td>
    <td><%=email%></td>
  </tr>
  <tr>
    <td>카드번호</td>
    <td><%=card%></td>
  </tr>
  <tr>
    <td>주민 번호</td>
    <td><%=ssn%></td>
  </tr>
  <tr>
    <td>암호</td>
    <td><%=p%></td>
  </tr>
</table>
</body>
</html>
