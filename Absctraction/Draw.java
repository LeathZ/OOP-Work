package Absctraction;

import java.util.Scanner;

abstract class Draw {
    void calculateVolume(){
        System.out.println("Calculate volume");
    }
    void calculateArea(){
        System.out.println("Calculate area");
    }
    void calculatePerimeter(){
        System.out.println("Calculate perimeter");
    }
}

class Cube extends Draw {
    @Override
    void calculateVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of cube:");
        int s = sc.nextInt();
        System.out.println("Volume = " + (s* s * s));
    }

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of cube:");
        int s = sc.nextInt();
        System.out.println("Surface Area = " + (6 * s * s));
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of cube:");
        int s = sc.nextInt();
        System.out.println("Total Edge Length (Perimeter) = " + (12 * s));
    }
}

class Cuboid extends Draw {
    @Override
    void calculateVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        System.out.println("Enter height:");
        int h = sc.nextInt();
        System.out.println("Volume = " + (l * b * h));
    }

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        System.out.println("Enter height:");
        int h = sc.nextInt();
        int area = 2 * (l * b + b * h + l * h);
        System.out.println("Surface Area = " + area);
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        System.out.println("Enter height:");
        int h = sc.nextInt();
        int perimeter = 4 * (l + b + h);
        System.out.println("Total Edge Length (Perimeter) = " + perimeter);
    }
}

class Cylinder extends Draw {
    @Override
    void calculateVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = sc.nextFloat();
        System.out.println("Enter height:");
        float h = sc.nextFloat();
        float volume = (float)(3.14 * r * r * h);
        System.out.println("Volume = " + volume);
    }

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = sc.nextFloat();
        System.out.println("Enter height:");
        float h = sc.nextFloat();
        float area = (float)(2 * 3.14 * r * (r + h));
        System.out.println("Surface Area = " + area);
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = sc.nextFloat();
        float perimeter = (float)(2 * 3.14 * r);
        System.out.println("Base Circumference (Perimeter) = " + perimeter);
    }
}

class ImplementDraw {
    public static void main(String[] args) {
        Cube cube = new Cube();
        Cuboid cuboid = new Cuboid();
        Cylinder cylinder = new Cylinder();

        System.out.println("Cube:");
        cube.calculateVolume();
        cube.calculateArea();
        cube.calculatePerimeter();

        System.out.println("\nCuboid:");
        cuboid.calculateVolume();
        cuboid.calculateArea();
        cuboid.calculatePerimeter();

        System.out.println("\nCylinder:");
        cylinder.calculateVolume();
        cylinder.calculateArea();
        cylinder.calculatePerimeter();
    }
}
