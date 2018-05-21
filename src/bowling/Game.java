package bowling;

public class Game {
	
	public Frame[] frames = new Frame[10];
	public int[] bonus = new int[2];
	
	public Game() {}

	public int getGameScore() {
		int score = 0;
		
		for (int i = 0; i < frames.length; i++) {
			// For each frame calculate score
			if (frames[i].isStrike()) {
				// If frame is a strike
				
				if (i == 9) {
					// If frame is last frame
					score += this.getLastStrikeScore(frames[i]);
					
				} else if (i == 8 && frames[i+1].isStrike()) {
					// If 2 last frames are strikes
					score += this.getLast2StrikeScore();
					
				} else if (frames[i+1].isStrike()) {
					// If current and next frames are strike
					score += this.getMultiStrikeScore(frames[i], frames[i+1], frames[i+2]);
				
				} else {
					score += this.getStrikeScore(frames[i], frames[i+1]);
				}				
			} else if (frames[i].isSpare()) {
				// If frame is spare
				
				if (i == 9) {
					// If frame is last frame
					score += this.getLastSpareScore(frames[i]);
					
				} else {
					score += this.getSpareScore(frames[i], frames[i+1]);
				}
			} else {
				score += frames[i].getScore();
			}
		}
		return score;
	}
	
	/*
	 * Calculate score of frame with strike
	 */
	public int getStrikeScore(Frame frame, Frame subFrame) {
		return frame.getScore() + subFrame.getScore();
	}
	
	/*
	 * Calculate score of frame with spare
	 */
	public int getSpareScore(Frame frame, Frame subFrame) {
		return frame.getScore() + subFrame.throw1;
	}
	
	/*
	 * Calculate score of 2 strike frames
	 */
	public int getMultiStrikeScore(Frame frame, Frame frame2, Frame frame3) {
		return frame.getScore() + frame2.getScore() + frame3.throw1;
	}
	
	/*
	 * Calculate score when last frame is spare
	 */
	public int getLastSpareScore(Frame frame) {
		return frame.getScore() + this.bonus[0];
	}
	
	/*
	 * Calculate score when last frame is strike
	 */
	public int getLastStrikeScore(Frame frame) {
		return frame.getScore() + this.bonus[0] + this.bonus[1];
	}
	
	/*
	 * Calculate score when 2 last frames are strike
	 */
	public int getLast2StrikeScore() {
		return frames[8].getScore() + frames[9].getScore() + this.bonus[0];
	}
}
