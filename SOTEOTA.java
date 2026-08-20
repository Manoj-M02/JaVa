//Sum of the Elements of the Array
import java.util.*;
public class SOTEOTA{
    static int ArraySum(int[] num){
        int sum = 0 ;
        for (int i=0;i<num.length;i++){
                sum=sum+num[i];
        }
        return sum;
            }
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = sr.nextInt();
        int num[]= new int [size];
        System.out.println("Enter the Numbers : ");
        for (int i =0; i<size; i++){
            num[i] = sr.nextInt(); 
        }
        //Call the method
        int res = ArraySum(num);
        System.out.println("Sum : "+res);
        sr.close();

    }
}