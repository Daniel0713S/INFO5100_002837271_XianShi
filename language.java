public class language {
    String language_type;
    String pronounce;
    String grammar;
    String context;
    String characters;
    String alphabet;
    String sentence;
    String idiom;

    static void language_type(){
        System.out.println("get type of language, such as english, chinese, french...");
    }
    static void grammar(){
        System.out.println("get grammar");
    }
    static void context(){
        System.out.println("recognizing context in sentences ");
    }
    public static void getter(String[] args)
    {

        language obj1 = new language();
        language obj2 = new language();
        language obj3 = new language();
        // Print and display the object
        System.out.println(obj1.alphabet);
        System.out.println(obj2.characters);
        System.out.println(obj3.sentence);
    }


}
