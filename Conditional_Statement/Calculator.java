import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // This program implements a simple calculator that performs basic arithmetic operations
        // (+, -, *, /, %) based on user input using a switch statement.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.println("enter  + - / % * any ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter 2nd num: ");
        int b = sc.nextInt();
        switch (operator) {
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '%': System.out.println(a%b);
                break;
    
        }
    }
}
