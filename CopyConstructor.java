public class CopyConstructor {

    static class Students {

        String Name;
        Students(String Name) {
            System.out.println("The Object is created");
            this.Name = Name;
        }

        Students(Students obj) {
            this.Name = obj.Name;
        }
    }

    public static void main(String[] args) {

        CopyConstructor.Students ko = new CopyConstructor.Students("Kevin");

        CopyConstructor.Students ro = new CopyConstructor.Students(ko);

        System.out.println("ko.Name = " + ko.Name);
        System.out.println("ro.Name = " + ro.Name);
    }
}