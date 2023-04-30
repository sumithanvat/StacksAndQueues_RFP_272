package StackAndQueue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        // Enqueue values
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Display the queue
        queue.display();

        // Dequeue values until the queue is empty
        while (!queue.queue.isEmpty()) {
            System.out.println("Dequeued " + queue.dequeue());
        }

        // Display the queue again (should be empty)
        queue.display();
    }
}