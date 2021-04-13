package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    
    
    public DigitalVideoDisc(String title) 
    {
    	super(title);
    }

    public DigitalVideoDisc(int ID, String title, String category, String director, int length, float cost) 
    {
    	super(ID, title,category,cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    
    public boolean search(String title) 
    {
    	String[] split_title = title.split("----"); 
    	for(String a : split_title) 
        {
    		if(!this.title.contains(a)) 
    			return  false;
    	}
    	return true;
    }
}
