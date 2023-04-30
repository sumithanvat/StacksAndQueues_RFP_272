package StackAndQueue;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<Integer>();
    }

    // Enqueue operation (append)
    public void enqueue(int value) {
        queue.add(value);
    }

    // Dequeue operation (remove from the beginning)
    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return queue.removeFirst();
        }
    }

    // Display the queue
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int value : queue) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
