<%-- 
    Document   : home
    Created on : 08/05/2018, 16:39:48
    Author     : Outline
--%>

<%@page import="fatecpg.poo.projeto5.grupo2.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>Inicio</title>
    </head>
    <body background="img/fundo2.jpg">
        <header>
            <div class="menu">
                
                <ul>
                    <img src="img/marvel.png">
                    <li><a href="home.jsp">Inicio</a></li>
                    <!--<li><a href="quiz.jsp">Quiz</a></li>-->
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
               <div class="conteudo-caixa">
                <p>Bem Vindo ao Marvel Quiz!</p>
                <p class="msg">Aqui você pode aprender muito mais sobre seus heróis ;)</p>
            
                <a href="login.jsp">Acessar</a>
                </div>
                
                <!-- Arrumar daqui pra baixo -->
        <p class="titulo-pontuacao"> Últimos quizzes realizados</p>
            <div class="tabela-pontuacao">
                    <table class="table table-hover">
    <thead>
      <tr>
        <th>Nome</th>
        <th>Data</th>
        <th>Pontuação (%)</th>
      </tr>
    </thead>
    <tbody>
        <%for (int i=0; i<Quiz.lastestTenQuizzes.size(); i++){%>
      <tr>
          <td><%=Quiz.lastestTenQuizzes.get(i).getUser().getName()%></td>
        <td><%=Quiz.lastestTenQuizzes.get(i).getDate()%></td>
        <td><%=Quiz.lastestTenQuizzes.get(i).getGrade()%></td>
      </tr>
      <%}%>
    </tbody>
  </table>
    
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
