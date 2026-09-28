
public class UserAccount {
    private String username;
    private String password;
    private String email;
    private int loginAttempt;

    public UserAccount(String username, String password,
                       String email, int loginAttempt) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loginAttempt = 0;
    }

    public String getUN() {
        return username;
    }

    public String getUE() {
        return email;
    }

    public void login(String enteredPassword) {
        if (loginAttempt >= 3) {
            System.out.println("Can't login. Account is locked.");
            return;
        }

        if (this.password.equals(enteredPassword)) {
            System.out.println("Login successful!");
            loginAttempt = 0;
        } else {
            loginAttempt++;
            System.out.println("Password incorrect!");

            if (loginAttempt == 3) {
                System.out.println("Account locked.");
            }
        }
    }

    public void resetPassword(String oldPassword,
                              String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password reset successfully.");
        } else {
            System.out.println("Invalid password.");
        }
    }

    public static void main(String[] args) {
        UserAccount user = new UserAccount(
            "Manoj", "12345", "manoj@gmail.com", 0
        );

        System.out.println("Username: " + user.getUN());
        System.out.println("Email: " + user.getUE());

        user.login("wrong");
        user.login("wrong");
        user.login("12345");

        user.resetPassword("12345", "67890");
        user.login("67890");
    }
}