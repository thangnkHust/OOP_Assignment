package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category) {
		super(title, category);
	}
	
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Book(String title, String category, ArrayList<String> authors) {
		super(title, category);
		if(authors.size() != 0) {
			this.authors = authors;
		}else {
			System.out.println("Authors list is empty!");
		}
	}
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		if(authors.size() != 0) {
			this.authors = authors;
		}else {
			System.out.println("Authors list is empty!");
		}
	}
	
	public void addAuthor(String authorName){
		if(authors.contains(authorName)) {
			System.out.println("Exist author name");
		}else {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Don't exist author name");
		}else {
			authors.remove(authorName);
		}
	}

}
