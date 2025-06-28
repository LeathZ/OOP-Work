package StackQueue;

public class Stack {
    int[] myStack;
    int top;
    int capacity;
    public Stack(int size){
        myStack= new int[size];
        capacity=size;
        top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public void push(int value){
        if (isFull()){
            System.out.println("Stack Overflow");
        } else{
            top++;
            myStack[top]=value;
            System.out.println(value+"pushed to stack");
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        }
        else{
            int value= myStack[top];
            top--;
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        }
        else{
            int value=myStack[top];
            return value;
        }
    }
    public int size(){
        return top+1;
    }
}

class UsingStack{
    public static void main(String[] args) {
        Stack Stack1=new Stack(4);
        Stack1.push(1);
        Stack1.push(2);
        System.out.println(Stack1.pop());
        System.out.println(Stack1.pop());
        System.out.println(Stack1.peek());
        System.out.println(Stack1.isEmpty());
        System.out.println(Stack1.size());
    }
}