package StackQueue;


public class CustomStack {
    int[] myStack;
    int top;
    int capacity;
    public CustomStack(int size){
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
}

class UsingStack2{
    public static void main(String[] args) {
        CustomStack Stack2=new CustomStack(4);
        Stack2.push(1);
        Stack2.push(2);
        System.out.println(Stack2.pop());
        System.out.println(Stack2.pop());
        System.out.println(Stack2.peek());
        System.out.println(Stack2.isEmpty());
        System.out.println(Stack2.isFull());
    }
}
