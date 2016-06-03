<%-- 
    Document   : newjsp
    Created on : Mar 1, 2016, 4:27:38 PM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1><%= new Date()%></h1>
        <%
            if("a".equals("b")) {
        %>
            <h4>hola</h4>
        <%
        } else {
        %>
            <h4>hola</h4>
        <%
            }
        %>
    </body>
</html>
