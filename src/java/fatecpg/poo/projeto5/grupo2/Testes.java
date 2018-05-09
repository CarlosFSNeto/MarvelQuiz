/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecpg.poo.projeto5.grupo2;

/**
 *
 * @author Outline
 */
public class Testes {
    public static void main(String[] args){
        
        User u1 = new User("Carlos");
        User.userList.add(u1);
        User u2 = new User("José");
        User.userList.add(u2);
        User u3 = new User("Ailton");
        User.userList.add(u3);
        User u4 = new User("Edvaldo");
        User.userList.add(u4);
                
        Quiz q1 = new Quiz(u1);
        Quiz q2 = new Quiz(u1);
        Quiz q3 = new Quiz(u2);
        Quiz q4 = new Quiz(u2);
        Quiz q5 = new Quiz(u3);
        Quiz q6 = new Quiz(u3);
        Quiz q7 = new Quiz(u3);
        Quiz q8 = new Quiz(u3);
        Quiz q9 = new Quiz(u4);
        Quiz q10 = new Quiz(u4);
        Quiz q11 = new Quiz(u4);
        Quiz q12 = new Quiz(u4);
        Quiz q13 = new Quiz(u4);
        
        q1.finishTest(20);
        q2.finishTest(10);
        q3.finishTest(50);
        q4.finishTest(70);
        q5.finishTest(100);
        q6.finishTest(0);
        q7.finishTest(40);
        q8.finishTest(100);
        q9.finishTest(100);
        q10.finishTest(10);
        q11.finishTest(70);
        q12.finishTest(90);
        q13.finishTest(100);
        
        //Teste do ranking
        for(Quiz q:Quiz.topTenQuizzes){
            System.out.println("Usuário: " +q.getUser().getName() + " Nota: "+q.getGrade()+" Data: "+q.getDate());
        }
        
        //Teste da média do usuário
        System.out.println("Usuário: "+ u1.getName()+" Média: " + u1.getUserAverageGrade());
    }
}
