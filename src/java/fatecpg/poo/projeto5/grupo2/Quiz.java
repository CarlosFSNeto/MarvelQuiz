package fatecpg.poo.projeto5.grupo2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Quiz {
    private static Question[] questionList = new Question[]{
        //TODO Cadastrar as perguntas conforme as linhas abaixo:
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Homem-Aranha", "Chapolin", "Capitão América"})
    };
    
    private static ArrayList<Quiz> getTopTenQuizzes(){
        ArrayList<Quiz> ret = new ArrayList<>();
        //TODO ordernar os quizzes realizados por nota; recuperá-los através da User.userList
        return null;
    }
    
    private static ArrayList<Quiz> getLastestTenQuizzes(){
        //TODO ordenar os quizzes por ordem decrescente de data
        //Outra opção: Manter uma lista que é atualizada cada vez que um Quiz é finalizado
        return null;
    }
    private ArrayList<Question> test;
    private double grade;
    private Date date;

//    public static void main(String[] args){
//        Quiz q = new Quiz();
//        for(Question item: q.test){
//            System.out.println(item.getQuestion());
//        }
//        System.out.println(q.date.toLocaleString());
//    }
    public Quiz() {
        //A nota deve ser atualizada com o método setGrade quando o usuário terminar o teste
        grade = 0d;
        date = Calendar.getInstance().getTime();
        test = new ArrayList<>(10);
        for (int i=0; i<10; i++){
            int randomIndex;
            do {
                randomIndex = (int)(Math.random() * questionList.length);
            }while (test.contains(questionList[randomIndex]));
            test.add(questionList[randomIndex]);
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
        //Ao definir a nota final, atualiza a hora:
        this.date = Calendar.getInstance().getTime();
    }

    public String getDate() {
        return date.toLocaleString();
    }

    
}
