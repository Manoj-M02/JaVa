import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        for (int i=1; i<=num1; i++) {
            int result = i * num2;
            System.out.printf("The multiplication of %d and  %d is: %d \n" ,i,num2,result);
        }
        
        scanner.close();
    }
}