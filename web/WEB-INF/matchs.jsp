<%-- 
    Document   : matchs
    Created on : 12 juin 2021, 15:33:21
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            $(function () {
                $("#dialog").dialog();
            });
        </script>
        <title>Matchs</title>
    </head>
    <body>
        <%@ include file="entete.jsp" %>
        <jsp:useBean id="matchs" scope="page" class="fr.menu.modele.MatchsBean"> </jsp:useBean>
        <jsp:useBean id="equipes" scope="page" class="fr.menu.modele.TeamsBean"> </jsp:useBean>

            <h1>Matchs</h1>

            <div class="container">
                <div class="row">
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                <c:forEach items="${matchs.matchsMap}" var="entry">
                    <div class="col-lg-4 col-md-6 col-12">
                        <div class="match">
                            <div class="equipes">
                                <p class="titreMatch"> Match n°${entry.key} </p>
                                <img src="./img/flags/${entry.value.equipe1.flagName}" height="25"/>
                                ${entry.value.equipe1.country}<br>
                                <img src="./img/flags/${entry.value.equipe2.flagName}" height="25"/>
                                ${entry.value.equipe2.country}<br>
                            </div>
                            <c:if test="${entry.value.isPlayed == true}">  
                                <div class="score">
                                    ${entry.value.scoreEquipe1}<br>
                                    ${entry.value.scoreEquipe2}<br>
                                </div> 
                            </c:if> 
                            <div class="quand">
                                ${entry.value.date}<br>
                                ${entry.value.horaire}<br>

                                <br><div class="lieu linkPopup" data-contenu="${entry.key}">lieu</div>
                            </div> 
                        </div>
                        <div id="stade_infos_${entry.key}" class="stade">
                            <div id="index-alert" class="alert alert-light alert-dismissable">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                <p> <b>Ville </b>: ${entry.value.stade.ville} </p>
                                <p> <b>Nom du stade </b>: ${entry.value.stade.stade} </p>
                                <p> <b>Capacité </b>: ${entry.value.stade.capacite} personnes</p>
                                
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <!-- Javascript pour l'affichage d'une fenêtre popup stade -->
        <script type="text/javascript" src="./js/popup.js"></script>
    </body>
</html>
