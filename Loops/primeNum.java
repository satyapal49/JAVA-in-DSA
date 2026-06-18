package Loops;
import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        // A simple program to check if a number is prime or not using a for loop
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        // i <= num-1 or i <= Math.sqrt(num) can be used to check for prime numbers
        for ( int i = 2; i <= Math.sqrt(num); i++){ 
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
