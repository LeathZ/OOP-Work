class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Car details: Brand - Toyota, Model - Camry, Year - 2023");
    }
}

public class Qn1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.display();
    }
}
