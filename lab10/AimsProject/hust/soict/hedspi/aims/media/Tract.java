package hust.soict.hedspi.aims.media;

import java.util.Objects;





public class Tract implements Introable,Comparable {
    
    protected String title;
    protected int length;
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (title.length() == 0) {
    		throw new Exception("The title is not empty");
    	}
    	else {
    		this.title = title;
    	}
        
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) throws Exception {
        if (length <= 0) {
        	throw new Exception("The length is not empty");
        }
        else {
        	this.length = length;
        }
    }
    @Override
    public void intro() {
        System.out.println("The title of  track is " + this.getTitle());
        System.out.println("The track length is " + this.getLength());
    }
    public Tract() {
    }
    public  Tract(String title, int length){
        super();
        this.title = title;
        this.length = length;
    }

    public static boolean contains(Tract i) {
        return false;
    }

    public static void add(Tract i) {
    }

    public static int size() {
        return 0;
    }

    public static CompactDisc get(int i) {
        return null;
    }

    public static void remove(Tract i) {
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tract other = (Tract) obj;
        if (this.length != other.length) {
            return false;
        }
        return Objects.equals(this.title, other.title) && Objects.equals(this.length, other.length);
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub

       
        return this.title.compareTo(((Tract)o).getTitle());
    }

    

   


    
}
