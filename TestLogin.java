import org.junit.Test;
import static org.junit.Assert.*;

public class TestLogin {
    // Create Login object to test methods
    Login login = new Login();

    // Test username validation
    @Test
    public void testCheckUserName() {
        assertTrue(login.checkUserName("kyl_1"));         // Valid
        assertFalse(login.checkUserName("kyle!!!!!!!"));  // Invalid
    }

    // Test password complexity
    @Test
    public void testCheckPasswordComplexity() {
        assertTrue(login.checkPasswordComplexity("Ch&n&se&keep9!")); // Valid
        assertFalse(login.checkPasswordComplexity("password"));      // Invalid
    }

    // Test cell phone number format
    @Test
    public void testCheckCellPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27838968976")); // Valid
        assertFalse(login.checkCellPhoneNumber("08966553"));    // Invalid
    }

    // Test login functionality
    @Test
    public void testLoginUser() {
        login.registerUser("kyl_1", "Ch&n&se&keep9!");
        assertTrue(login.loginUser("kyl_1", "Ch&n&se&keep9!")); // Correct credentials
        assertFalse(login.loginUser("wrong", "1234"));          // Incorrect credentials
    }

    // Test login status messages
    @Test
    public void testReturnLoginStatus() {
        assertEquals("Username and password match. User is able to log in.", login.returnLoginStatus(true));
        assertEquals("Username or password incorrect, please try again.", login.returnLoginStatus(false));
    }
}

