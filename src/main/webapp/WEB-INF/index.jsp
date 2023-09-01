<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<c:import url="/includes/linkcss.jsp"/>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>*


<form action="UserServlet" method="post">

    <input id="lname" name="lname" required/>
    <input id="fname" name="fname"  required/>
    <button type="submit"> envoyer</button>
</form>
</body>
</html>