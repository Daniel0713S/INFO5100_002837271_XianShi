import java.util.*;

class Student {
    private String name;
    private List<Integer> quiz_score;
    public Student (String name){
        this.name = name;
        this.quiz_score = new ArrayList<Integer>(15);
    }

    public String getName(){
        return name;
    }


    public List<Integer> getScore(){
        return quiz_score;
    }

    public void addScore(int score){
        quiz_score.add(score);
    }

}


class Part_Time extends Student{

    public Part_Time(String name){
        super(name);
    }
}


class Full_Time extends Student{
    private int exam1;
    private int exam2;

    public  Full_Time(String name, int exam1, int exam2){
        super(name);
        this.exam1 = exam1;
        this.exam2 = exam2;
    }

    public int getExam1() {
        return exam1;
    }

    public int getExam2() {
        return exam2;
    }
}

class Session {
    public List<Student> students = new ArrayList<>(20);
    public Session(){
        this.students = new ArrayList<Student>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public double avg_score(Student student){
        List<Integer> scores = student.getScore();
        int sum = 0;
        for (int value : scores){
            sum += value;
        }
        return sum/scores.size();
    }

    public void printScore(){
        ArrayList<Integer> scores2 = new ArrayList<>();
        for (Student student : students){
            scores2.addAll(student.getScore());
        }
        Collections.sort(scores2);
        System.out.println("Ascending quiz score: " + scores2);
    }

    public void printName(){
        System.out.println("Name of part time students: ");
        ArrayList<String> PT_Name = new ArrayList<>();
        for (Student student : students){
            if (student instanceof Part_Time){
                PT_Name.addAll(Collections.singleton(student.getName()));
            }
        }
        System.out.println(PT_Name);
    }

    public void printFT_Score(){
        System.out.println("Exam scores of full time student: ");

        for (Student student : students){
            if (student instanceof Full_Time){
                System.out.println(student.getName() + " - " + "Exam1: " + ((Full_Time) student).getExam1() + ", " + "Exam2: " + ((Full_Time) student).getExam2());
            }
        }
    }

}

