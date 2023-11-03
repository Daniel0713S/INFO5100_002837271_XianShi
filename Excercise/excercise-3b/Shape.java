abstract class Shape {
    static String name;
    public double CalculateArea(){
        return 0.0;
    }

    public Shape(String name){
        this.name = name;
    }

    public static String getName(){
        return name;
    }
}

class triangle extends Shape{
    double base;
    double height;

    public triangle(double base, double height, String name){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double CalculateArea() {
        return 0.5 * base * height;
    }


}

class rectangle extends Shape{
    double width;
    double length;

    public rectangle(double width, double length, String name){
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double CalculateArea() {
        return width * length;
    }


}

class circle extends Shape{
    double radius;
    double pi = 3.1415926;

    public circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        return radius * radius * pi;
    }


}


class square extends Shape{
    double length;

    public square(double length, String name){
        super(name);
        this.length = length;
    }

    @Override
    public double CalculateArea() {
        return length * length;
    }

}

