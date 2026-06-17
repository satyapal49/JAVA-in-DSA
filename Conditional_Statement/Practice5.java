import java.util.Scanner;

public class Practice5 {
    public static void main (String[] args) {
        // This program checks whether a given year is a leap year or not using the ternary operator.
        System.out.println("Check Whether a Year is a Leap Year or Not:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String result =  (year %4 == 0 && year % 100 != 0 || year % 400 == 0) ? "Leap Year" : "Not Leap Year";
        System.out.println("The year " + year + " is " + result);
    }
}
