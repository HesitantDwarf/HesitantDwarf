package Tutorial4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testAdd() {
		assertEquals(10, new Calc().add(3, 7));
	}
}
