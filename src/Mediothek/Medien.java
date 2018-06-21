package Mediothek;

import java.util.Date;

public abstract class Medien {

	protected String titel;
	private static int idCounter = 0;
	protected int id;
	private Date AusleihDatum;
	private String Ausleiher = "";
	
	public Medien(String titel){
		this.titel = titel;
		idCounter++;
		id = idCounter;
		this.AusleihDatum = new Date();
	}
	
	public Medien() {
		this.titel = "";
		idCounter++;
		id = idCounter;
		this.AusleihDatum = new Date();
	}
	
	public String getTitel() {
		return titel;
	}
	
	public int getId() {
		return id;
	}
	
	public Date getAusleihDatum() {
		return AusleihDatum;
	}
	
	public void setAusleihDatum(Date ausleihDatum) {
		AusleihDatum = ausleihDatum;
	}
	
	public String getAusleiher() {
		return Ausleiher;
	}
	
	public void setAusleiher(String ausleiher) {
		Ausleiher = ausleiher;
	}
}
