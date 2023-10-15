public class student {
    String name;
    String age;
    String gender;
    int id;
    String hair_color;
    String eye_color;
    String citizenship;
    double weight;

    static void sort_name(){
        System.out.println("sort student names");
    }
    static void sort_age(){
        System.out.println("sort student age");
    }
    static void classify_haircolor(){
        System.out.println("classify student hair color");
    }

    public static void getter(String[] args)
    {

        student obj1 = new student();
        student obj2 = new student();
        student obj3 = new student();
        // Print and display the object
        System.out.println(obj1.name);
        System.out.println(obj2.age);
        System.out.println(obj3.gender);
    }
}
