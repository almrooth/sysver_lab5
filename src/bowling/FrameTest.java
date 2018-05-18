package bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Test
	public void testFrame_hasProperties() {
		Frame frame = new Frame();
		frame.setFrame(2, 6);
		
		assertTrue(frame instanceof Frame);
		assertEquals(frame.throw1, 2);
		assertEquals(frame.throw2, 6);
	}
	
	@Test
	public void testGetScore_computeSumOfThrows() {
		Frame frame1 = new Frame();
		frame1.setFrame(2, 6);
		
		Frame frame2 = new Frame();
		frame2.setFrame(0, 9);
		
		assertEquals(8, frame1.getScore());
		assertEquals(9, frame2.getScore());
	}
	
	@Test
	public void testIsStrike() {
		Frame frame1 = new Frame();
		frame1.setFrame(10, 0);
		
		Frame frame2 = new Frame();
		frame2.setFrame(0, 9);
		
		assertEquals(true, frame1.isStrike());
		assertEquals(false, frame2.isStrike());
	}
	
	@Test
	public void testIsSpare() {
		Frame frame1 = new Frame();
		frame1.setFrame(5, 5);
		
		Frame frame2 = new Frame();
		frame2.setFrame(0, 9);
		
		assertEquals(true, frame1.isSpare());
		assertEquals(false, frame2.isSpare());
	}

}
