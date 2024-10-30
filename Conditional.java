import java.util.*;

public class Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        /*
        // If-Else Condition
        int age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age > 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not adult");
        }
        */
        
        /*
        // Print the largest of 2 numbers
        int a = 1;
        int b = 2;

        if (a >= b) {
            System.out.println("A is the largest of 2");
        } else {
            System.out.println("B is the largest of 2");
        }
        */

        /*
        // Check if a number is ODD or EVEN
        int prog = sc.nextInt();
        System.out.println("Given number is = " + prog);
        if (prog % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        */

        /*
        // Else-If Statement
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Child");
        } else if (age > 18 && age < 55) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }
        */

        /*
        // Income Tax Calculator
        int income = sc.nextInt();
        int tax = 0;
        if (income <= 500000) {
            System.out.println("No tax");
        } else if (income > 500000 && income <= 1000000) {
            System.out.println("20% tax applicable");
            tax = (int) (income * 0.2);
        } else {
            System.out.println("30% tax applicable");
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is = " + tax);
        */

        /*
        // Print the largest of 3 numbers
        int a = 1;
        int b = 2;
        int c = 3;
        if (a >= b && a >= c) {
            System.out.println("A is the largest of 3");
        } else if (b >= a && b >= c) {
            System.out.println("B is the largest of 3");
        } else {
            System.out.println("C is the largest of 3");
        }
        */

        /*
        // Ternary Operator
        // variable = Condition ? Statement1 : Statement2;
        // Example: boolean larger = (5 > 3) ? 5 : 3;
        // String type = (5 % 2 == 0) ? "Even" : "Odd";
        int number = 4;
        String type = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);
        */

        /*
        // Check if a student will pass or fail
        int marks = 67;
        String reportCard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(reportCard);
        */

        /*
        // Switch Statements
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            default: System.out.println("Sunday");
        }
        */

        /*
        // Calculator
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.println("Enter an operator among (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            case '%': System.out.println(a % b); break;
            default: System.out.println("Enter a valid operator");
        }
        */
        
        sc.close(); // Closing the scanner
    }
}
