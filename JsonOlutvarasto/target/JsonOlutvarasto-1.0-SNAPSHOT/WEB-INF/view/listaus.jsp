<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Olutvarasto</title>
    </head>
    <body>
        <h1>Olutvarasto</h1>

        <h2>Lisää olut</h2>
        <form action="olut" method="POST">
            Oluen nimi: <input type="text" name="name"><br/>
            <input type="submit" value="Lisää">
        </form>

        <h2>Oluet</h2>
        <ul>
            <c:forEach var="olut" items="${oluet}">
                <li>${olut.name} <a href="olut/${olut.id}">poista</a></li>
            </c:forEach>
        </ul>
</table>
        
    </body>
</html>
