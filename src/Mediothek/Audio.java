package Mediothek;

public class Audio extends Medien {
	
	private int lengthMin;
	
	public Audio(String title, int lengthMin) {
		super(title);
		this.lengthMin = lengthMin;
	}
	
	public int getLengthMin() {
		return lengthMin;
	}
}
