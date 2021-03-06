<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="servlet.spring.bean.User"%>
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
        <%ArrayList<User> userdata = (ArrayList<User>)request.getAttribute("userdata"); %>
        <table>
            <thead>
            <tr>
                <th>Code</th>
                <th>Fist Name</th>
                <th>Last Name</th>
                <th>BOD</th>
                <th>Age</th>
            </tr>
            </thead>
            <tbody>
        <% for(int i=0; i<userdata.size(); i++) { 
          User user = userdata.get(i);
        %>
        <tr>
            <td><%=user.getCode()%></td>
            <td><%=user.getFirstName()%></td>
            <td><%=user.getLastName()%></td>
            <td><%=user.getDob()%></td>
            <td><%=user.getAge()%></td>
        </tr>
        <% } %>
            </tbody>
        </table>
    </body>
</html>
