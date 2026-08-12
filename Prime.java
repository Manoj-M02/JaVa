import java.util.*;
public class Prime {
    public static void main (String[] args){
        Scanner pr = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = pr.nextInt() , i;
        boolean isPrime = true ;
        for (i=2; i<=num-1 ; i++){
            if (num % i == 0){
                isPrime =  false;
            }
        }
        if (isPrime==true){
            System.out.println("The Number "+num+" is Prime Number");
        }else{
            System.out.println("The Number "+num+" is Not Prime Number");
        }
        pr.close();
    }
}
