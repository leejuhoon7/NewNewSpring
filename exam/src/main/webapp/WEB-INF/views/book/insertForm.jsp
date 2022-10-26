<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책등록!</title>
</head>
<body>
<h4>책등록!</h4>

<form id = "insertForm" action="insert" method="post">
	<div>도서번호<input type = "number" name="bookNo" value="${no }"></div>	
	<div>도서명<input name="bookName" required="required"></div>
	<div>도서표지<input type="text" name="bookCoverimg"></div>
	<div>출판일자<input type="date" name="bookDate"></div>
	<div>금액<input name="bookPrice"></div>
	<div>출판사<input name="bookPublisher"></div>
	<div>도서소개<input name="bookInfo"></div>
	<button>등록</button>
	<button>조회</button>
</form>


</body>
</html>