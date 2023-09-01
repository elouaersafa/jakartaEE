<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<c:import url="/includes/linkcss.jsp"/>
<body>

<c:import url="/includes/header.jsp"/>

<div class="hero">

    <h1 class="hero_t">Organisez vos repas, ajoutez de nouvelles recettes</h1>
</div>

<div class="main">

    <c:forEach items="${recipeList}" var="recipe">
        <ul>
            <li class="features"><img src="${recipe.photo}">
                <p>${recipe.name}</p></li>
        </ul>
    </c:forEach>
</div>
</body>
</html>