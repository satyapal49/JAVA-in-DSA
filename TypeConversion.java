public class TypeConversion {
    public static void main (String[] args) {
        // int a = 10;
        // float b = a; // Implicit type conversion (int to float)
        // System.out.println("Value of b: " + b);

        int c = 155;
        byte d = (byte) c; // Explicit type conversion (int to byte)
        System.out.println("Value of d: " + d);
    }
}