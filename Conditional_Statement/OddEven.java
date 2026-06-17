import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
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
