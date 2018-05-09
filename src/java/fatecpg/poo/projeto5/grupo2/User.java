/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecpg.poo.projeto5.grupo2;

import java.util.ArrayList;

/**
 *
 * @author Outline
 */
public class User {
    public static ArrayList<User> userList = new ArrayList<>();
    
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
        double sum = 0;
        for(Quiz q:finishedQuizzes){
            sum += q.getGrade();
        }
        return sum / (double)finishedQuizzes.size();
    }
}
