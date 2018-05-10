<%-- 
    Document   : login
    Created on : 10/05/2018, 15:09:42
    Author     : Ton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>Login</title>
    </head>
    <body background="img/fundo2.jpg">
        <header>
            <div class="menu">
                
                <ul>
                    <img src="img/marvel.png">
                    <li><a href="home.jsp">Inicio</a></li>
                    <li><a href="#">Quiz</a></li>
                    <li><a href="pontuacao.jsp">Pontuação</a></li>
                    <li><a href="#">Sobre</a></li>
                    
                </ul>
            </div>
        </header>
            <div class="img1">
                <img src="img/hferro.png">
            </div>
        
        <div class="img2">
                <img src="img/hferro.png">
            </div>  
        
            <div class="caixa">
               <div>
                    <img src="img/deadpool.jpg" class="user">
                </div>
                <div class="form-group usuario-input">
                <label for="usr">Informe seu nome para acessar:</label>
                <input type="text" class="form-control" id="usr">
                    <a href="#" class="btn-login" >Login</a>
                </div>
            </div>
        
        <footer>
            <div class="rodape">
                <p> ©2018 Marvel Quiz</p>
            </div>
        </footer>
    </body>
</html>