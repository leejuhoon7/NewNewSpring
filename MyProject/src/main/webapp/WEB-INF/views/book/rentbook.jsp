<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>대여총계</th>
				<th>대여횟수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${booklist }" var="bl">
				<tr>
					<td>${bl.bookNo }</td>
					<td>${bl.bookName }</td>
					<td>${bl.totalPrice }</td>
					<td>${bl.rentCount }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>