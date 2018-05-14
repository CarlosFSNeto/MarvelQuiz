<%-- 
    Document   : login
    Created on : 10/05/2018, 15:09:42
    Author     : Ton
--%>

<%@page import="org.eclipse.jdt.internal.compiler.parser.Parser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="fatecpg.poo.projeto5.grupo2.User"%>
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
        
            <div class="caixa" id="div">
               <div>
                    <img src="img/deadpool.jpg" class="user">
                </div>
                <div class="form-group usuario-input">
                <label for="usr">Informe seu nome para acessar:</label>
                <input type="text" class="form-control" id="usr">
                     <%
                User t = new User("");
                session.setAttribute("teste", t);
                User nome = (User)session.getAttribute("teste");
                out.println(nome);
                %>
                    <a href="#" class="btn-login" >Login</a>
                </div>
            </div>
        
        <footer>
            <div class="rodape">
                <p> ©2018 Marvel Quiz</p>
            </div>
        </footer>
         <script src="js/config.js"></script>
    </body>
</html>
