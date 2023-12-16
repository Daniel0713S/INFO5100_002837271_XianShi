// Abstract class
abstract class Shape {
    String name;
    // Default method to calculate the area
    public double CalculateArea(){
        return 0.0;
    }

    public Shape(String name){
        this.name = name;
    }
    
    // Static method to get the name of the shape
    public String getName(){
        return name;
    }
}

// Subclass representing a triangle
class triangle extends Shape{
    double base;
    double height;

    public triangle(double base, double height, String name){
        super(name);
        this.base = base;
        this.height = height;
    }
    
    // Override method to calculate the area of the triangle
    @Override
    public double CalculateArea() {
        return 0.5 * base * height;
    }


}

// Subclass representing a rectangle
class rectangle extends Shape{
    double width;
    double length;

    public rectangle(double width, double length, String name){
        super(name);
        this.width = width;
        this.length = length;
    }
    
    // Override method to calculate the area of the rectangle
    @Override
    public double CalculateArea() {
        return width * length;
    }


}

// Subclass representing a circle
class circle extends Shape{
    double radius;
    double pi = 3.1415926;

    public circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }
    // Override method to calculate the area of the circle
    @Override
    public double CalculateArea() {
        return radius * radius * pi;
    }


}

// Subclass representing a square
class square extends Shape{
    double length;

    public square(double length, String name){
        super(name);
        this.length = length;
    }
    // Override method to calculate the area of the square
    @Override
    public double CalculateArea() {
        return length * length;
    }

}

