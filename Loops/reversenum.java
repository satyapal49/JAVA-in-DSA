package Loops;

public class reversenum {
    public static void main(String[] args) {
        int num = 58946;
        int lastDigit;
        while (num > 0) {
            lastDigit  = num % 10;
            System.out.print(lastDigit);
            num /=10;
        }
    }
}
