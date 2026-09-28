public class Class {

    class Student {
        String name;
        int age;
        String regno;
        String dept;

     void study() {
        System.out.println(name + " is studying.");
    }

     void exam() {
        System.out.println(name + " is writing the exam.");
    }
}

    public static void main(String[] args) {
        Class myClass = new Class();
        Class.Student student1 = myClass.new Student();
        student1.name = "John";
        student1.study();
        student1.age = 20;
        student1.regno = "12345";
        student1.dept = "Computer Science";
        Class.Student student2 = myClass.new Student();
        student2.name = "Jane";
        student2.age = 19;
        student2.regno = "67890";
        student2.dept = "Mathematics";
        student2.exam();
        Class.Student student3 = myClass.new Student();
        student3.name = "Loki";
        student3.age = 19;
        student3.regno = "22222";
        student3.dept = "Physical";
        student3.exam();
    }
}