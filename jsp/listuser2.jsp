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
        <script type="text/javascript">
        function closeMessage(){
            $('#message_cnt').hide();
        }
        </script>
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
        <div class="container">
            <c:if test="${not empty process_msg}">
            <div class="row" id="message_cnt">
                <div class="col s12">
                    <div class="card blue-grey darken-1">
                        <div class="card-content white-text">
                            <span class="card-title">Result Message</span>
                            <p><c:out value="${process_msg}" /></p>
                        </div>
                        <div class="card-action">
                            <button class="btn" onclick="closeMessage()">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            </c:if>

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
            <div class="fixed-action-btn">
                <a href="jsp/userForm.jsp" 
                   class="btn-floating btn-large waves-effect waves-light red right">
                    <i class="material-icons">add</i>
                </a>
            </div>
        </div>
        <!-- 
        # Advance #
        Display success or error message from save user service 
        -->
    </body>
</html>