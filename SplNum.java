import java.util.*;
public class SplNum {
    public static void main (String[] args){
        Scanner pc = new Scanner(System.in);
        System.out.print("Enter the Starting Number :");
        int start = pc.nextInt();
        System.out.print("Enter the Ending Number :");
        int end = pc.nextInt();
        for (int i=start ;i<=end ; i++){
            int dig1,dig2,sum,product,result;
            dig1 = i%10;
            dig2 = i/10;
            sum = dig1 + dig2;
            product = dig1 * dig2;
            result = sum + product;
            if (result == i){
                System.out.println("The Number "+i+" is Special Number");
            }
        }
        pc.close();
    }
}
