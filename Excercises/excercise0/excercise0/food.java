public class food {
    String name;
    String type;
    String Sodium;
    String carbo;
    String Cal;
    String nutrition_amt;
    String expired_date;
    int weight;

    static void name(){
        System.out.println("name of food");
    }
    static void type(){
        System.out.println("dairy, meat, veg, fruit");
    }
    static void nutrition_amt(){
        System.out.println("nutrition amount per serving ");
    }
    public static void getter(String[] args)
    {

        food obj1 = new food();
        food obj2 = new food();
        food obj3 = new food();
        // Print and display the object
        System.out.println(obj1.name);
        System.out.println(obj2.type);
        System.out.println(obj3.nutrition_amt);
    }


    class NutInner {
        double Sodium_amt;
        double carbo_amt;

        public void InnerGetter () {
            System.out.println("get amount of each nutrition content");
        }
    }


}
