package asm;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Initialize an array of size 5
        arr[0] = 1; // Inserting element 1 at index 0
        arr[1] = 2; // Inserting element 2 at index 1
        arr[2] = 3; // Inserting element 3 at index 2

        // Printing the array elements
        System.out.println("Array elements after insertion:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
