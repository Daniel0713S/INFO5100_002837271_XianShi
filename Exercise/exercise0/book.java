public class book {
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
