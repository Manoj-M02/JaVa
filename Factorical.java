import java.util.*;
public class Factorical {
    public static void main  (String[] args){
        Scanner fac = new Scanner(System.in);
        System.out.print("Enter Factorical Value :");
        int i, fact= 1, n = fac.nextInt();
        for (i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.printf("The Factorical of %d is : %d \n",n,fact);
        fac.close();
    }
}
