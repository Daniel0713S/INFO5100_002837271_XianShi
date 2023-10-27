public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new triangle(3,5, "triangle"),
                new rectangle(3,5, "rectangle"),
                new circle(3, "circle"),
                new square(3, "square"),
        };

        for (Shape shape:shapes){
            System.out.println(shape.getName() + " : " + shape.CalculateArea());
        }
    }
}