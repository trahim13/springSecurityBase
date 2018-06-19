<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.06.2018
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="<c:url value="/resources/css/login.css"/>" rel="stylesheet"/>
</head>
<body>

<c:if test ="${not empty error}">
    ${error}
</c:if>

<form name='form_login' action="/login" method='POST'>
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='user_login' ></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password_login' /></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="remember-me" id="remember-me"/>
                <label for="remember-me">Запомнить</label>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
