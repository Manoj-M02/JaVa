import java.util.*;
public class GOTN {
    public static void main(String[] args){
        Scanner dk = new Scanner(System.in);
        System.out.println("Enter 1st Value :");
        float n1 = dk.nextFloat();
        System.out.println("Enter 2nd Value :");
        float n2 = dk.nextFloat();
        System.out.println("Enter 3rd Value :");
        float n3 = dk.nextFloat();
        if(n1 > n2 && n1 > n3 ){
            System.out.printf("The Gratest Number is %.2f", n1);
        }
        else if (n2 > n1 && n2 > n3){
            System.out.printf("The Gratest Number is %.2f", n2);
        }
        else{
            System.out.printf("The Gratest Number is %.2f", n3);
        }
        dk.close();
    }
}
