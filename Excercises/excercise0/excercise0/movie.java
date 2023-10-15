public class movie {
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
