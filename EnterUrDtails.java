import java.util.Scanner;
public class EnterUrDtails
 {
    public static void main(String[] args)
     {
        Scanner snr = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = snr.nextLine();
        System.out.println("Enter your age: ");
        int age = snr.nextInt();
        System.out.println("Enter your city: ");
        String city = snr.next();
        System.out.println("Enter your mobile number: ");
        String mobile = snr.next();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Mobile Number: " + mobile); 
        snr.close();
    }
}
