package Mediothek;

public class Video extends Medien {
	
	private int lengthMin;
	
	public Video(String title, int lengthMin) {
		super(title);
		this.lengthMin = lengthMin;
	}
	
	public int getLengthMin() {
		return lengthMin;
	}
}
