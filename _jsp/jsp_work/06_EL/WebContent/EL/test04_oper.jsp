<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--test04_oper.jsp--%>
<%--EL연산자--%>
<h2>산술연산자</h2>
\${7+5}=${7+5}<br>
\${7-5}=${7-5}<br>
\${7*5}=${7*5}<br>
\${7/5}=${7/5}<br><%--몫은 아니다--%>
\${7%5}=${7%5}<br>

<%-- 
\${7 div 5}=${7 div 5}<br>
\${7 mod 5}=${7 mod 5}<br>
--%>

<h2>관계연산자</h2>
${7==5}<br>
${7!=5}<br>
${7>5}<br>
${7>=5}<br>
${7<5}<br>
${7<=5}<br>

<h2>논리연산자</h2>
${7==5 || 7>5}<br>
${7>=5 || 7>5}<br>
${7==5 && 7>5}<br>
${7>=5 && 7>5}<br>

<h2>3항연산자,조건연산자</h2>
${(5+3)==8?8:10}<br>
${(5+5)==8?8:10}<br>
