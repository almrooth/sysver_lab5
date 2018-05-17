package bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Test
	public void testFrame_hasProperties() {
		Frame frame = new Frame(1, 2);
		
		assertEquals(1, frame.getThrow1());
		assertEquals(2, frame.getThrow2());		
	}

}
