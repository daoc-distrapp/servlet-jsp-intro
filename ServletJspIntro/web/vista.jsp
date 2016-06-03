<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Vista</title>
    </head>
    <body>
        <h3>Bienvenido: <%= request.getParameter("usuario") %></h3>
        <table>
            <% 
                String[] permisos = (String[])request.getAttribute("permisos");
                for(String str : permisos) { 
            %>
            <tr>
                <td bgcolor='#CCCCCC'>
                    <%= str %>
                </td>
            </tr>
            <% 
                }
            %>
        </table>

    </body>
</html>
