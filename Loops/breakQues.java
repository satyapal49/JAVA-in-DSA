package Loops;
import java.util.Scanner;

public class breakQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // A simple program to demonstrate the use of break statement in a while loop
        while(true) {   
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if (num % 10 == 0){
                break;
            }
            System.out.println(num);
        }
        System.out.println("End of the program");
        sc.close();
    }
}
