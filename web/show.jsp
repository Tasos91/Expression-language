<%-- 
    Document   : show
    Created on : 15 Οκτ 2018, 7:25:38 μμ
    Author     : Tasos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="java.util.Date" %>
        
        <h1>Hello World!</h1>
        <h2>The current time is:</h2>
        <%=new Date() %><br>
        <%="hi there"%>
        ${mycar.brand}<br>
        ${mycar.engine}<br>
        ${mycar.color}<br>
        ${mycar.horsepower}
    </body>
</html>
