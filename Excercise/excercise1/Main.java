import java.util.*;

public class Main {
    public static void main(String[] args) {
        Session ss = new Session();

        String names[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"};
        Random rand = new Random();
    //suppose: 5 part time students and 15 full time students.

        for (int i = 0; i < 5 ; i++){
            Part_Time ptStudent = new Part_Time("PT Student " + names[i]);
            for (int j = 1; j <= 15; j++){
                ptStudent.addScore(rand.nextInt(50) + 50);
            }
            ss.addStudents(ptStudent);
        }

        for (int i = 5; i < 20 ; i++){
            Full_Time ftStudent = new Full_Time("FT Student " + names[i],rand.nextInt(50) + 50,rand.nextInt(50) + 50);
            for (int j = 1; j <= 15; j++){
                ftStudent.addScore(rand.nextInt(50) + 50);
            }
            ss.addStudents(ftStudent);
        }

        System.out.println("Average quiz score per student for the whole class");
        for (Student student : ss.students){
            double avg_score = ss.avg_score(student);
            System.out.println(student.getName() + " : average quiz score is " + avg_score);
        }

        ss.printScore();
        ss.printName();
        ss.printFT_Score();
    }
}