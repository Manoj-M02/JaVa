import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner jee = new Scanner(System.in);
        System.out.println("Enter Any Integer Value:");
        int val = jee.nextInt();
        if(val%2 == 0){
            System.out.printf("The Integer %d is a Even" , val);
        }
        else{
            System.out.printf("The Inter %d is a Odd", val);
        }
        jee.close();
    }
}
