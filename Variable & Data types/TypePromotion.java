public class TypePromotion {
    public static void main(String[] args) {
        byte a = 'a';
        byte b = 'b';
        int c = a + b; // The byte values of 'a' and 'b' are promoted to int before addition
        System.out.println(c); // Output will be 195, as the ASCII value of 'a' is 97 and 'b' is 98, so 97 + 98 = 195

        System.out.println(a-b);  // Output will be 0, as both a and b are promoted to int before subtraction
    }
}
