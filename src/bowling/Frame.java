package bowling;

public class Frame {

	private int[] frameThrows = new int[2];
	
	public Frame() {}
	
	public int[] getFrameThrows() {
		return this.frameThrows;
	}
	
	public int getScore() {
		int score = 0;
		for(int element: this.frameThrows) {
			score += element;
		}
		return score;
	}
	
	public void setFrameThrows(int[] frameThrows) {
		this.frameThrows = frameThrows;
	}
	
}
