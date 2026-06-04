import java.util.Scanner;

// A program to calculate the area of a circle given its radius

public class areaOfCircle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float r = input.nextFloat();
            float area = 3.14f * r *r ;
            System.out.print(area);
        }
    }
    
}
