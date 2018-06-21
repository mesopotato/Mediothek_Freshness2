package Mediothek;

public class Video extends Medien {
	
	private int lengthMin;
	
	public Video(String title, int lengthMin) {
		super(title);
		this.lengthMin = lengthMin;
	}
	
	public Video(VideoBuilder builder) {
		super.titel = builder._title;
		this.lengthMin = builder._lengthMin;
	}
	
	public int getLengthMin() {
		return lengthMin;
	}
	
	public static VideoBuilder builder() {
		return new VideoBuilder();
	}
	
	public static class VideoBuilder {
		private String _title;
		private int _lengthMin;
		
		public VideoBuilder title(String _title) {
			this._title = _title;
			return this;
		}
		
		public VideoBuilder lengthMin(int _lengthMin) {
			this._lengthMin = _lengthMin;
			return this;
		}
		
		public Video build() {
			return new Video(this);
		}
	}
}
