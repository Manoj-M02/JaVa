import java.util. *;
public class WRWOAM {
    //With return type with out argument method
    public int addValue(){
        Scanner Wr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = Wr.nextInt();
        System.out.print("Enter second number: ");
        int b = Wr.nextInt();
        int sum = a + b;
        Wr.close();
        return sum;
    }
    
    public static void main(String[] args) {
        WRWOAM obj = new WRWOAM();
        int result = obj.addValue();
        System.out.println("Sum: " + result);
    }
    
}
