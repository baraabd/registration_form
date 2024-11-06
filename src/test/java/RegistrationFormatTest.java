import org.example.RegistrationForm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationFormatTest {
    @Test
    public void testValidUsername() {
        RegistrationForm form = new RegistrationForm("validUser", "test@example.com", "password123");
        assertTrue(form.isValidUsername());
    }
}
