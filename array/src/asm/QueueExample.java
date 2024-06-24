package asm;

public class QueueExample {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        // Enqueue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue operation
        int removedElement = queue.dequeue();
        System.out.println("Removed Element: " + removedElement);

        // Peek operation
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Enqueue more elements
        queue.enqueue(40);
        queue.enqueue(50);

        // Dequeue remaining elements
        while (!queue.isEmpty()) {
            int element = queue.dequeue();
            System.out.println("Removed Element: " + element);
        }
    }
}
