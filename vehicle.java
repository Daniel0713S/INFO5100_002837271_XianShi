public class vehicle {
    String color;
    String fuel_type;
    String engine_type;
    int horse_power;
    String body_type;
    String brand;
    String wheeldrive_type;
    String drive_type;

    static void wheeldrive_mode(){
        System.out.println("swtich 2wd - 4wd");
    }

    static void drive_mode(){
        System.out.println("keys start, or push button");
    }

    static void body_type(){
        System.out.println("sort body type by size");
    }

    public static void getter(String[] args)
    {

        vehicle obj1 = new vehicle();
        vehicle obj2 = new vehicle();
        vehicle obj3 = new vehicle();
        // Print and display the object
        System.out.println(obj1.color);
        System.out.println(obj2.drive_type);
        System.out.println(obj3.body_type);
    }
}
