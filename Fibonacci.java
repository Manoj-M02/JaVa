import java.util.*;
public class Fibonacci {
    public static void main (String[] args){
        Scanner fb = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = fb.nextInt() , a=0 , b=1 , c;
        System.out.print("The Fibonacci Series is :");
        System.out.print(a+" "+b+" ");
        for (int i=2 ; i<num ; i++){
            c = a + b ;
            System.out.print(c+" ");
            a = b ;
            b = c ;
        }
        fb.close();
    }
}
