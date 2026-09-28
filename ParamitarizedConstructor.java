public class ParamitarizedConstructor {
    static class Students {
        String name;
        Students(String name) {
            System.out.println("The object is created");
            this.name = name;
        }
    }
    public static void main(String[] args) {
        ParamitarizedConstructor.Students ko =
            new ParamitarizedConstructor.Students("Manoj");
        System.out.println(ko.name); 
    }
}