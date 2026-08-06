//Writre  a Program to input 2 floating point numbers & print their average.
import java.util.Scanner;
public class twofloandavg {
    public static void main(String[] args) {
        Scanner avg = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = avg.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = avg.nextDouble();
        double sum = num1 + num2;
        double average = sum / 2;
        
        System.out.printf("First number: %.2f\nSecond number: %.2f\nSum: %.2f\nAverage: %.2f", num1, num2, sum, average);
        
        avg.close();
    }
    
} 
