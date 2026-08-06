//Write a Program to input 2 numbers & print their sum.
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sm.nextInt();
        System.out.print("Enter the second number: ");
        int b = sm.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        sm.close();
    }
}
