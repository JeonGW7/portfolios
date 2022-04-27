<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cart.jsp</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
%>
<%@ include file="menu.jsp" %>
<%
String step=request.getParameter("step"); //menu.jsp, remove.jsp
String item=request.getParameter("item");
Vector vec=null; //변수
if(item != null){//선택한 상품 있으면
	vec=(Vector)session.getAttribute("cart");
	if(vec==null){//처음 물건을 선택한 경우이면 
		vec=new Vector();
		vec.add(item); //장바구니에 상품 넣기
		session.setAttribute("cart", vec);
	}else{//장바구니에 내용이 있을때, 장바구니에 추가
		if(step.equals("add")){//장바구니에 넣는 작업
			vec.add(item);
		}else if(step.equals("remove")){//장바구니에서 상품 제거하는 작업
			vec.remove(item);
		}
	}//else-end
	out.println("쇼핑 카트에 담긴 물건(CD)<br>");
	for(int i=0;i<vec.size();i++){
		out.println((i+1)+":"+vec.get(i).toString()+"<br>");
	}
	%>
	현재 카트에 모두 <%=vec.size() %>개가 담겨 있습니다
	<%
	if(vec.size()>0){//장바구니에 물건이 들어있으면
		%>
		  <jsp:include page="remove.jsp" flush="false"/>
		<%
	}//if-end
}//if-end
%>
</body>
</html>