import java.util.Scanner;
public class IF {
    public static void main(String[] args) {
        Scanner lo = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = lo.nextInt();
        if(age>=18){
            System.out.printf("Your Age is %d so You'r Adult",age);
        }
        lo.close();
    }
}
