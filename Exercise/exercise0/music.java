public class music {
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
