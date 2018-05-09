package fatecpg.poo.projeto5.grupo2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Quiz {
    private static Question[] questionList = new Question[]{
        //TODO Cadastrar as perguntas conforme as linhas abaixo:
        new Question("1Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("2Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("3Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("4Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("5Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("6Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("7Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("8Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("9Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("10Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("11Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("12Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("13Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("14Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("15Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"})
        
    };
    
    public static ArrayList<Quiz> topTenQuizzes = new ArrayList<>();
    public static ArrayList<Quiz> lastestTenQuizzes = new ArrayList<>();
    
    private ArrayList<Question> test;
    private double grade;
    private Date date;
    private User user;

//    public static void main(String[] args){
//        Quiz q = new Quiz();
//        for(Question item: q.test){
//            System.out.println(item.getQuestion());
//        }
//        System.out.println(q.date.toLocaleString());
//    }
    public Quiz(User user) {
        this.user = user;
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

    public String getDate() {
        return date.toLocaleString();
    }

    public User getUser(){
        return this.user;
    }
    
    public void finishTest(double grade){
        this.grade = grade;
        this.date = Calendar.getInstance().getTime();
        this.user.getFinishedQuizzes().add(this);
        
        lastestTenQuizzes.add(0, this);
        if (lastestTenQuizzes.size()>10){
            lastestTenQuizzes.remove(10);
        }
        
        int size = topTenQuizzes.size();
        if (size==0){
            topTenQuizzes.add(this);
        } 
        else {
            int i = size;
            
            while (i>0 && this.grade>topTenQuizzes.get(i-1).grade){
                i--;
            }
            
            if (i<10){
                topTenQuizzes.add(i, this);
            }
            
            if (topTenQuizzes.size()>10){
                topTenQuizzes.remove(10);
            }
        }
    }
}
