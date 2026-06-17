import java.util.*;

// A program to calculate the sum of two numbers entered by the user

public class Sum2Num {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int a = input.nextInt();
            int b = input.nextInt();

            int sum = a + b;
            System.out.print("Sum: " + sum);
        }
    }
}
