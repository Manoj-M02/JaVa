import java.util.*;
// Reverse the number With Return Type and With Argument
public class RNWRWA {
    public int ReverseNumber(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = re.nextInt();
        RNWRWA obj = new RNWRWA();
        int result = obj.ReverseNumber(num);
        System.out.println("Reverse of the number: " + result);
        re.close();
    }
}