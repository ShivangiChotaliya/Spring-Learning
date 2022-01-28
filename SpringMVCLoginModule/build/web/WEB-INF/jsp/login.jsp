<%-- 
    Document   : login
    Created on : Jan 28, 2022, 11:11:38 AM
    Author     : Shivangi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><font color="red">${errorMessage}</font></p>
        <form method="POST">
            Name : <input name="name" type="text"/>
            Password : <input name="password" type="password" />
            <input type="submit" />
        </form>
    </body>
</html>
