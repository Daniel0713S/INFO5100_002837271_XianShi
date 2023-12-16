import java.util.*;

// Class representing a student
class Student {
    private String name;
    private List<Integer> quiz_score;
    // Constructor to initialize a student with a name
    public Student (String name){
        this.name = name;
        this.quiz_score = new ArrayList<Integer>(15);
    }

    // Getter method for the student's name
    public String getName(){
        return name;
    }

    // Getter method for the student's quiz scores
    public List<Integer> getScore(){
        return quiz_score;
    }

    // Method to add a quiz score for the student
    public void addScore(int score){
        quiz_score.add(score);
    }

}

// Class representing a part-time student, inheriting from the Student class
class Part_Time extends Student{

    public Part_Time(String name){
        super(name);
    }
}

// Class representing a full-time student, inheriting from the Student class
class Full_Time extends Student{
    private int exam1;
    private int exam2;

     // Constructor to initialize a full-time student with a name, exam1, and exam2 scores
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

// Class representing a session with a list of students
class Session {
    public List<Student> students = new ArrayList<>(20);
    public Session(){
        this.students = new ArrayList<Student>();
    }

    // Method to add a student to the session
    public void addStudents(Student student) {
        students.add(student);
    }

    // Method to calculate the average quiz score for a student
    public double avg_score(Student student){
        List<Integer> scores = student.getScore();
        int sum = 0;
        for (int value : scores){
            sum += value;
        }
        return sum/scores.size();
    }

    // Method to print all quiz scores in ascending order
    public void printScore(){
        ArrayList<Integer> scores2 = new ArrayList<>();
        for (Student student : students){
            scores2.addAll(student.getScore());
        }
        Collections.sort(scores2);
        System.out.println("Ascending quiz score: " + scores2);
    }

    // Method to print names of part-time students
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

    // Method to print exam scores of full-time students
    public void printFT_Score(){
        System.out.println("Exam scores of full time student: ");

        for (Student student : students){
            if (student instanceof Full_Time){
                System.out.println(student.getName() + " - " + "Exam1: " + ((Full_Time) student).getExam1() + ", " + "Exam2: " + ((Full_Time) student).getExam2());
            }
        }
    }

}

