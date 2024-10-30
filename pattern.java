import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        // STAR Pattern
        /*
        for (int i = 1; i <= 5; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        // Inverse STAR Pattern
        /*
        for (int i = 1; i <= 5; i++) {
            for (int star = 1; star <= 5 - i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        // Half-Pyramid Pattern with Numbers
        /*
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        */

        // Character Pyramid Pattern
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
