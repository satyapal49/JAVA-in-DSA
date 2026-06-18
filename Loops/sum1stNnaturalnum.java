package Loops;
import java.util.Scanner;


public class sum1stNnaturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
