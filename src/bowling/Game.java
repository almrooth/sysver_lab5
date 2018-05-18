package bowling;

public class Game {
	
	public Frame[] frames = new Frame[10];
	
	public Game() {}

	public int getScore() {
		int score = 0;
		for (Frame frame: frames) {
			score += frame.getScore();
		}
		return score;
	}
}
