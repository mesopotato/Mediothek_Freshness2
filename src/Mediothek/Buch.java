package Mediothek;

public class Buch extends Medien {
	
	private int seiten;
	
	public Buch(String title, int seiten) {
		super(title);
		this.seiten = seiten;
	}
	public Buch(BuchBuilder builder) {
		super.titel = builder._title;
		this.seiten = builder._seiten;
	}
	
	public int getSeiten() {
		return seiten;
	}
	
	public static BuchBuilder builder() {
		return new BuchBuilder();
	}
	
	public static class BuchBuilder {
		private String _title;
		private int _seiten;
		
		public Buch build() {
			return new Buch(this);
		}
		
		public BuchBuilder title(String title) {
			_title = title;
			return this;
		}
		
		public BuchBuilder seiten(int seiten) {
			_seiten = seiten;
			return this;
		}
	}
}
