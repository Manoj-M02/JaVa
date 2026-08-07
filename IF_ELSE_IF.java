import java.util.Scanner;
public class IF_ELSE_IF {
    public static void main(String[] args) {
        Scanner lolo = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = lolo.nextInt();
        if(age<=3){
            System.out.printf("Your Age is %d so You'r Child",age);
        }
        else if(age>=4 && age<=12){
            System.out.printf("Your Age is %d so You'r Kid",age);
        }
        else if(age>=13 && age<=18){
            System.out.printf("Your Age is %d so You'r Teenager", age);
        }
        else if(age>=19 && age <=60){
            System.out.printf("Your Age is %d so You'r Adult", age);
        }
        else{
            System.out.printf("Your Age is %d so You'r Old",age);
            
        }
        lolo.close();
    }
}