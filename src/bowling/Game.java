package bowling;

public class Game {
	
	public Frame[] frames = new Frame[10];
	
	public Game() {}

	public int getGameScore() {
		int score = 0;
		
		for (int i = 0; i < frames.length; i++) {
			if (frames[i].isStrike()) {
				if (frames[i].isStrike() && frames[i+1].isStrike()) {
					score += this.getMultiStrikeScore(frames[i], frames[i+1], frames[i+2]);
				} else {
					score += this.getStrikeScore(frames[i], frames[i+1]);
				}				
			} else if (frames[i].isSpare()) {
				score += this.getSpareScore(frames[i], frames[i+1]);
			} else {
				score += frames[i].getScore();
			}
		}
		return score;
	}
	
	public int getStrikeScore(Frame frame, Frame subFrame) {
		return frame.getScore() + subFrame.getScore();
	}
	
	public int getSpareScore(Frame frame, Frame subFrame) {
		return frame.getScore() + subFrame.throw1;
	}
	
	public int getMultiStrikeScore(Frame frame, Frame frame2, Frame frame3) {
		return frame.getScore() + frame2.getScore() + frame3.throw1;
	}
}
