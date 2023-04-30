package StackAndQueue;

public class Main {
    public static void main(String[] args) {


        // Create a new Stack object
        Stack myStack = new Stack();
        // Push the elements 56, 30, and 70 onto the stack in that order
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        System.out.println("Stack elements:");
        myStack.display();

        // Pop elements from the stack until it is empty
        System.out.println("Popping elements from the stack:");
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
