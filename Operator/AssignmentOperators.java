package Operator;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10; // Simple assignment
        System.out.println("Value of a: " + a);

        a += 5; // Addition assignment (a = a + 5)
        System.out.println("After addition assignment (a += 5): " + a);

        a -= 3; // Subtraction assignment (a = a - 3)
        System.out.println("After subtraction assignment (a -= 3): " + a);

        a *= 2; // Multiplication assignment (a = a * 2)
        System.out.println("After multiplication assignment (a *= 2): " + a);

        a /= 4; // Division assignment (a = a / 4)
        System.out.println("After division assignment (a /= 4): " + a);

        a %= 3; // Modulus assignment (a = a % 3)
        System.out.println("After modulus assignment (a %= 3): " + a);
    }
}
// Output:
// Value of a: 10
// After addition assignment (a += 5): 15
// After subtraction assignment (a -= 3): 12
// After multiplication assignment (a *= 2): 24
// After division assignment (a /= 4): 6
// After modulus assignment (a %= 3): 0
