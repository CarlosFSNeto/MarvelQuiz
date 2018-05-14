<%-- 
    Document   : quiz
    Created on : 13/05/2018, 19:43:41
    Author     : fotoa
--%>
<%@page import="fatecpg.poo.projeto5.grupo2.Question"%>
<%@page import="fatecpg.poo.projeto5.grupo2.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body background="img/fundo2.jpg" >
        <header>
            <div class="menu">
                
                <ul>
                    <img src="img/marvel.png">
                    <li><a href="home.jsp">Inicio</a></li>
                    <li><a href="quiz.jsp">Quiz</a></li>
                    <li><a href="pontuacao.jsp">Pontuação</a></li>
                    <li><a href="sobre.jsp">Sobre</a></li>
                    
                </ul>
            </div>
        </header>
            <div class="img1">
                <img src="img/hferro.png">
            </div>
        
        <div class="img2">
                <img src="img/hferro.png">
            </div>  
        
        <div class="Quiz" id="div">
            
                    <form>
            
            <%
                
    %>
            </hr>
            <input type="submit" name="tested" value="Enviar"/>
        </form>

        </div>
        
        <footer>
            <div class="rodape rodape-sobre">
                <p> ©2018 Marvel Quiz</p>
            </div>
        </footer>
                <script src="js/config.js"></script>

    </body>
</html>

