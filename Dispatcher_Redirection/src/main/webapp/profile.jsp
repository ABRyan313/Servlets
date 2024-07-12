<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AB</title>
</head>
<body>
         <%
                String myName = (String)session.getAttribute("name_key");
         %>
         
         <h3>Welcome <%= myName %></h3>
         <form action="profile" method = "get">
         <input type = "text" name = "search1" placeholder = "Search here"> <br></br>
         <input type = "submit" name = "search" > <br></br>
         </form>
</body>
</html>