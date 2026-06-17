package Operator;

// This program demonstrates the use of the ternary operator to compare
// two numbers and determine which one is larger.
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 56;
        int b = 51;
        String Output = (a >= b)?"A is Largest":"B is largest";
        System.out.println(Output);
    }
}
