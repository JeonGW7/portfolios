<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--menu.jsp--%>
<h2>구매할 CD를 고르세요</h2>
<form method="post">
  <select name="item">
    <option value="임영웅CD" selected>임영웅CD</option>
    <option value="허각CD" selected>허각CD</option>
    <option value="김필CD" selected>김필CD</option>
    <option value="아이유CD" selected>아이유CD</option>
    <option value="김범수CD" selected>김범수CD</option>
    <option value="백지영CD" selected>백지영CD</option>
    <option value="나얼CD" selected>나얼CD</option>
  </select>
  <input type="hidden" name="step" value="add"><!-- 장바구니에 넣기 -->
  <input type="submit" value="선택">
</form>