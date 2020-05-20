<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>NF2-PROVEN ALLERGEN</title>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    </head>
    <body>
        <header>
            <jsp:include page="menu.jsp" />
        </header>
        <main>
            <!-- PROTOTYPE HTML LIST, PENDING TO IMPLEMENT SERVER SIDE FUNCIONALITIES --> 
            <jsp:include page="views/noticies.jsp" />
            <jsp:include page="views/llistaProductes.jsp" />
            <jsp:include page="views/loginModal.jsp" />
        </main>
        <footer>
             <jsp:include page="footer.jsp" />
        </footer>
    </body>
</html>