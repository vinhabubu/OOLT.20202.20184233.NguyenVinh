package hust.soict.hedspi.aims.media;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import hust.soict.hedspi.aims.Aims;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;

public class Book extends Media implements Comparable {
	private List<String> authors = new ArrayList<String>();
	private String content;
    private List<String> contentTokens = new ArrayList<String>();
    private Map<String,Integer> wordFrequency = new TreeMap<String,Integer>();
	public Book() {
		super();
	}
	
	public Book( String title,String author, String category, float cost) {
		super();
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getContentTokens() {
		return contentTokens;
	}

	public void setContentTokens(List<String> contentTokens) {
		this.contentTokens = contentTokens;
	}

	public Map<String, Integer> getWordFrequency() {
		return wordFrequency;
	}

	public void setWordFrequency(Map<String, Integer> wordFrequency) {
		this.wordFrequency = wordFrequency;
	}

	public Optional<String> getAuthors() {

		return this.authors.stream().map(author -> author + " ").reduce(String::concat);
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
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(){
		System.out.println("Book: " + this.getID() + " " + this.getTitle() + " " + this.getCategory() 
		+ " " + this.getCost() + "$ " + this.getAuthors());
	}

	
	public void printTokens() {
    	this.contentTokens.forEach(System.out::println);
    }
	@Override
    public String toString() {
    	this.wordFrequency = Aims.sortByKeys(this.wordFrequency);
    	for(java.util.Map.Entry<String, Integer> entry : this.wordFrequency.entrySet()) {
    		String keys = entry.getKey();
    		int values = entry.getValue();
    		System.out.println("The token is: " + keys + " the number of tokens: " + values);
    	}
    	return "The number of tokens " + this.contentTokens.size();
    }

	private Map<String, Integer> sortByKeys(Map<String, Integer> wordFrequency2) {
		return null;
	}

	public void process() {
    	String[] store = this.content.split(" |\t");
    	for(int i = 0; i < store.length; i++) {
    		if(!this.wordFrequency.containsKey(store[i])) {
    			this.wordFrequency.put(store[i], 1);
    		}
    		else {
    			this.wordFrequency.replace(store[i], this.wordFrequency.get(store[i]),
				 this.wordFrequency.get(store[i]) + 1);
    		}
    	}
    	this.contentTokens.addAll(this.wordFrequency.keySet());
    	Collections.sort(this.contentTokens);
    }
    

	
}
