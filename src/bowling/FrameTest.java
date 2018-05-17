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
	
	@Test
	public void testGetScore_computeSumOfThrows() {
		Frame frame1 = new Frame();
		int[] score1 = {2, 6};
		frame1.setFrameThrows(score1);
		
		Frame frame2 = new Frame();
		int[] score2 = {0, 9}; 
		frame2.setFrameThrows(score2);
		
		assertEquals(8, frame1.getScore());
		assertEquals(9, frame2.getScore());
	}

}
