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
                <a href="#" class="brand-logo">Logo</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="sass.html">Sass</a></li>
                    <li><a href="badges.html">Components</a></li>
                    <li><a href="collapsible.html">JavaScript</a></li>
                </ul>
            </div>
        </nav>

    <div class="container row">
        <form class="col s12" method="POST" action="loginService">
            <div class="row">
                <div class="input-field col s12">
                    <input placeholder="Place your user id" id="first_name" type="text" class="validate" name="userid">
                    <label for="first_name">User Id</label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s12">
                    <input id="password" type="password" class="validate" name="pwd">
                    <label for="password">Password</label>
                </div>
            </div>
            
            <div class="row">
                <div class="col s12">
                     <button type="submit" class="waves-effect waves-light btn">
                        <i class="material-icons left">lock_open</i>Login</button>
                </div>
            </div>
        </form>
    </div>

    </body>
</html>
