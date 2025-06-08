class Shape {
    double area;
}

class Rectangle extends Shape {
    void calculateArea(double length, double width) {
        area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Square extends Rectangle {
    void calculateArea(double side) {
        area = side * side;
        System.out.println("Square Area: " + area);
    }
}

class Circle extends Shape {
    void calculateArea(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class Qn3 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.calculateArea(5);

        Rectangle rect = new Rectangle();
        rect.calculateArea(4, 7);

        Circle circle = new Circle();
        circle.calculateArea(3.5);
    }
}
