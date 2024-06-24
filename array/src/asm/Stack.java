package asm;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (top == maxSize - 1) { // Check if the stack is full
            System.out.println("Stack is full"); // Handle stack overflow
        } else {
            stackArray[++top] = value; // Increment top and add the element
        }
    }
    public int pop() {
        if (top == -1) { // Check if the stack is empty
            System.out.println("Stack is empty"); // Handle stack underflow
            return -1; // Return a sentinel value or throw an exception
        } else {
            return stackArray[top--]; // Return the top element and decrement top
        }
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }


}
