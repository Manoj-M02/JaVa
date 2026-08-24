//Remove Space From String
import java.util.*;
public class RSFS{
    public static void main(String[] args){
        String str = "How are You ?";
        System.out.println("Before Removing Space : " +str);
        //Approch -1 -Using replace
        String strReplace = str.replace(" ","");
        System.out.println("After Removing Space : " +strReplace);

        //Approch -2 Usin For Loop
        Scanner hlo = new Scanner(System.in);
        System.out.print("Enter the Multiple string : ");
        String str1 = hlo.nextLine();
        String newString = "";
        for (int i=0 ; i  < str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch !=' '){
                newString = newString +ch;
            }
        }
        System.out.println("After Removing Space : " +newString);
        hlo.close();
    }
}