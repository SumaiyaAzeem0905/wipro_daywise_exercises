package junittest;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class JunitTestEx8 {
	@Test
	void test() {
		String input = null;

        assertThrows(NullPointerException.class, () -> {
            input.toUpperCase();
        });
	}
}
