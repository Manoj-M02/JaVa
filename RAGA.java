//Riverse A Givven Array
import java.util.*;
public class RAGA {
    public static void reverse(int[] nums){
        int l=0, r=nums.length-1;
        while(l<r){
        int temp = nums[l];
        nums[l] = nums [r];
        nums[r] = temp ;
        l++ ;
        r-- ;
        }
    }
        public static void main(String[] args){
        Scanner rr = new Scanner (System.in);
        System.out.print("Enter the size of Array : ");
        int size = rr.nextInt();
        int nums []= new int[size];
        System.out.print("Enter the Value of Array :");
        for(int i=0;i<size;i++){
            nums[i] = rr.nextInt();
        }
         reverse(nums);
        System.out.print("The reverse value of Array  :");
        for(int j=0;j<size;j++){
            System.out.print(nums[j]+" ");
        }
        rr.close();
    }
}
