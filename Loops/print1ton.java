package Loops;
import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {
        // A simple program to print numbers from 1 to n using a while loop
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
