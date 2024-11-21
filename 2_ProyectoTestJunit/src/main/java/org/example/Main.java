package org.example;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        // Example usage of our methods
        int sum = add(2, 2);
        boolean isPositive = isPositive(5);

        System.out.println("2 + 2 = " + sum);
        System.out.println("Is 5 positive? " + isPositive);
    }
}

