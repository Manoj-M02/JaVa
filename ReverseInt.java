import java.util.*;
public class ReverseInt {
    public static void main(String[] args){
        Scanner re = new Scanner(System.in);
        System.out.print("Enter 2 to 5 Digit Integer valu :");
        int rev=0, rem ,num = re.nextInt();
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.printf("The Reverse value is %d",rev);
        re.close();
    }   
}
