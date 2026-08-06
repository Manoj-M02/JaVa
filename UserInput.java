import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = SN.nextLine();    
        System.out.println("Enter Your Registration Number: ");
        long regNumber = SN.nextLong();
        System.out.println("Enter Your Departdddment: ");
        String department = SN.next();
        System.out.println("Enter Your CGPA: ");
        double cgpa = SN.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        SN.close();
    }
}