import org.example.RegistrationForm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationFormatTest {

    @Test
    public void testValidUsername() {
        RegistrationForm form = new RegistrationForm("validUser", "test@example.com", "password123");
        assertTrue(form.isValidUsername());
    }

    @Test
    public void testInvalidUsernameTooShort() {
        RegistrationForm form = new RegistrationForm("usr", "test@example.com", "password123");
        assertFalse(form.isValidUsername());
    }

    @Test
    public void testValidEmail() {
        RegistrationForm form = new RegistrationForm("validUser", "test@example.com", "password123");
        assertTrue(form.isValidEmail());
    }

    @Test
    public void testInvalidEmailNoDomain() {
        RegistrationForm form = new RegistrationForm("validUser", "test@", "password123");
        assertFalse(form.isValidEmail());
    }

    @Test
    public void testInvalidPasswordTooShort() {
        RegistrationForm form = new RegistrationForm("validUser", "test@example.com", "pass");
        assertFalse(form.isValidPassword());
    }

    @Test
    public void testEmptyUsername() {
        RegistrationForm form = new RegistrationForm("", "test@example.com", "password123");
        assertFalse(form.isValidUsername());
    }

    @Test
    public void testNullEmail() {
        RegistrationForm form = new RegistrationForm("validUser", null, "password123");
        assertFalse(form.isValidEmail());
    }

    @Test
    public void testNullPassword() {
        RegistrationForm form = new RegistrationForm("validUser", "test@example.com", null);
        assertFalse(form.isValidPassword());
    }

}
