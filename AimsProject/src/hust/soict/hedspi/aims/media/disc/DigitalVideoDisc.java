package hust.soict.hedspi.aims.media.disc;

public class DigitalVideoDisc extends Disc implements Playable{
	// Constructor by title
	public DigitalVideoDisc(String id, String title, int length, float cost) {
		super(id, title, length, cost);
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, float cost) {
		super(id, title, category, length, cost);
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, String director, float cost) {
		super(id, title, category, length, director, cost);
	}
	
	public boolean search(String title) {
		String[] input = title.toLowerCase().split(" ");
		for (int i = 0; i < input.length; i++) {
			if(getTitle().toLowerCase().contains(input[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
