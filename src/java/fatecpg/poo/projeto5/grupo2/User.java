package fatecpg.poo.projeto5.grupo2;

import java.util.ArrayList;

public class User {
    public static ArrayList<User> userList = new ArrayList<>();
    
    public User(String name){
        this.name=name;
        this.finishedQuizzes = new ArrayList<>();
        //Adicionar o usuário na userList: aqui ou no JSP?
        //userList.add(this);
    }
    private String name;
    private ArrayList<Quiz> finishedQuizzes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Quiz> getFinishedQuizzes() {
        return finishedQuizzes;
    }
    
    public double getUserAverageGrade(){
        if (finishedQuizzes.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(Quiz q:finishedQuizzes){
            sum += q.getGrade();
        }
        return sum / (double)finishedQuizzes.size();
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
