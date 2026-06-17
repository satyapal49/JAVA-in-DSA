import java.util.Scanner;

// This program checks if a person is an adult, teenager, or child based on their age using an if-else-if statement.
public class ElseIf {
    public static void main(String[] args) {
        System.out.print("Enter age :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input >= 18){
            System.out.println("You are adult");
        } else if (input < 18 && input >= 13 ){
            System.out.println("You are Teenager");
        } else {
            System.out.println("You are Child");
        }
    }
}
