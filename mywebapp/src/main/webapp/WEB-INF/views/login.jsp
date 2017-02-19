<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>

<head>
<title>Login Page</title>
</head>
<body>
	<h3>Login with Username and Password</h3>
	<spring:url var="loginUrl" value="/dologin"></spring:url>
	<form action="${loginUrl}" method="POST">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type='text' name='username'  id="username"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' id="password" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
</body>
</html>