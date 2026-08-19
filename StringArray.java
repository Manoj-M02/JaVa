import java.util.Scanner;
public class StringArray {
    static void printArray(String[] langus){
        for(int i=0; i<langus.length; i++){
            System.out.print(langus[i]+ "  ");
        }
    }
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = ar.nextInt();
        //Declaring array of String type
        String[] langus = new String[size];
        System.out.println("Enter the languages:");
        //User input for array elements
        for(int i=0; i<size; i++){
            langus[i]= ar.next();
        }
        //calling method to print array elements
        printArray(langus);
        ar.close();
    }
}
