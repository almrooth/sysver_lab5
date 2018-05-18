package bowling;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class GameTest {
	
	public static Game game;
	
	@BeforeClass
	public static void oneTimeSetUp() {
		Frame[] frames = new Frame[10];
		frames[0] = new Frame();
		frames[0].setFrame(1, 5);
		frames[1] = new Frame();
		frames[1].setFrame(3, 6);
		frames[2] = new Frame();
		frames[2].setFrame(7, 2);
		frames[3] = new Frame();
		frames[3].setFrame(3, 6);
		frames[4] = new Frame();
		frames[4].setFrame(4, 4);
		frames[5] = new Frame();
		frames[5].setFrame(5, 3);
		frames[6] = new Frame();
		frames[6].setFrame(3, 3);
		frames[7] = new Frame();
		frames[7].setFrame(4, 5);
		frames[8] = new Frame();
		frames[8].setFrame(8, 1);
		frames[9] = new Frame();
		frames[9].setFrame(2, 6);		
		
		game = new Game();
		game.frames = frames;
	}

	@Test
	public void testGame_hasFrames() {
		assertTrue(game.frames instanceof Frame[]);
		assertEquals(10, game.frames.length);
	}
	
	@Test
	public void testGetScore_computesSumOfFramesScore() {
		assertEquals(81, game.getScore());
	}
	
	@Test
	public void testGetScore_withStrike() {
		game.frames[0].setFrame(10, 0);
		assertEquals(94, game.getScore());
	}

}
