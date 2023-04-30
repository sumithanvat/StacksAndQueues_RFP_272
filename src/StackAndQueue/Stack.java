package StackAndQueue;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> linkedList;

    public Stack() {
        linkedList = new LinkedList<Integer>();
    }

    // Method to push an element onto the top of the stack
    public void push(int value) {
        linkedList.add(value);
    }

    // Method to remove and return the element on top of the stack
    public int pop() {
        return linkedList.removeLast();
    }

    // Method to return the element on top of the stack without removing it
    public int peek() {
        return linkedList.getLast();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // Method to display the stack
    public void display() {
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
    }
}

