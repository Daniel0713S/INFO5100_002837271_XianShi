public class drink {
    String name;
    String type;
    String flavor;
    String carbo;
    String Cal;
    String nutrition_amt;
    String expired_date;
    int vol;

    static void name(){
        System.out.println("name of drink");
    }
    static void type(){
        System.out.println("milk, still water, squeeze, alcohol");
    }
    static void nutrition_amt(){
        System.out.println("nutrition amount per serving ");
    }
    public static void getter(String[] args)
    {

        drink obj1 = new drink();
        drink obj2 = new drink();
        drink obj3 = new drink();
        // Print and display the object
        System.out.println(obj1.name);
        System.out.println(obj2.type);
        System.out.println(obj3.nutrition_amt);
    }


    class typeInner {
        String Jin;
        String Vodka;
        String wine;
        String beer;
        String rum;
        String tequila;

        public void InnerGetter () {
            System.out.println("get innertypes of alcohol");
        }
    }

}
