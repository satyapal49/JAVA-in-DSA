package Loops;

public class reversegivennum {
    public static void main(String[] args) {
        // A simple program to reverse a given number using a while loop
        int orignal = 4589;
        int revnum = 0;
        while (orignal > 0) {
            int last = orignal % 10;
            revnum = (revnum * 10) + last;
            orignal /=10;
        }
        System.out.println(revnum);
    }
}
