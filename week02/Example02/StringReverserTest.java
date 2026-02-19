package Example02;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverserTest {
	StringReverser rs = new StringReverser();
	
	@Test
	public void test() {
		assertEquals("nere",rs.reverser("eren"));
	}
	
	@Test
	public void test2() {
		assertEquals("ezmag",rs.reverser("gamze"));
	}

}
