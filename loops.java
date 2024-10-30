import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
        // While Loop
        int counter = 0;
        int n = sc.nextInt();
        while (counter < n) {
            counter += 1;
            System.out.println(counter);
        }
        */

        /* 
        // Sum of first n natural numbers
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
        */

        /* 
        // For Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        */

        /* 
        // Print a pattern of stars for 4 lines
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }
        */

        /* 
        // Print the reverse of a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        */

        /* 
        // Do-While Loop example
        int counter = 1;
        do {
            System.out.println("Hello, World!");
            counter++;
        } while (counter <= 5);
        */

        /* 
        // Read numbers until a multiple of 10 is entered (using break)
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("Entered number: " + n);
        } while (true);
        */

        /* 
        // Display numbers except multiples of 10 (using continue)
        do {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was: " + n);
        } while (true);
        */

        /* 
        // Check if a number is prime
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        */

        sc.close(); // Close the scanner after usage
    }
}
