package Loops;

public class continueStatement {
    public static void main(String[] args) {
        // A simple program to demonstrate the use of continue statement in a for loop
        for (int i = 1; i <= 10; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println("Hello World : " + i);
        }
    }
}
