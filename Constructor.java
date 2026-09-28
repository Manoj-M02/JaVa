public class Constructor {

    static class Students {          // <-- add static
        String Name;
        int Age;
        String Regno;
        String Dept;

        Students() {
            System.out.println("The Object is created");
        }
    }

    public static void main(String[] args) {
        Constructor.Students s = new Constructor.Students();
        System.out.println(s.Name);
    }
}