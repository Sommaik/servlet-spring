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
            </div>
        </nav>
        
        <div class="container row">
            <form class="col s12" method="POST" action="../saveUserService">
                <div class="row">
                    <div class="input-field col s12">
                        <input id="code" type="text" class="validate" name="code">
                        <label for="code">User Code</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="firstName" type="text" class="validate" name="firstName">
                        <label for="firstName">First Name</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="lastName" type="text" class="validate" name="lastName">
                        <label for="lastName">Last Name</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="age" type="number" class="validate" name="age">
                        <label for="age">Age</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="dob" type="date" class="validate" name="dob" placeholder="input date">
                        
                    </div>
                    <div class="input-field col s6">
                        <input id="pwd" type="password" class="validate" name="pwd">
                        <label for="pwd">Password</label>
                    </div>
                </div>

                <div class="row">
                    <div class="col s12">
                        <button type="submit" class="waves-effect waves-light btn">
                            <i class="material-icons left">save</i>Save</button>
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>

