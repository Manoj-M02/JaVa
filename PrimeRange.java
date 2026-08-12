import java.util.*;
public class PrimeRange {
    public static void main (String[] args){
        Scanner pr = new Scanner(System.in);
        int start = 2;
        System.out.println("Enter the Starting Numbe:"+start );
        System.out.print("Enter the Ending Number :");
        int end = pr.nextInt() , j;
        boolean isPrime = true ;
        for (j=start ; j<=end ; j++){
            isPrime = true ;
            for (int i=2; i<=j-1 ; i++){
                if (j % i == 0){
                    isPrime =  false;
                }
            }
            if (isPrime==true){
                System.out.println("The Number "+j+" is Prime Number");
            }
        }
        pr.close();
    }
}
