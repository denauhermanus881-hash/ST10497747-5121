import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner for user input and Login object for validation
        Scanner input = new Scanner(System.in);
        Login login = new Login();

        // Ask user for registration details
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cell phone number: ");
        String cellNumber = input.nextLine();

        // Validate each input using Login methods
        boolean isUsernameValid = login.checkUserName(username);
        boolean isPasswordValid = login.checkPasswordComplexity(password);
        boolean isCellValid = login.checkCellPhoneNumber(cellNumber);

        // Show validation results
        if (isUsernameValid) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }

        if (isPasswordValid) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        if (isCellValid) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }

        // If all inputs are valid, register the user
        if (isUsernameValid && isPasswordValid && isCellValid) {
            login.registerUser(username, password);
            System.out.println("Registration complete.");
        }

        // Ask user to log in
        System.out.print("Login - Enter username: ");
        String loginUsername = input.nextLine();

        System.out.print("Login - Enter password: ");
        String loginPassword = input.nextLine();

        // Check login and display result
        boolean loginSuccess = login.loginUser(loginUsername, loginPassword);
        System.out.println(login.returnLoginStatus(loginSuccess));
    }
}
