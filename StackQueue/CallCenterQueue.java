package StackQueue;

import java.util.Scanner;

public class CallCenterQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public CallCenterQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void addCall(int callId) {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            queue[++rear] = callId;
            System.out.println("Call ID added to the queue.");
        }
    }

    public void serveCall() {
        if (isEmpty()) {
            System.out.println("No pending calls to serve.");
            front = 0;
            rear = -1;
        } else {
            int callId = queue[front++];
            System.out.println("Serving call ID: " + callId);
        }
    }

    public int displayQueue() {
        if(isEmpty()){
            System.out.println("Queue is empty.");
            front=0;
            rear=-1;
            return -99999;
        }
        return queue[front];
    }

    public int pendingCalls() {
        return isEmpty() ? 0 : (rear - front + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CallCenterQueue callQueue = new CallCenterQueue(5); // capacity of 5 calls
        int choice;

        do {
            System.out.println("\nCall Center Queue System:");
            System.out.println("1. Add Incoming Call");
            System.out.println("2. Serve Next Call");
            System.out.println("3. Display Current Call Queue");
            System.out.println("4. Display Number of Pending Calls");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Call ID to add: ");
                    int callId = scanner.nextInt();
                    callQueue.addCall(callId);
                    break;
                case 2:
                    callQueue.serveCall();
                    break;
                case 3:
                    callQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Pending calls: " + callQueue.pendingCalls());
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

