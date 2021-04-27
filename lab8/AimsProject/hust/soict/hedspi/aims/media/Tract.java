package hust.soict.hedspi.aims.media;

public class Tract implements Introable {
    protected String title;
    protected int length;

    @Override
    public void intro() {
        // TODO Auto-generated method stub
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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
    


    
}
