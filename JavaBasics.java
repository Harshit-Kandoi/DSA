import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        
        System.out.println((int)(b)); // Prints ASCII value of 'b'
        System.out.println((int)(a)); // Prints ASCII value of 'a'
        System.out.println(b - a);    // Difference between ASCII values of 'b' and 'a'
        System.out.println(b);
        
        /*
        * Type Conversion Examples
        * int marks = (int)(99.99f);
        * System.out.println(marks);
        * char ch = 'a';
        * int number = ch;
        * System.out.println(number);
        */

        // Scanner Examples (commented out)
        // Scanner sc = new Scanner(System.in);
        /*
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        * int sum = a + b;
        * int product = a * b;
        * System.out.println(product);
        * System.out.println(sum);
        */

        /*
        * Area of Circle
        * float rad = sc.nextFloat();
        * float area = 3.14f * rad * rad;
        * System.out.println(area);
        */

        // String input = sc.nextLine(); // Reads entire line
        // String input = sc.next();     // Reads a single word
        // System.out.println(input);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        /*
         * Other Scanner Methods
         * nextByte, nextDouble, nextBoolean, nextShort, nextLong
         */

        // Basic Addition Example
        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);

        /*
        * Variable Types
        * byte b = 8;
        * System.out.println(b);
        * char ch = 'a';
        * System.out.println(ch);
        * boolean var = false;
        * float price = 10.5f;
        * int number = 25;
        * long, double, short
        */

        // Re-assigning Variable Example
        // int a = 10;
        // int b = 5;
        // System.out.println(a);
        // System.out.println(b);
        // a = b;
        // System.out.println(a);

        // String and Print Statements
        // String name = "Harshit Kandoi";
        // System.out.println(name);
        // System.out.println("Hello World!");
        // System.out.print("Hello World!\n");
    }
}

/*
 * Boilerplate Code
 *
 * Type Conversion/Widening Conversion/Implicit Conversion
 * Converts one data type to another without explicit cast.
 * byte -> short -> int -> float -> long -> double
 *
 * Type Casting/Narrowing Conversion
 * Loses data precision in some cases; requires explicit casting.
 * Example: int marks = (int)(99.99f);
 */

/*
 * Type Promotion in Expressions
 * 1. Java promotes each byte, short, or char operand to int in expressions.
 * 2. If an operand is long, float, or double, the entire expression is promoted to that type.
 *
 * Example:
 * // Incorrect
 * byte b = 5;
 * b = b * 2;
 *
 * // Correct
 * byte b = 5;
 * b = (byte)(b * 2);
 */
