<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <img src="${pageContext.request.contextPath}./images.png"/>
     <img src="${pageContext.request.contextPath}/images.png"/>
     <img src="<%= request.getContextPath() %>/images.png">
     <img src="images.png" style="height:100px ;">
     <form method="post" action="/test2Spring/add">
     No 1: <input type="text" name="t1"><br>
     No 2: <input type="text" name="t2"><br>
     <input type="submit">
    </form>
</body>
</html>