package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	
	// Constructor
	public CompactDisc(String id, String title, int length, float cost) {
		super(id, title, length, cost);
	}
	
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.err.println("Track has been existed");
		}else {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
		}else {
			System.err.println("Track don't existeds");
		}
	}
	
	public int getLenght() {
		int sum = 0;
		for(Track track: tracks) {
			sum += track.getLength();
		}
		super.length = sum;
		return sum;
	}

}
