package hust.soict.hedspi.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	public Book() {
		super();
	}
	
	public Book( String title,String author, String category, float cost) {
		super();
		
	}

	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) 
	{
		if(!(authors.contains(authorName))) 
		{
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName))
		{
			authors.remove(authorName);
		}
	}
	public void intro3() {
		System.out.println(" Book is  " + this.getTitle());
		System.out.println("Author  is" + this.getAuthors());
		System.out.println("Category is" + this.getCategory());
		System.out.println("Cost is" + this.getCost());
	}


	
}
