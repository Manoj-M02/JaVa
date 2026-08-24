//Reverse A Atring
import java.util.*;
public class RAS {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);
        System.out.print("Enter the String  : ");
        String str = jo.nextLine() , rev = "";
        for (int i=str.length()-1; i>=0 ; i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reverse String is :"+rev);
        jo.close(); 
    }
}
