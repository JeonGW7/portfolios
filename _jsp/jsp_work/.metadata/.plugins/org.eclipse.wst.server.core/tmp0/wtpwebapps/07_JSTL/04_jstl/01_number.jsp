<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--01_number.jsp--%>
<%--숫자 출력 실습--%>
숫자:<fmt:formatNumber value="12345.678" type="number"/><br>
통화기호:<fmt:formatNumber value="12345.678" type="currency" currencySymbol="￦"/><br>
퍼센트:<fmt:formatNumber value="12345.678" type="percent"/><br>
pattern:<fmt:formatNumber value="12345.678" pattern=".0"/><br>
