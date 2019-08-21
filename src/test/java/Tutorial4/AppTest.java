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
	
	@Test
	public void testSubtract() {
		assertEquals(3, new Calc().subtract(6, 3));
	}
}
