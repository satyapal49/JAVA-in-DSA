package Loops;

import java.util.Scanner;

public class skipMultipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A simple program to print numbers from 1 to n, skipping multiples of 10 using a for loop
        while (true) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("Please enter a number that is not a multiple of 10.");
                continue;
            }
        }
    }
}
