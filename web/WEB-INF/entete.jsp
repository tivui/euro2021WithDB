<%-- 
    Document   : entete
    Created on : 12 juin 2021, 09:59:53
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entete</title>
        <link rel="stylesheet" href="./css/style.css">
    </head>
    <body>
        <nav>
            <div class="menu">
                <div class="left_bloc">
                    <a href="menu"><button class="btn btn-light buttonMyStyle">Accueil</button></a>
                </div>
                <div class="right_bloc">
                    <a href="matchs"><button class="btn btn-light buttonMyStyle">Matchs</button></a>
                    <a href="profil"><button class="btn btn-light buttonMyStyle">Profil</button></a>
                    <a href="about"><button class="btn btn-light buttonMyStyle">A propos</button></a>
                    <a href="LogoutServlet"><button class="btn btn-light buttonMyStyle">Déconnexion</button></a>
                </div>
            </div>
        </nav>
    </body>
</html>