public class Largest3 {
// This program finds the largest of three numbers using if-else statements.
    public static void main(String[] args) {
        int a = 6, b = 9, c = 5;
        int largest;
        if((a>=b) && (a>=c)){
            largest = a;
        } else if (b>c){
            largest = b;
        } else {
            largest = c;
        }
        System.out.println(largest);
    }
}
