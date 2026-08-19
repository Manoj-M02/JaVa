import java.util.*;
public class MININARRY {
    public static int min(int[] age){
        int min = age[0];
        for (int i=1; i<age.length;i++){
            if(age[i]<min){
                min = age[i];
            }
        }
        return min;
    }
    public static void main(String[] aegs){
        Scanner fr = new Scanner(System.in);
        System.out.print("Enter the Size of arry for Student name:");
        int SizeS = fr.nextInt();
        System.out.print("Enter the size of array for Student age:");
        int Size = fr.nextInt();
        String names = new String [SizeS];
        int ages = new int[Size];
        System.out.println("Enter the Names with ages:");
        for(int j=1;j<Size && j<SizeS ; j++){
            SizeS[i] = fr.next();
        }
        for (int i=0;i<Size;i++){
        }
        System.out.println("Your Age is minimum age  in the group  :"+min(ages));
        fr.close();
    }
}
