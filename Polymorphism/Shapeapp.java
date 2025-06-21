package Polymorphism;

abstract class Shapes {
    abstract double AreaCalculation();
}

class Circle extends Shapes {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    double AreaCalculation() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shapes {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double AreaCalculation() {
        return length  * breadth;
    }
}

class Triangle extends Shapes {
    double length;
    double height;
    Triangle (double length, double height) {
        this.length = length;
        this.height = height;
    }

    double AreaCalculation() {
    return 0.5 * length * height;
    }
}

public class Shapeapp {
    public static void main(String[] args) {
        Shapes[] shapes = {
            new Circle(5),
            new Rectangle(5,5),
            new Triangle(5,5)
        };
        for (Shapes s : shapes) {
            System.out.println("Area: "+s.AreaCalculation());
        }
    }
}
