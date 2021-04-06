package hust.soict.hedspi.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	public Book() {
		super();
	}
	
	public Book(int ID, String title, String category, float cost) {
		super(ID, title, category, cost);
		
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
	
}
