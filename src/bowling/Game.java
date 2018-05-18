package bowling;

public class Game {
	
	public Frame[] frames = new Frame[10];
	
	public Game() {}

	public int getScore() {
		int score = 0;
		
		for (int i = 0; i < frames.length; i++) {
			if (frames[i].isStrike()) {
				score += 10 + frames[i+1].getScore();
			} else {
				score += frames[i].getScore();
			}
		}
		return score;
	}
}
