package Absctraction;

abstract class Bird{
    void fly(){
        System.out.println("Bird flies");
    }
}

class Eagle extends Bird{
    @Override
    void fly() {
        System.out.println("Eagle flies");
    }
}

class Penguin extends Bird{
    @Override
    void fly() {
        System.out.println("Penguin cant fly.");
    }
}

class Implement{
    public static void main(String[] args) {
        Eagle E1=new Eagle();
        Penguin P1=new Penguin();
        E1.fly();
        P1.fly();
    }
}