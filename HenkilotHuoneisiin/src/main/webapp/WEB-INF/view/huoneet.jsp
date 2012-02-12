<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Huonehallinta</title>
    </head>
    <body>
        <h1>Huonehallinta</h1>

        <h2>Lisää huone</h2>
        <form action="lisaaHuone" method="POST">
            Huoneen kerros: <input type="text" name="kerros"><br/>
            Huoneen kapasiteetti: <input type="text" name="kapasiteetti"><br/>
            <input type="submit" value="Lisää">
        </form>

        <h2>Huoneet</h2>
        <ul>
            <c:forEach var="huone" items="${huoneet}">
                <li>kerros ${huone.kerros}, kapasiteetti ${huone.kapasiteetti}, <a href="poistaHuone/${huone.id}">poista</a></li>
            </c:forEach>
        </ul>
    </body>
</html>