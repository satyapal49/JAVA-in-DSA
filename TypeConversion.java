import java.util.*;

public class TypeConversion {
    public static void main (String[] args) {
        // int a = 10;
        // float b = a; // Implicit type conversion (int to float)
        // System.out.println("Value of b: " + b);

         // Read an integer from the user and store it in a float variable (implicit type conversion)
        try(Scanner sc = new Scanner(System.in)) {  
            System.out.print("Enter an integer: "); 
            float a = sc.nextInt(); 
            System.out.println("Value of a: " + a); 
        }

        // int c = 155;
        // byte d = c; // Explicit type conversion (int to byte) - This will cause a compile-time error due to potential data loss
        // System.out.println("Value of d: " + d);
    }
}