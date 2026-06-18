package Loops;

public class breakStatement {
    public static void main (String[] args){
        // A simple program to demonstrate the use of break statement in a for loop
        for(int i = 1; i<= 10; i++){
            if(i==5){
                break;
            }
            System.out.println("Hello World "+ i);
        }
        System.out.println("I am out of the loop");
    }
}
