
public class TypeCasting {
    public static void main(String[] args) {
        float a = 10.52f;
        int b = (int) a; // Explicit type conversion (float to int)
        System.out.println("Value of b: " + b); // Output will be 10, as the decimal part is truncated during the cast
    }
}