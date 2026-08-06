import java.util.Scanner; 
public class areaofsquare {
    public static void main(String[] args) {
        Scanner aos = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = aos.nextDouble();
        double area = side * side;
        System.out.printf("Area of the square with side %.2f is: %.2f", side, area);
        aos.close();
    }
}
