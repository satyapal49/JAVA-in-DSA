import java.util.Scanner;


// This program checks if a person is eligible to vote based on their age using an if-else statement.
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }if (age > 13 && age < 18) {
            System.out.println("You are a teenager and not eligible to vote.");
        } 
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
