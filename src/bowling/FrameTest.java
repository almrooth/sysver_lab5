package bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Test
	public void testFrame_hasProperties() {
		Frame frame = new Frame();
		
		assertEquals(2, frame.getFrameThrows().length);		
	}

}
