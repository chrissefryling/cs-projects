package quiz0;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quiz0Test {

	@Test
	public void testMean() {
		double delta = 0.0000000000000001;
		int[] values = {-1, 0, 1, 2};
		assertEquals(0.5, Quiz0.mean(values), delta);
		values = new int[]{7};
		assertEquals(7, Quiz0.mean(values), delta);
	}

	@Test
	public void testVariance() {
		double delta = 0.0000000000000001;
		int[] values = {-1, 0, 1, 2};
		assertEquals(1.25, Quiz0.variance(values), delta);
	}

	@Test
	public void testMax() {
		int[][] values = {{-1, 0, 1, 2}, {4, 3, 2, 1}};
		assertEquals(4, Quiz0.max(values));
		values = new int[][]{{0}, {-1}};
		assertEquals(0, Quiz0.max(values));
	}

	@Test
	public void testEvenInterval() {
		assertTrue(Quiz0.evenInterval(1, 2, 3));
		assertTrue(Quiz0.evenInterval(2, 0, 4));
		assertTrue(Quiz0.evenInterval(-1, 0, 1));
		
		assertFalse(Quiz0.evenInterval(1, 2, 4));
		assertFalse(Quiz0.evenInterval(1, 0, 1));
	}

	@Test
	public void testInterleave() {
		assertEquals("otnweo", Quiz0.interleave("one", "two"));
		assertEquals("cfaetline", Quiz0.interleave("cat", "feline"));
		assertEquals("meow", Quiz0.interleave("meow",  ""));
	}

}
