import java.util.Scanner;
public class WORWAM {
    //With out return type with argument method
    public void addValue(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args){
        WORWAM obj = new WORWAM();
        Scanner Wr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = Wr.nextInt();
        System.out.print("Enter second number: ");
        int b = Wr.nextInt();
        obj.addValue(a, b);
        Wr.close();
    }
}
