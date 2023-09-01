<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<c:import url="/includes/linkcss.jsp"/>
<body>
<<<<<<< HEAD

<c:import url="/includes/header.jsp"/>

<div class="hero">

    <h1 class="hero_t">Organisez vos repas, ajoutez de nouvelles recettes</h1>
</div>

<div class="main">

    <div class="features"><img src=""><p>${get.nom}</p></div>
    <div class="features"></div>
    <div class="features"></div>
    <div class="features"></div>
    <div class="features"></div>
    <div class="features"></div>
</div>
=======
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>*


<form action="UserServlet" method="post">

    <input id="lname" name="lname" required/>
    <input id="fname" name="fname"  required/>
    <button type="submit"> envoyer</button>
</form>
>>>>>>> cad190421345d525bfb676fecc0a2aefa2653254
</body>
</html>