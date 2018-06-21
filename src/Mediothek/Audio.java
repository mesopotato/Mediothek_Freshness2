package Mediothek;

public class Audio extends Medien {
	
	private int lengthMin;
	
	public Audio(String title, int lengthMin) {
		super(title);
		this.lengthMin = lengthMin;
	}
	
	public Audio(AudioBuilder builder) {
		super.titel = builder._title;
		this.lengthMin = builder._lenthMin;
	}
	public int getLengthMin() {
		return lengthMin;
	}
	
	public static AudioBuilder builder() {
		return new AudioBuilder();
	}
	
	public static class AudioBuilder {
		private String _title;
		private int _lenthMin;
		
		public AudioBuilder title(String _title) {
			this._title = _title;
			return this;
		}
		
		public AudioBuilder lengthMin(int _lenthMin) {
			this._lenthMin = _lenthMin;
			return this;
		}
		
		public Audio build() {
			return new Audio(this);
		}
	}
}
