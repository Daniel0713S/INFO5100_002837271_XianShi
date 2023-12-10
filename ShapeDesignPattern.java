import java.util.Scanner;

//ShapeDrawing is a singleton pattern used for managing shapes.
class ShapeDrawing {
    private static ShapeDrawing instance = new ShapeDrawing();
    private ShapeObserver observer;

    private ShapeDrawing() {}

    public static ShapeDrawing getInstance() {
        return instance;
    }

    // Shapeobserver is an observer pattern 
    public void ShapeObserver(ShapeObserver observer) {
        this.observer = observer;
    }

    // Draw a shape and get update info.
    public void drawShape(Shape shape) {
        System.out.println("Drawing shape: " + shape.getType());
        if (observer != null) {
            observer.update(shape);
        }
    }
}

// ShapeFactory is a factory pattern for creating shapes.
interface ShapeFactory {
    Shape createShape();
}

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

// ShapeObserver is an Observer Pattern for getting shape updates.
interface ShapeObserver {
    void update(Shape shape);
}

// Getting shape updates.
class ShapeUpdates implements ShapeObserver {
    @Override
    public void update(Shape shape) {
        System.out.println("Shape Updates: " + shape.getType() + " drawn.");
    }
}

// Shape interface
interface Shape {
    String getType();
}

// Make implementation of Shape for rectangles.
class Rectangle implements Shape {
    @Override
    public String getType() {
        return "Rectangle";
    }
}

// Make implementation of Shape for circles.
class Circle implements Shape {
    @Override
    public String getType() {
        return "Circle";
    }
}

public class ShapeDesignPattern {
    public static void main(String[] args) {
        // Get the singleton instance of ShapeDrawing.
        ShapeDrawing shapeDrawing = ShapeDrawing.getInstance();

        // Create an observer for getting shape updates.
        ShapeObserver ObserverUpdates = new ShapeUpdates();
        shapeDrawing.ShapeObserver(ObserverUpdates);

        // Create a scanner for user input.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //console output
            System.out.println("Choose a shape to draw (1. Rectangle, 2. Circle, 3. Exit): ");
            int choice = scanner.nextInt();

            // Draw shapes using the RectangleFactory.
            if (choice == 1) {
                shapeDrawing.drawShape(new RectangleFactory().createShape());
            } else if (choice == 2) {
                shapeDrawing.drawShape(new CircleFactory().createShape());
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
