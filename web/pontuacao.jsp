<%-- 
    Document   : pontuacao
    Created on : 10/05/2018, 15:11:25
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
        <title>Ranking</title>
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
        
            <div class="caixa caixa-pontuacao" id="div">
              
                <p class="titulo-pontuacao"> Ranking de Jogadores</p>
                
                <div class="tabela-pontuacao">
                    <table class="table table-hover">
    <thead>
      <tr>
        <th>Nome</th>
        <th>Qtde Acertos</th>
        <th>Qtde Erros</th>
        <th>Pontuação</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>John Macir Tude</td>
        <td>Doe</td>
        <td>john@example.com</td>
        <td>john@example.com</td>
      </tr>
    </tbody>
  </table>
                </div>
                
                </div>
        <div class="botoes-pt">
                <a class="btn-pt" href="quiz.jsp">Retornar ao Quiz</a>
                <a class="btn-pt" href="home.jsp">Retornar ao Inicio</a>
                </div>
        
        <footer>
            <div class="rodape">
                <p> ©2018 Marvel Quiz</p>
            </div>
        </footer>
         <script src="js/config.js"></script>
    </body>
</html>
