package StackAndQueue;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack = new LinkedList<>();
    // Method to push a new element onto the stack
    public void push(int value) {
        stack.add(value); // Add the new element to the end of the LinkedList
    }
    // Display the stack
    public void display() {
        System.out.println("Stack: " + stack);
    }


}

