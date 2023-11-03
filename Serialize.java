import java.io.*;


public class Serialize {
    public static void main(String[] args){
        Shape triangle = new triangle(3, 5, "triangle");
        Shape rectangle = new rectangle(3, 5, "rectangle");
        Shape circle = new circle(3, "circle");
        Shape square = new square(3, "square");

        sANDd(triangle);
        sANDd(rectangle);
        sANDd(circle);
        sANDd(square);

}



    public static void sANDd(Shape shape){
        try{
            FileOutputStream fileOut = new FileOutputStream("serialized_shape.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(shape);
            out.close();
            fileOut.close();


            FileInputStream fileIn = new FileInputStream("serialized_shape.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Shape deserializedShape = (Shape) in.readObject();
            in.close();
            fileIn.close();

            // Print information about the deserialized shape
            System.out.println("Deserialized " + Shape.getName() + ":");
            System.out.println("Area: " + deserializedShape.CalculateArea());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
