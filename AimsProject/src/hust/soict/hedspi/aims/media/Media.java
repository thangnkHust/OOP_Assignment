package hust.soict.hedspi.aims.media;

public class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media(String title) {
		this.title = title;
	}
	
	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	
	public Media(String title, String category, float cost) {
		this(title, category);
		this.cost = cost;
	}
	
	public Media(String title, String category, float cost, String id) {
		this(title, category, cost);
		this.id = id;
	}

}
