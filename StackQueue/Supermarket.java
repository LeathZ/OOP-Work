package StackQueue;

import java.util.Scanner;

public class Supermarket {
    int [] queue;
    int capacity;
    int front;
    int rear; 
    public Supermarket(int capacity){
        queue=new int[capacity];
        this.capacity=capacity;
        front=0;
        rear=-1;
    }
    public boolean isEmpty(){
        return front>rear;
    }
    public boolean isFull(){
        return rear==capacity-1;
    }
    public void addCustomer(int value){
        if(isFull()){
            System.out.println("Queue is full.");
        }
        else{
            rear++;
            queue[rear]=value;
            System.out.println("Customer added to queue.");
        }
    }
    public int serveCustomer(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            front=0;
            rear=-1;
            return -999999;
        }
        int value= queue[front];
        front++;
        return value;
    }
    public int queueDisplay(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            front=0;
            rear=-1;
            return -99999;
        }
        return queue[front];
    }
    public int queueCheck(){
         return isEmpty() ? 0 : (rear - front + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket(5); // You can change the size

        int choice;
        do {
            System.out.println("\nSupermarket Queue Management");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Display Number of Customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID to add: ");
                    int customerId = scanner.nextInt();
                    supermarket.addCustomer(customerId);
                    break;
                case 2:
                    supermarket.serveCustomer();
                    break;
                case 3:
                    supermarket.queueDisplay();
                    break;
                case 4:
                    System.out.println("Number of customers in queue: " + supermarket.queueCheck());
                    break;
                case 5:
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}