<%-- 
    Document   : quiz
    Created on : 13/05/2018, 19:43:41
    Author     : fotoa
--%>
<%@page import="fatecpg.poo.projeto5.grupo2.Question"%>
<%@page import="fatecpg.poo.projeto5.grupo2.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    User user = new User("Carlos"); //TODO receber o User da session ao invés de criar um novo
    boolean tested = false;
    double grade = 0d;
    
    
    if (request.getParameter("tested")!=null){
        tested = true;
        int count = 0;
        Quiz last = user.getFinishedQuizzes().get(user.getFinishedQuizzes().size()-1);
        for (int i=0; i<10; i++){
            Question qq = last.getTest().get(i);
            String p = qq.getQuestion();
            if (qq.getAnswer().equals(p)){
                count++;
            }
        }
        grade = 100d * ((double)count/10d);
        last.finishTest(grade);
    }
%>
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
            <%if (!tested){%>
            <form>
            <%
                Quiz q = new Quiz(user); 
                user.getFinishedQuizzes().add(q);
               for (Question question:q.getTest()){
            %>
            <h2><%=question.getQuestion() %></h2>
            <% for (int i=0; i<question.getAlternatives().length; i++){ %>
                <input type="radio" name="<%=question.getQuestion()%>" value="<%=question.getAlternatives()[i] %>"> <%=question.getAlternatives()[i]%><br/>
            <%}}%>
            </hr>
            <br/><input type="submit" name="tested" value="Enviar"/>
        </form>
            <%} else{%>
            <h2>Você acertou <%=grade%>% das questões!</h2>
            <%}%>
        </div>
        
        <footer>
            <div class="rodape rodape-sobre">
                <p> ©2018 Marvel Quiz</p>
            </div>
        </footer>
                <script src="js/config.js"></script>

    </body>
</html>

