import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        // Output
        System.out.println("\nStudent Details");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }
}