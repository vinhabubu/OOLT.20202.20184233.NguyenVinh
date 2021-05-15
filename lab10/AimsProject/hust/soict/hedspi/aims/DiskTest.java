package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.*;
import hust.soict.hedspi.aims.order.*;

public class DiskTest {

	public static void main(String[] args) {
		Order anorder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        anorder.addDigitalVideoDisc(dvd1);


        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star World");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        anorder.addDigitalVideoDisc(dvd2);


        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        anorder.addDigitalVideoDisc(dvd3);



		anorder.print();
		System.out.println(dvd3.search("Alladin"));
		
		System.out.println("The lucky item is ");
		anorder.getItem();
		System.out.println("The listordered update is");
		anorder.print();
		
		
	}

}
