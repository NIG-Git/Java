<%@ page contentType="text/html; charset=UTF-8" %>

<html>

	<title>SampleAccessSecurity</title>

	<body>

		<!-- 1 -->
		<form action="j_security_check" method="post">
			<h3>ユーザーID : <input type="text" name="j_username"></h3>
			<h3>パスワード : <input type="password" name="j_password"></h3>
			<input type="submit" value="ログイン">
		</form>

	</body>

</html>
