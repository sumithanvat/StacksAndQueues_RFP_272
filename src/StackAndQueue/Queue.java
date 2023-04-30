package StackAndQueue;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {


    // Create an empty LinkedList
    LinkedList<Integer> queue = new LinkedList<>();

    // Enqueue elements 56, 30, and 70
        queue.add(56);
        queue.add(30);
        queue.add(70);

    // Print the queue
        System.out.println("Queue: " + queue);
}
}
