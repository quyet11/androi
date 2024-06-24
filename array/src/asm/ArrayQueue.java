package asm;

public class ArrayQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the queue
    public ArrayQueue(int size) {
        capacity = size;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return rear == -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        queueArray[++rear] = item;
    }

    // Method to remove an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Or throw an exception
        }
        int item = queueArray[front++];
        if (front > rear) { // Reset front and rear when queue becomes empty
            front = 0;
            rear = -1;
        }
        return item;
    }

    // Method to get the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Or throw an exception
        }
        return queueArray[front];
    }
}
