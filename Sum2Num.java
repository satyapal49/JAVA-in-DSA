import java.util.*;

// A program to calculate the sum of two numbers entered by the user

public class Sum2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum: " + sum);
    }
}
