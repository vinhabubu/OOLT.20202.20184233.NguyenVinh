package hust.soict.hedspi.aims.media;
import hust.soict.hedspi.aims.utils.PlayerException;
public class DigitalVideoDisc extends Disc implements Introable {
    private String director;

	private int length;




    public DigitalVideoDisc(String title) 
    {
    	super();
    }

    public DigitalVideoDisc(int length, String director, int ID, String title, String category, float cost,
            String director2, int length2) throws Exception {
        super(length, director, ID, title, category, cost);
        director = director2;
        length = length2;
    }

    public DigitalVideoDisc(String director,int length) 
    {
    	super();
    //     this.director = director;
    //     this.length = length;
     }

    public DigitalVideoDisc() {
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
    	String[] split_title = title.split("--------"); 
    	for(String a : split_title) 
        {
    		if(!Media.title.contains(a)) 
    			return  false;
    	}
    	return true;
    }

    public int compareTo(Object obj) {
        int cCheck = Float.valueOf(this.cost).compareTo(((DigitalVideoDisc)obj).getCost());
        int lCheck = Integer.valueOf(this.length).compareTo(((DigitalVideoDisc)obj).getLength());
        if(cCheck != 0) {
        	return cCheck;
        }
        else if (lCheck == 1) {
        	return lCheck;
        }
        else {
        	return this.title.compareTo(((DigitalVideoDisc)obj).getTitle());
        }

    // public DigitalVideoDisc(String title, String category, float cost,String director, int length) {
	// 	super();
	// 	this.director = director;
	// 	this.length = length;
	}
    @Override
    public void intro() throws PlayerException{
        // TODO Auto-generated method stub
        if (this.getLength() > 0) {
        	System.out.println("The title of DVD is " + this.getTitle());
            System.out.println("The length of DVD is " + this.getLength());
        }
        else {
        	System.out.println("The Length is not nagative");
    
    }

    public void show() {
        System.out.println("DVD is " + this.getID());
		System.out.println("Title video is " + this.getTitle());
		System.out.println("DVD length is  " + this.getLength());
		System.out.println("Cost of DVD is" + this.getCost());
		System.out.println("Category of DVD is " + this.getCategory());
		System.out.println("Director of DVD is " + this.getDirector());
	}

   

   
	

}
