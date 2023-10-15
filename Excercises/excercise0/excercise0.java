

class student{
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

//

class vehicle {
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

//

class animal {
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
//

class food {
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
//

class drink {
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
//

class music{
    String song_type;
    String style;
    String instrument_type;
    String chord;
    String lyric;
    String melody;
    String key;
    double rhythm;

    static void song_type(){
        System.out.println("get type of songs, such as opera, drama, pop songs, classical songs");
    }
    static void style(){
        System.out.println("get style of music, such as blues, jazz, soul, E-music");
    }
    static void instrument_type(){
        System.out.println("get instrument in the music ");
    }
    public static void getter(String[] args)
    {

        music obj1 = new music();
        music obj2 = new music();
        music obj3 = new music();
        // Print and display the object
        System.out.println(obj1.chord);
        System.out.println(obj2.melody);
        System.out.println(obj3.key);
    }


}

//

class book {

    String book_type;
    String version;
    String writer;
    long word_count;
    String texture;
    String font;
    String pictures;
    short page_number;

    static void book_type(){
        System.out.println("get type of books, such as fiction, biography, historical, graphic...");
    }
    static void version(){
        System.out.println("get version of book, such as e-book, or paper book");
    }
    static void pictures(){
        System.out.println("generate pictures in a book ");
    }
    public static void getter(String[] args)
    {

        book obj1 = new book();
        book obj2 = new book();
        book obj3 = new book();
        // Print and display the object
        System.out.println(obj1.font);
        System.out.println(obj2.texture);
        System.out.println(obj3.word_count);
    }

}

//

class movie {

    String movie_type;
    String video;
    String audio;
    long FPS;
    String effect;
    String animation;
    String filter;
    String editing_method;

    static void movie_type(){
        System.out.println("get type of movies, such as action, romance, horror, animation...");
    }
    static void editing_method(){
        System.out.println("get editing_method for movie, cutaways, crossing cutting, parallel editing");
    }
    static void filter(){
        System.out.println("generate filters for a movie");
    }
    public static void getter(String[] args)
    {

        movie obj1 = new movie();
        movie obj2 = new movie();
        movie obj3 = new movie();
        // Print and display the object
        System.out.println(obj1.FPS);
        System.out.println(obj2.effect);
        System.out.println(obj3.audio);
    }

}


//

class courses {
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


//

class language {
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