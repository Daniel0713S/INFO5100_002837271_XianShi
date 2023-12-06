public class animal {
    String live_field;
    String color;
    String name;
    String size;
    double weight;
    double height;
    int age;
    String animal_class;

    static void live_field(){
        System.out.println("live in land, air, or water");
    }
    static void animal_class(){
        System.out.println("vertebrate or invertebrate");
    }
    static void size(){
        System.out.println("sort body type by size: tiny,  small, medium, large, giant");
    }
    public static void getter(String[] args)
    {

        animal obj1 = new animal();
        animal obj2 = new animal();
        animal obj3 = new animal();
        // Print and display the object
        System.out.println(obj1.size);
        System.out.println(obj2.live_field);
        System.out.println(obj3.animal_class);
    }

}
