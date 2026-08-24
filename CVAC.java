//Count Vowels and Consonants
import java.util.*;
public class CVAC {
    public static void main(String[] args) {
        Scanner ko = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = ko.nextLine();
        int vowels = 0 , consonants = 0;
        for (int i =0 ; i<str.length();i++){
            char ch =str.charAt(i);
            //Approch -1
            /*
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }*/
            //Approch -2
            String vowel = "aeiou";
            if(vowel.contains(ch+"")){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Vowels : " +vowels +  "Consonants : " + consonants);
        ko.close();
    }
}
