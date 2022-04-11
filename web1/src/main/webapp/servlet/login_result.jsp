<%@page import="member.dto.loginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션 값 가져오기
	loginDto loginDto = (LoginDto)session.getAttribute("login");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>userid : <%=loginDto.getUserid() %></p>
<p>password : <%=loginDto.getPassword() %></p>
</form>
</body>
</html>