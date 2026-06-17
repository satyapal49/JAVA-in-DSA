package Operator;

public class UnaryOperators {
    public static void main(String[] args) {
        // Unary operators perform operations on a single operand. Here we will demonstrate the use of basic unary operators.
        int a = 5;  // Declare and initialize variable a
        int b = ++a;  // Pre-increment: increments a by 1 and then assigns the new value to b
       
        System.out.println(b);

        int c = 10;
        int d = c++;  // Post-increment: assigns the current value of c to d and then increments c by 1
        System.out.println(c);
        System.out.println(d);
    }
}
