<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">

<title>Insert title here</title>
</head>
<body>
	<sf:form method="get" action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">
		<table class="formtable">
			<tr>
				<td class="label">수강년도:</td>
				<td><sf:input class="control" path="year" type="text" /> <br/>
				<sf:errors cssClass="error" path="year"> </sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">학기:</td>
				<td><sf:input class="control" path="semester" type="text" /><br/>
				<sf:errors cssClass="error" path="semester"> </sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">교과코드:</td>
				<td><sf:input class="control" path="code" type="text" /><br/>
				<sf:errors cssClass="error" path="code"> </sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">교과목명:</td>
				<td><sf:input class="control" path="subject" type="text" /><br/>
				<sf:errors cssClass="error" path="subject"> </sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">구분:</td>
				<td><sf:input class="control" path="classify" type="text" /><br/>
				<sf:errors cssClass="error" path="classify"> </sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">학점:</td>
				<td><sf:input class="control" path="credit" type="text" /><br/>
				<sf:errors cssClass="error" path="credit"> </sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label"></td>
				<td><input value="수강 신청" type="submit" /></td>
			</tr>
		</table>
	</sf:form>

<a href="${pageContext.request.contextPath}">
홈페이지로 돌아가기</a>

</body>
</html>