package hust.soict.hedspi.aims.media.book;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public Book(String id, String title, float cost) {
		super(id, title, cost);
	}
	
	public Book(String id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public Book(String id, String title, float cost, ArrayList<String> authors) {
		super(id, title, cost);
		if(authors.size() != 0) {
			this.authors = authors;
		}else {
			System.out.println("Authors list is empty!");
		}
	}
	
	public void addAuthor(String authorName){
		for(String author: authors) {
			if(author.equalsIgnoreCase(authorName))
				System.err.println("Exist author name");
				return;
		}
		authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		for(String author: authors) {
			if(author.equalsIgnoreCase(authorName))
				authors.remove(author);
				return;
		}
		System.err.println("Don't exist author name");
	}

}
