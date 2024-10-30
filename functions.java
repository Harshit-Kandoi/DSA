import java.util.Scanner;

public class functions {

    // Print "Hello World"
    public static void printHello() {
        System.out.println("Hello World");
    }

    // Calculate and print sum of two numbers
    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    // Swap two numbers and display results
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // Multiply two numbers and return the product
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Calculate factorial of a number
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // Calculate binomial coefficient (n choose r)
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        return fact_n / (fact_r * fact_nmr);
    }

    // Overloaded methods to calculate sum of 2 or 3 numbers, or 2 floats
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    // Optimized method to check if a number is prime (for n >= 2)
    public static boolean isPrime(int n) {
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Print all prime numbers up to a given limit
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Convert binary number to decimal
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {    
            int lastDigit = binNum % 10;
            decNum += lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    // Convert decimal number to binary
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum += rem * (int) Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        // Example function calls (uncomment as needed)

        // printHello();
        // calculateSum(5, 10);

        // Swapping demonstration
        // int a = 5;
        // int b = 10;
        // swap(a, b); // Note: This will not change the values of a and b in main

        // Product of a and b
        // System.out.println("Product: " + multiply(3, 5));

        // Factorial
        // System.out.println("Factorial of 6: " + factorial(6));

        // Binomial coefficient
        // System.out.println("Binomial Coefficient (5, 2): " + binCoeff(5, 2));

        // Function overloading examples
        // System.out.println(sum(5, 3));
        // System.out.println(sum(2, 5, 3));
        // System.out.println(sum(5.0f, 3.0f));

        // Prime check and prime numbers in range
        // System.out.println("Is 3 prime? " + isPrime(3));
        // primeInRange(20);

        // Binary to Decimal
        // binToDec(1010);

        // Decimal to Binary
        decToBin(10);
    }
}
