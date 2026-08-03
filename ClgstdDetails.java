import java.util.Scanner;
public class ClgstdDetails {
    public static void main(String[] args) {
        Scanner cld = new Scanner(System.in);
        System.out.println("Student Name:");
        String studentName = cld.nextLine();
        System.out.println("Student Registration Number:");
        String regNumber = cld.nextLine();
        System.out.println("Department:");
        String department = cld.nextLine();
        System.out.println("College Name:");
        String collegeName = cld.nextLine();
        System.out.println("Location: ABC City");
        String location = cld.nextLine();
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Registration Number: " + regNumber);
        System.out.println("Department: " + department);
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
        cld.close();   
    }
}
