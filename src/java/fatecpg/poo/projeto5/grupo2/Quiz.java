package fatecpg.poo.projeto5.grupo2;

import java.util.ArrayList;

public class Quiz {
    private static Question[] questionList = new Question[]{
        //TODO Cadastrar as perguntas conforme a linha abaixo, separando por vírgula
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"})
    };
    private ArrayList<Question> test;
    
    public ArrayList<Question> getTest(){
        //TODO retornar um ArrayList com 10 elementos sorteados do array Question
        return null;
    }
}
