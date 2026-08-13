import java.util.*;
public class WRWAM {
    //With return type with argument method
    public int addValue(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        WRWAM obj = new WRWAM();
        Scanner Wr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = Wr.nextInt();
        System.out.print("Enter second number: ");
        int b = Wr.nextInt();
        int result = obj.addValue(a, b);
        System.out.println("Sum: " + result);
        Wr.close();
    }
}
