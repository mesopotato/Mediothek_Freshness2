package Mediothek;

public abstract class Medien {

	protected String titel;
	private static int idCounter = 0;
	protected int id;
	
	public Medien(String titel){
		this.titel = titel;
		idCounter++;
		id = idCounter;
	}

}
