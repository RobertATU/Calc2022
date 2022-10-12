package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Multiply();
    }
    public static void Multiply(){


        System.out.println("PLease enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int A = inputs.nextInt();

        System.out.println("PLease enter your second number: ");
        int B = inputs.nextInt();


        int result = A * B;
        System.out.println("The total is  " + result);
    }
}
