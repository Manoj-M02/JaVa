public class Main {
    public static void main(String[] args) {
        UserAccount ko = new UserAccount(
                "JohnKannan",
                "M4M3",
                "kananjohn@gmail.com",
                0
        );

        System.out.println(ko.getUN());
        System.out.println(ko.getUE());

        ko.login("manojm4");
        ko.login("wrong");
        ko.login("incorrect");
        ko.login("M4M3");
    }
}