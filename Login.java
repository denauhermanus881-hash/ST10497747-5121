public class Login {
    // Stores registered username and password
    private String storedUsername;
    private String storedPassword;

    // Validates that the username contains an underscore and is no more than 5 characters
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Validates password complexity: length, uppercase, lowercase, digit, and special character
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    // Validates that the cell phone number starts with '+' and is between 11 and 13 characters
    public boolean checkCellPhoneNumber(String number) {
        return number.startsWith("+") && number.length() <= 13 && number.length() >= 11;
    }

    // Stores the user's username and password after successful registration
    public void registerUser(String username, String password) {
        storedUsername = username;
        storedPassword = password;
    }

    // Checks if login credentials match the stored ones
    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword);
    }

    // Returns a message based on whether login was successful
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Username and password match. User is able to log in.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}


