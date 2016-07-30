<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>トップページ</title>
</head>
<body>
	<h1>スタート画面です</h1>

	<form action="/example/Login" method="post">
		投球回:<input type="text" name="ini"><br>
		 失点:<input type="text" name="runs"><br>
		 <input type="submit"value="cul">
	</form>

</body>
</html>