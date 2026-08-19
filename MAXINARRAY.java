import java.util.*;
public class MAXINARRAY{
    public static int max(int[] mark){
        int max = mark[0];
        for(int i=1;i<mark.length;i++){
            if(mark[i]>max){
                max = mark[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner dr =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = dr.nextInt();
        System.out.println("Enter the Student Marks:");
        int[] marks = new int[size];
        for (int i=0;i<size;i++){
            marks[i] = dr.nextInt();
        }
        System.out.println("The maximum mark is: " + max(marks));
        dr.close();
    }
}