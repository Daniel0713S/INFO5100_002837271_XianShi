public class courses {
    String course_type;
    String version;
    String homework;
    int quiz_score;
    String module;
    String tests;
    String projects;
    double total_scoreinpercent;

    static void course_type(){
        System.out.println("get type of course, such as science, historical, cultural, humanity");
    }
    static void version(){
        System.out.println("course version, such as online course, or in-person course");
    }
    static void module(){
        System.out.println("generate modules for a course ");
    }
    public static void getter(String[] args)
    {

        courses obj1 = new courses();
        courses obj2 = new courses();
        courses obj3 = new courses();
        // Print and display the object
        System.out.println(obj1.quiz_score);
        System.out.println(obj2.homework);
        System.out.println(obj3.tests);
    }
}
