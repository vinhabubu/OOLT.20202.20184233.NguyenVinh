package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.*;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Track;


public class Aims {


    public Aims() {
		super();
	}
    public static void main(String[] args) {
        ArrayList<String> authors = new ArrayList<String>();
		ArrayList<Track> tracks1 = new ArrayList<Track>();
		ArrayList<CompactDisc> discs = new ArrayList<CompactDisc>();
		ArrayList<Media> itemsOrdered = new ArrayList<Media>();
		ArrayList<DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>();
		ArrayList<Book> book = new ArrayList<Book>();
		
        int select;
        Scanner scan = new Scanner(System.in);
        do 
        {
            System.out.println(" Introduce ");
            System.out.println("--------------------------------");
            System.out.println("1. Information of  CompactDisc");
            System.out.println("2. Information of  DVD");
            System.out.println("3. Information of Book ");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
          
            System.out.println("Please choose a number: 0-1-2-3");
            select = scan.nextInt();

            switch (select) {

                case 1:
                CompactDisc c1 = new CompactDisc("Lion King", "Live ACtion", "122", "122");
                c1.intro1();
                    break;
                case 2:
                DigitalVideoDisc d1 = new DigitalVideoDisc("Van Quyen", 122);
                d1.intro2();
                    
                    break;
                case 3:
                Book b1 = new Book("Harry Potter", "Jack Rowling", "Science Fiction", 150);
                b1.intro3();

                    break;
                case 0:
                	System.out.println("Exit");
                    break;
            }
            System.out.println("---------------");
        } while(select != 0);
    }
}