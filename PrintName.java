import java.util.*;

public class PrintName {
    public static void main (String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.print("Name: " + name);
        }
    }
}

