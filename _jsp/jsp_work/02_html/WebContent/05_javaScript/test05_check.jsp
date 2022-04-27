<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test05_check.jsp</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");//post방식으로 요청시 한글처리

String sub[]=request.getParameterValues("sub");
if(sub==null){
	out.println("선택한 과목이 없습니다"); //웹에다 뿌릴때는 out.println
}else{
	out.println("배열 요소 갯수:"+sub.length+"<br>");
	for(int i=0;i<sub.length;i++){
		out.println(sub[i]+"<br>");
	}
}
%>
</body>
</html>