import java.util.Scanner;
public class Num_Decreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter numbers Btw 1 and 1000:");
        int num = scanner.nextInt();
        while (num > 0) {
            System.out.println(num);
            num--;
        }
        scanner.close();
    }
}
