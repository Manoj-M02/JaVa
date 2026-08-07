import java.util.Scanner;

public class NestedIF {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = lol.nextInt();
        if(age>=18){
            System.out.printf("Your Age is %d so You'r Adult \n",age);
        
            if(age>=60){
            System.out.printf("Your Age is %d so You've old Age" ,age);
            }
            else{
            System.out.printf("Your Age is %d so You'r Young" ,age);
            }
        }
        else{
            System.out.printf("Your Age is %d so You'r Not Adult \n And You'r Minor & Child" ,age);  
        }
        lol.close();
    }
}
