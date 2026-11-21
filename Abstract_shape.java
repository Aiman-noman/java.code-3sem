
abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("Area = " + calculateArea());
    }
}

class Circle extends Shape {
    double r = 7;

    double calculateArea() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l = 10;
    double b = 5;

    double calculateArea() {
        return l * b;
    }
}

public class Abstract_shape {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        r.display();
    }
}
