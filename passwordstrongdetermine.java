import java.util.Scanner;

public class passwordstrongdetermine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pwd = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()_+-=<>?/{}[]";

        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialChars.contains(String.valueOf(ch))) {
                hasSpecial = true;
            }
        }

        if (pwd.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Password is Strong");
        } else if (pwd.length() >= 6 && (hasUpper || hasLower) && hasDigit) {
            System.out.println("Password is Medium");
        } else {
            System.out.println("Password is Weak");
        }
    }
}
