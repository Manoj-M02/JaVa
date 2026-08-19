//Second Largest Element in Arry
import java.util.*;
public class SLEIA{
    static int findSecondLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if (nums[i]>secondLargest && nums[i]<largest){
                largest = nums[i];
            }
        }
        if 
    }
    public static void main(String[] args){

    }
}