package Loops;
import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int input = sc.nextInt();
        int i = 1;
        while (i <= input) {
            System.out.println(i);
            i++;
        } 
    }
}
