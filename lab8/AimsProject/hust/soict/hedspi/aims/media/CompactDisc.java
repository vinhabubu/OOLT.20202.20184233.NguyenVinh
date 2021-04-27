package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Introable{

    
    private ArrayList<Tract> tracts = new ArrayList<Tract>();
    private ArrayList<Tract> tracts2;
    public ArrayList<Tract> getTracts() {
        return tracts;
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

    public CompactDisc(String title, String category, String string,String string2 ) {
		super( length, string2, length, string2, string2, cost);
		tracts2 = tracts;
        this.tracts = tracts2;
	}
	
	public void intro1() {
		System.out.println("Title: " + this.getTitle());
		System.out.println("Caterogy: "+this.getCategory());
		
	}

	@Override
    public void show() {
        System.out.println("The DVD is  " + this.getID() + " " + this.getTitle() + " " + 
		this.getCategory() + " " + this.getCost() 
        + "  " + this.getDirector() + " " + this.getLength() + " " + this.getCost());

		


    
}
    public void setArtist(String nextLine) {
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

