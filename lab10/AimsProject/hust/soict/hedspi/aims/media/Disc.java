package hust.soict.hedspi.aims.media;


public class Disc extends Media{
   protected static int length;
   protected String director;
public Disc() {
    super(ID, title, category, cost);
    Disc.length = length;
    this.director = director;
}


public Disc(int length, String director, int ID, String title, String category, float cost) {
    super(ID, title, category, cost);
    this.length = length;
    this.director = director;
}


public int getLength() {
    return length;
}
public void setLength(int length) {
    Disc.length = length;
}
public String getDirector() {
    return director;
}
public void setDirector(String director) {
    this.director = director;
}
   

       
        
		}







    

