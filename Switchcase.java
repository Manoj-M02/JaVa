import java.util.*;
public class Switchcase {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        System.out.println("Enter 1st Value :");
        float a = lee.nextFloat();
        System.out.println("Enter Your Operator :");
        char op = lee.next().charAt(0);
        System.out.println("Enter Your 2nd Value :");
        float b =lee.nextFloat();
        switch (op) {
            case '+':
                System.out.printf("The Addition of value %.2f and %.2f is %.2f :",a ,b ,(a+b) );
                break;
            case '-':
                System.out.printf("The Subtaraction of value %.2f and %.2f is %.2f:",a ,b ,(a-b) );
                break;
            case '*':
                System.out.printf("The Multiplication of value %.2f and %.2f is %.2f :",a ,b ,(a*b) );
                break;
            case '/':
                System.out.printf("The Division of value %.2f and %.2f is %.2f :",a ,b ,(a/b) );
                break;
            default:
                System.out.printf("Your Operator is Invalid %c",op);
                break;
        }
        lee.close();
    }
}
