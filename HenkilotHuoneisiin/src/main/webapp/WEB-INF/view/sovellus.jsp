<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Henkilörekisteri</title>
    </head>
    <body>
        <h2>Henkilörekisteri</h2>
        <h2>Lisää henkilö</h2>
        <form action="lisaaHenkilo" method="POST">
            Henkilön nimi: <input type="text" name="nimi"><br/>
            Henkilön osoite <input type="text" name="osoite"><br/>
            Henkilön puhelinnumero <input type="text" name="puhelinnumero"><br/>
            <input type="submit" value="Lisää">
        </form>
        <h2>Henkilöt</h2>
        <ul>
            <c:forEach var="henkilo" items="${henkilot}">
                <li>nimi ${henkilo.nimi}, osoite ${henkilo.osoite}, puhelinnumero ${henkilo.puhelinnumero} <a href="poistaHenkilo/${henkilo.id}">poista</a></li>
            </c:forEach>
        </ul>
        <h2>Huonehallinta</h2>
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
        <h2>Henkilöt huoneisiin</h2>
        
        
    </body>
</html>