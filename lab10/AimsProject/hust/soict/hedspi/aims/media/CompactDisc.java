package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import hust.soict.hedspi.aims.utils.PlayerException;

public class CompactDisc extends Disc implements Introable{

    
    private ArrayList<Tract> tracts = new ArrayList<Tract>();
    private ArrayList<Tract> tracts2;
	private String artist;
	private String artist2;
	private Object tracks;
    public ArrayList<Tract> getTracts() {
        return tracts;
    }
	public CompactDisc() 
	throws Exception {
        if (artist.length() == 0 && director.length() == 0 && title.length() == 0 && category.length() == 0) {
        	throw new Exception("Warning : Empty information");
        }
        if (cost <= 0 && ID <= 0 ) {
        	throw new Exception("Warning : cost or id is 0");
        }
        else {
        	this.artist = artist;
        	this.director = director;
        	this.ID = ID;
        	this.title = title;
        	this.category = category;
        	this.cost = cost;
        }
    }


    public void setTracts(ArrayList<Tract> tracts) {
        this.tracts = tracts;
    }
    public void addIntroduce(Tract i) {
		if(!(Tract.contains(i))) {
			Tract.add(i);
		}
	}
	public void removeIntroduce(Tract i) {
		if(!(Tract.contains(i))) {
			Tract.remove(i);
		}
	}
	public int getLength() {
		int total=0;
		for(int i=0; i<Tract.size(); i++) {
			total+=Tract.get(i).getLength();
		}
		return total;
	}
	

   
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) throws Exception {
        artist2 = artist;
		this.artist = artist;
		artist2 = artist;
		if (artist.length() == 0) {
        	throw new Exception("Warning : empty artist");
        }
        else {
        	this.artist = artist;
        }
    }
	public CompactDisc(String title, String category, String string,String string2 ) {
		super( length, string2, length, string2, string2, cost);
		tracts2 = tracts;
        this.tracts = tracts2;
	}
	
	public void intro1() throws PlayerException {
		if(this.getLength() > 0) {
        	System.out.println("The title of CD is " + this.getTitle());
            System.out.println("The length of CD is " + this.getLength());
            ArrayList<Tract> tracks;
			tracks.forEach(track -> { track.intro(); });
        }
        else {
        	
			System.out.println("The Length is not nagative");
        }
}
@Override
public int compareTo(Object obj) {
	int trackCheck = Integer.valueOf(((ArrayList<Tract>) this.tracks).size()).compareTo(((ArrayList<Tract>) ((CompactDisc)obj).tracks).size());
	if(trackCheck != 0) return trackCheck;
	else return Integer.valueOf(this.getLength()).compareTo(((CompactDisc)obj).getLength());
}



public void show() {
	System.out.println("CD is " + this.getID());
	System.out.println("Title video is " + this.getTitle());
	System.out.println("CD length is  " + this.getLength());
	System.out.println("Cost of CD is" + this.getCost());
	System.out.println("Category of CD is " + this.getCategory());
	System.out.println("Director of CD is " + this.getDirector());
}

   
    public void addTract(Tract track) {
    }
    public void play() {
    }
	@Override
	public void intro() {
		// TODO Auto-generated method stub
		
	}
	
}
