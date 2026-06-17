package Operator;

public class LogicalOperators {
    public static void main(String[] args) {
        int a =5;
        int b =10;
        // Logical equal (==)
        System.out.println("Logical equal (==): " + (a == b)); // false
        // Logical not equal (!=)
        System.out.println("Logical not equal (!=): " + (a != b)); // true

        // Logical AND (&&)
        System.out.println("Logical AND (&&): " + (a > 0 && b > 0)); // true
        System.out.println("Logical AND (&&): " + (a < 0 && b > 0)); // false
        // Logical OR (||)
        System.out.println("Logical OR (||): " + (a > 0 || b < 0)); // true
        System.out.println("Logical OR (||): " + (a < 0 || b < 0)); // false

        // Logical NOT (!)
        System.out.println("Logical NOT (!): " +!(a > 0)); // false
    }
}
