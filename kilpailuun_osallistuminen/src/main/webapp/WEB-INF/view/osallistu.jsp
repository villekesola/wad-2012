<%-- 
    Document   : osallistu
    Created on : Jan 27, 2012, 9:47:28 PM
    Author     : vkesola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="osallistu" method="POST">
        <span>Nimi: <input type="text" name="nimi" ></span><br>
        <span>Email: <input type="text" name="email" ></span><br>
        <span>Saa mainostaa jatkossa: <input type="checkbox" name="osallistuuKilpailuun" ></span><br>
        <input type="submit">
    </form>
    </body>
</html>
