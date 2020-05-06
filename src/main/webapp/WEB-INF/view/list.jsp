<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
</head>
<body>
<form action="/selects">
	姓名：<input type="text" name="name">
	房价：<input type="text" name="money1">至<input type="text" name="money2">
	<input type="submit" value="查询">
</form>
<table class="table">
	<tr>
		<td>预定日期</td>
		<td>姓名</td>
		<td>手机</td>
		<td>房型</td>
		<td>房价</td>
		<td>备注</td>
	</tr>
	<c:forEach items="${info.list }" var="a">
		<tr>
			<td>${a.ydtime }</td>
			<td>${a.name }</td>
			<td>${a.pone }</td>
			<td>
				<c:if test="${a.type_id==1 }">标准双人间</c:if>
				<c:if test="${a.type_id==2 }">豪华单间</c:if>
				<c:if test="${a.type_id==3 }">大床房</c:if>
			</td>
			<td>${a.money }</td>
			<td>${a.bei }</td>
		</tr>
	</c:forEach>
</table>
<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>

</body>
<script type="text/javascript">
	function goPage(page){
		location.href="/selects?page="+page;
	}
	
	
</script>
</html>