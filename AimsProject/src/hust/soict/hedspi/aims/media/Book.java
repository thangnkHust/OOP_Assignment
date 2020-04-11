package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
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
