public class Printing {
    public static void main(String[] args) {
        String name = "Srinath";
        int age = 71;
        double salary = 100000.0555;
        // \n is used to print in new line
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);
        //Basic
        System.out.printf("Name: %s \nAge: %d \nSalary: %.4f" ,name, age, salary);
        //Formatting with width and precision
    }
}
