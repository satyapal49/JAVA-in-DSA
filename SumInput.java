import java.util.*;

public class SumInput {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            float pencil = sc.nextFloat();
            float pen = sc.nextFloat();
            float eraser = sc.nextFloat();

            float total = pencil + pen + eraser ;
            System.out.print("Sum of total = " + total);
        }
    }
}
