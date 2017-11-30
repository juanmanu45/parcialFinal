<%@page import="vo.Consulta"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
          <h1>Registro de Libros</h1>
                    <table>
                        <tr>
                            <td>ID COlMENA</td>
                            <td>KILOS</td>
                            <td>MUNICIPIO</td>
                           
                            
                        </tr>
                        <%
                            if (request.getAttribute("lis") != null) {
                                ArrayList<Consulta> libros = (ArrayList<Consulta>) request.getAttribute("lis");

                                if (libros != null) {
                                    for (Consulta es: libros) {

                        %>
                        <h1></h1>
                        <tr>  
                            <td><%=es.getIdColmena()%></td>
                            <td><%=es.getKilos()%></td>
                            <td><%=es.getMunicipio()%></td>
                            
                           
                        </tr>

                        <%

                                    }
                                }
                            }
                        %>

                    </table>
    </body>
</html>
