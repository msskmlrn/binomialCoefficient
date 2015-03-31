package functions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MathFunctionsTest {

	private static final int FAC0 = 1;
	private static final int FAC1 = 1;
	private static final int FAC2 = 2;
	private static final int FAC3 = 6;
	private static final int FAC4 = 24;
	private static final int FAC5 = 120;

	private static final int C_7_OVER_2 = 21;
	private static final int C_5_OVER_3 = 10;
	private static final int C_10_OVER_7 = 120;

	//Test for the factorial function

	@Test
	public void testFactorialOfZero() {
		assertTrue(MathFunctions.factorial(0) == FAC0);
	}

	@Test
	public void testFactorialOfOne() {
		assertTrue(MathFunctions.factorial(0) == FAC1);
	}

	@Test
	public void testFactorialProducesCorrectResults() {
		assertTrue(MathFunctions.factorial(2) == FAC2);
		assertTrue(MathFunctions.factorial(3) == FAC3);
		assertTrue(MathFunctions.factorial(4) == FAC4);
		assertTrue(MathFunctions.factorial(5) == FAC5);
	}

	@Test
	public void testFactorialProducesCorrectResultsLoop() {
		for (int i = 10; i > 0; i--) {
			int fac = MathFunctions.factorial(i);
			assertTrue(fac == (i * MathFunctions.factorial(i - 1)));
		}
	}

	@Test
	public void testThatFactorialTestFails() {
		assertFalse(MathFunctions.factorial(5) == FAC4);
	}


	//Test for the binomial coefficient function

	@Test
	public void testCWhenKIsZero() {
		assertTrue(MathFunctions.c(7, 0) == 1);
	}

	@Test
	public void testCWhenKIsOne() {
		assertTrue(MathFunctions.c(7, 1) == 7);
	}

	@Test
	public void testCProducesCorrectResults() {
		assertTrue(MathFunctions.c(7, 2) == C_7_OVER_2);
		assertTrue(MathFunctions.c(5, 3) == C_5_OVER_3);
		assertTrue(MathFunctions.c(10, 7) == C_10_OVER_7);
	}

	@Test
	public void testThatCTestFails() {
		assertFalse(MathFunctions.c(7, 2) == C_10_OVER_7);
	}
}
