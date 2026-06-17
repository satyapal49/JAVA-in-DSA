import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // This program checks if a number is odd or even using an if-else statement.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input = sc.nextInt();
        if(input %2 == 0) {
            System.out.println(input + ": is Even number ");
        } else {
             System.out.println(input + ": is Odd number ");
        }

    }
}
