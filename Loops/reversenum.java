package Loops;

public class reversenum {
    public static void main(String[] args) {
        // A simple program to reverse a number using a while loop
        int num = 58946;
        int lastDigit;
        while (num > 0) {
            lastDigit  = num % 10;
            System.out.print(lastDigit);
            num /=10;
        }
    }
}
