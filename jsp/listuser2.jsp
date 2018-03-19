<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>


        <nav>
            <div class="nav-wrapper">
                <a href="#" class="brand-logo">List User</a>
            </div>
        </nav>

        <table>
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Fist Name</th>
                    <th>Last Name</th>
                    <th>DOB</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${userdata}" var="user">
                    <tr>
                        <td><c:out value="${user.code}" /></td>
                        <td><c:out value="${user.firstName}" /></td>
                        <td><c:out value="${user.lastName}" /></td>
                        <td><c:out value="${user.dob}" /></td>
                        <td><c:out value="${user.age}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <a href="jsp/userForm.jsp" 
           class="btn-floating btn-large waves-effect waves-light red right">
            <i class="material-icons">add</i>
        </a>
        <!-- 
        # Advance #
        Display success or error message from save user service 
        -->
    </body>
</html>