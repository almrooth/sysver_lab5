package bowling;

public class Frame {

	public int throw1 = 0;
	public int throw2 = 0;
	
	public Frame() {}
	
	public int getScore() {
		return throw1 + throw2;
	}
	
	public void setFrame(int throw1, int throw2) {
		this.throw1 = throw1;
		this.throw2 = throw2;
	}
	
}
