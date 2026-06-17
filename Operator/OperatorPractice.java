package Operator;

public class OperatorPractice {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x); // 2 * 5 / 2 = 10 / 2 = 5 EXPLAIN WHY THIS HAPPENS
        // In this expression, the multiplication and division operations are performed
        // from left to right.
        // First, x is multiplied by y, resulting in 10 (2 * 5 = 10).
        // Then, the result (10) is divided by x (which is 2), resulting in 5 (10 / 2 =
        // 5).
        // The order of operations (also known as operator precedence) dictates that
        // multiplication and division
        // are performed before addition and subtraction, and when operators have the
        // same precedence,
        // they are evaluated from left to right. Therefore, the expression is evaluated
        // in the order it appears,
        // leading to the final result of 5.
        int exp2 = (x * (y / x)); // 2 * (5 / 2) = 2 * 2 = 4 EXPLAIN WHY THIS HAPPENS
        // In Java, when you perform integer division (dividing two integers), the
        // result is also an integer.
        // The division operation truncates the decimal part and only keeps the whole
        // number.
        // In the expression (y / x), since both y and x are integers, the result of 5 /
        // 2 is 2, not 2.5.
        // This is because Java performs integer division, which discards the fractional
        // part and returns
        // only the integer portion of the result. Therefore, (y / x) evaluates to 2,
        // and when you multiply it by x (which is 2), you get 4.

        System.out.println(exp1 + " ,");
        System.out.println(exp2);

        int x1 = 200, y1 = 50, z = 100;
        if (x1 > y1 && y1 > z) {
            System.out.println("Hello");

        }
        if (z > y1 && z < x1) {
            System.out.println("Java");
        }
        if ((y1 + 200) < x1 && (y1 + 150) < z) {
            System.out.println("Hello Java");
        }

    }
}
