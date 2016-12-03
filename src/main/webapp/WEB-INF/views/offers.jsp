<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
</head>
<body>
	<table class="formtable2">
		<tr>
			<td>교과코드</td>
			<td>교과목명</td>
			<td>구분</td>
			<td>학점</td>
		</tr>
		<tr>
			<c:forEach var="offer" items="${offers}">
				<td>${offer.code}</td>
				<td>${offer.subject}</td>
				<td>${offer.classify}</td>
				<td>${offer.credit}</td>
			</c:forEach>
		</tr>

	</table>

<a href="${pageContext.request.contextPath}">
홈페이지로 돌아가기</a>

</body>
</html>