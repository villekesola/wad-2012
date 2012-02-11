<%-- 
    Document   : index
    Created on : Jan 21, 2012, 7:10:30 PM
    Author     : vkesola
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <strong>Chat</strong><br />

        <form method="POST">
        <input type="text" name="viesti" action="/Chat"/><input type="submit" value="Lähetä" />
        </form> 

       Viestit:
        <c:forEach var="viesti" items="${viestit}">
                ${viesti}
            <br />
        </c:forEach>
    </body>
</html>
