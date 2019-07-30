package testing;

import junit.framework.TestCase;

public class squareTest extends TestCase {
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}

}

