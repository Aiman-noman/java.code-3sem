
abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.printf("Area = %.2f\n", calculateArea());
    }
}

class Circle extends Shape {
    double r = 7;
    double calculateArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double l = 10;
    double b = 5;
    double calculateArea() {
        return l * b;
    }
}

public class abstract_shapearea {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();

        Rectangle rect = new Rectangle();
        rect.display();
    }
}
