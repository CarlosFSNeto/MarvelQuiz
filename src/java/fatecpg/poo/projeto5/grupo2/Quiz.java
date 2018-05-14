package fatecpg.poo.projeto5.grupo2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Quiz {
    private static Question[] questionList = new Question[]{
        //TODO Cadastrar mais perguntas
        new Question("Qual herói da Marvel utiliza um martelo?", "Thor", new String[]{"Thor", "Homem-Aranha", "Chapolin", "Capitão América"}),
        new Question("Onde se passa a história do Pantera Negra?", "Wakanda", new String[]{"Nova York", "São Vicente", "Wakanda", "Nigéria"}),
        new Question("Em que ano o Homem-Aranha foi criado?", "1952", new String[]{"1932", "1937", "1960", "1952"}),
        new Question("Quem comanda a SHIELD?", "Nick Fury", new String[]{"Nick Fury", "Capitão América", "Reed Richards", "Tony Stark"}),
        new Question("Qual atriz interpreta a Viúva Negra?", "Scarlett Johansson", new String[]{"Chloe Bennet", "Elizabeth Olsen", "Emma Watson", "Scarlett Johansson"}),
        new Question("De acordo com o site adorocinema, Joss Whedon (diretor de diversos filmes da UCM, como Os Vingadores) disse que uma série importante da Marvel foi criada contra a vontade do estúdio. Que série foi essa?", "Agents of SHIELD", new String[]{"Jéssica Jones", "Demolidor", "Agent Carter", "Agents of SHIELD"}),
        new Question("Qual a idade do Homem-Aranha?", "15", new String[]{"16,5", "16", "15", "14"}),
        new Question("Quantas são as jóias do infinito?", "6", new String[]{"6", "9", "5", "4"}),
        new Question("Atualmente (abril de 2016), o Homem Aranha foi recuperado pela Marvel. Antes, seus direitos estavam com quem?", "Sony", new String[]{"DC", "Fox", "Sony", "Warner Bros"}),
        new Question("Qual foi a primeira super heroína com poderes inumanos a aparecer no UCM?", "Daisy Johnson", new String[]{"Viúva Negra", "Feiticeira Escarlate", "Daisy Johnson", "Harpia"}),
        new Question("Stan Lee aparece em quase todos os filmes da Marvel. Onde ele aparece em Os Vingadores?", "Em um telejornal", new String[]{"Em um telejornal", "Em um asilo", "Em um leilão", "Vendendo cachorro-quente"}),
        new Question("Qual destes NÃO é um vilão da Marvel?", "General Zod", new String[]{"Caveira Vermelha", "General Zod", "MODOK", "Arnim Zola"}),
        new Question("Qual mutante que, assim como Wolverine, tem o poder de cura?", "Deadpool", new String[]{"Magneto", "Noturno", "Ciclope", "Deadpool"}),
        new Question("Quem foi o primeiro vingador?", "Capitão América", new String[]{"Capitão América", "Homem-Aranha", "Homem de Ferro", "Hulk"}),
        new Question("Qual a ciadade do Homem-Aranha?", "Nova Iorque", new String[]{"Nova Iorque", "Filadélfia", "Los Angeles", "Detroit"}),
 
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
        //this.user.getFinishedQuizzes().add(this);
        
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
    public ArrayList<Question> getTest() { return this.test;
    }

}
