import java.util.*;
public class FSA {
    public static void main(){
        Scanner hey = new Scanner(System.in);
        System.out.println("Enter Today Financial Status of a BANK :");
        double suuuuu = hey.nextDouble();
        if(suuuuu < 0){
            System.out.printf("Today Our Bank is get loss  %.10f",suuuuu);  
            }
            else if (suuuuu == 0){
                System.out.printf("Today Our Bank is get no profit and no loss %.10f",suuuuu); 
            }
        else{
            System.out.printf("Today Our Bank is get profit %.10f",suuuuu);   
            }
        hey.close();
    }
}
