package testing;

import static org.junit.Assert.*;
import junit.framework.TestCase;

public class squareTest {
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assretEquals(25, output);
	}

}
