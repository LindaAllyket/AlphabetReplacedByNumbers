import static org.junit.Assert.*;

import org.junit.Test;

public class AlphabetReplacerTest {


		@Test
	public void testForSkippedEmptySpaces() {
		AlphabetReplace A = new AlphabetReplace();
		assertEquals("1 2 ", A.Replace("ab"));
	}
}
