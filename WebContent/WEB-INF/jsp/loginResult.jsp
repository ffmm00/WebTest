<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="example.Era"%>

<%
	Era era = (Era) session.getAttribute("result");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>計算結果</title>
</head>
<body>

<h1>成績</h1>

<%if(era!=null) {%>
<p>防御率は<%= era.getEra() %>です</p>
<%} else{%>
<p>打数が不正です</p>
<% }%>


</body>
</html>