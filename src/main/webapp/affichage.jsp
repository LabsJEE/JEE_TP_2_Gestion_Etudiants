<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="web.Etudiant"%>
<html>
    <head>
        <style>
            table,th,td {
                padding: 10px;
                border: 1px solid black;
                border-collapse: collapse;
                text-align: center;
            }
        </style>
    </head>
    <body> 
        <table>
            <tr>
                <th>Nom</th>
                <th>Prénom</th>
                <th>CIN</th>
                <th>Sexe</th>
                <th>Spécialité</th>
                <th></th>
            </tr>
            <%ArrayList<Etudiant> list = (ArrayList<Etudiant>) request.getAttribute("etudiants");%>
            <% for(Etudiant e : list){ %>
                <tr>
                    <td><%=e.nom%></td>
                    <td><%=e.prenom%></td>
                    <td><%=e.cin%></td>
                    <td><%=e.sexe%></td>
                    <td><%=e.specialite%></td>
                    <td>
                        <form method="post" action="SupprimerEtudiant" style="display: inline;">
                        <input type="hidden" value="<%=e.getCin()%>" name="cin"/>	
                        <button>Supprimer</button>
                        </form>
                    </td>
                </tr>
                
            <%}%>
        </table>
    </body>
</html>