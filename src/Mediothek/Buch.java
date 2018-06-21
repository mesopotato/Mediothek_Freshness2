package Mediothek;

public class Buch extends Medien {
	
	private int seiten;
	
	public Buch(String title, int seiten) {
		super(title);
		this.seiten = seiten;
	}
	
	public int getSeiten() {
		return seiten;
	}
}
