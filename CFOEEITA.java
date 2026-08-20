//Count Frequency of Each Elements in the Array
import java.util.*;
public class CFOEEITA {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        System.out.print("Enter the Size of Array :" );
        int size = cr.nextInt();
        System.out.println("Enter the value of Array : ");
        int nums[] = new int [size];
        for (int k=0;k<size;k++){
            nums[k] = cr.nextInt();
            cr.close();
        boolean visited[] = new boolean[nums.length];
        int len = nums.length;
        for (int i=0;i < len ; i++){
            if(visited[i] == false){
                int count = 1;
                visited [i] = true ; 
                for (int j=i+1;j<len;j++){
                    if (nums[i]==nums[j]){
                        count ++;
                        visited[j] = true ; 
                    }
                }
                System.out.println(nums[i]+"---->"+count);
        }
    }
  }
  }
}
