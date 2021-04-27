package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Introable{

    @Override
    public void intro() {
        // TODO Auto-generated method stub
        
    }
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
		super();
		tracts2 = tracts;
        this.tracts = tracts2;
	}
	
	public void intro1() {
		System.out.println("Title: " + this.getTitle());
		System.out.println("Caterogy: "+this.getCategory());
		
	}




    
}
