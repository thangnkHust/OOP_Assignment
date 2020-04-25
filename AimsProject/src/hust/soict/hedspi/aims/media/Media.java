package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.media.disc.CompactDisc;
import hust.soict.hedspi.aims.media.disc.DigitalVideoDisc;

public abstract class Media implements Comparable<Media>{
	protected String title;
	protected String category;
	protected float cost;
	protected String id;
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	
	public Media(String id, String title, float cost) {
		this.id = id;
		this.title = title;
		this.cost = cost;
	}
	
	public Media(String id, String title, String category, float cost) {
		this(id, title, cost);
		this.category = category;
	}
	
	public boolean equals(Object temp) {
//		Media media = (Media)temp;
		if(id.equalsIgnoreCase( ((Media)temp).id) )
			return true;
		return false;
	}
	
	public int compareTo(Media media) {
		if (media instanceof DigitalVideoDisc) {
			return -1;
		}else if(media instanceof CompactDisc)
			return 1;
		else return 0;
//		return this.category.compareTo(media.getCategory());
	}

}
