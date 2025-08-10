package junittest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test; // For @Test

public class JunitTestEx7 {
	@Test
    public void testIsUpperCase() {
        String input = "HELLO";

        // Logic inside test case
        boolean isUpperCase = input.equals(input.toUpperCase());

        assertTrue(isUpperCase, "String should be uppercase");
    }

    @Test
    public void testIsNotUpperCase() {
        String input = "Hello";

        // Logic inside test case
        boolean isUpperCase = input.equals(input.toUpperCase());

        assertFalse(isUpperCase, "String should not be uppercase");
    }

}
