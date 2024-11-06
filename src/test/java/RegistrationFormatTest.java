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
}
