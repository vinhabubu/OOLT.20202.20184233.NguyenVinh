package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Introable {
    private String director;

	private int length;




    public DigitalVideoDisc(String title) 
    {
    	super();
    }

    public DigitalVideoDisc(String director,int length) 
    {
    	super();
    //     this.director = director;
    //     this.length = length;
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
    		if(!this.title.contains(a)) 
    			return  false;
    	}
    	return true;
    }

    

    public DigitalVideoDisc(String title, String category, float cost,String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}
    public void intro2() {
		System.out.println("Title video is " + this.getTitle());
		System.out.println("DVD length is  " + this.getLength());
		System.out.println("Cost of DVD is" + this.getCost());
		System.out.println("Category of DVD is " + this.getCategory());
		System.out.println("Director of DVD is " + this.getDirector());
	}

    @Override
    public void intro() {
        // TODO Auto-generated method stub
        
    }
	

}
