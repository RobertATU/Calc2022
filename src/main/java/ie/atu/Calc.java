package ie.atu;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        delete();
    }

    public static void delete() {
        System.out.println("Enter first value:");
        Scanner inputs = new Scanner(System.in);
        int firstVal = inputs.nextInt();

        System.out.println("Enter second value:");
        int secondVal = inputs.nextInt();

        int result = firstVal - secondVal;
        System.out.println("The result of " + firstVal + " - " + secondVal + " is " + result);

    }
}
