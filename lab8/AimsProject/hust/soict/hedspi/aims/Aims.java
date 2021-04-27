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
         Order myOrder = null;
        int select;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Managerment order   ");
            System.out.println("*****************************");
            System.out.println("1. Create a new order ");
            System.out.println("2. Add a item ");
            System.out.println("3. Delete  item by id item ");
            System.out.println("4. Display the list item");
            System.out.println("0. Exit");
            System.out.println("---------------.----------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            select = sc.nextInt();

            switch (select) {
                case 1 : myOrder = new Order();
                case 2 :
                 {
                    try {
                        Media media = getItem();
                        if (media != null)
                            myOrder.addMedia(media);
                        else
                            System.out.println("Invalid!");
                    } catch (NullPointerException e) {
                        System.out.println("Order does not exist");
                    }
                }
                case 3 : 
                {
                    try {
                        System.out.println("Input ID: ");
                        int ID = sc.nextInt();
                        myOrder.removeMedia(ID);
                    } catch (NullPointerException e) {
                        System.out.println("Order does not exist");
                    }
                }
                case 4 : {
                    try {
                        myOrder.showOrder();
                    } catch (NullPointerException e) {
                        System.out.println("Order does not exist");
                    }
                }
                default : {}
            }
            System.out.println("");
        } while(select != 0);
    }
    public static Media getItem() {
        int type;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a type of media: ");
        System.out.println("1.Choose the Book");
        System.out.println("2.Choose the CompactDisc");
        System.out.println("3.Choose the  DigitalVideoDisc");
        type = sc.nextInt();
        switch (type) {
            case 1 : 
            {
                Book book = new Book();
                System.out.println("The Book ID is  "); book.setID(sc.nextInt()); sc.nextLine();
                System.out.println("The Book Title is  "); book.setTitle(sc.nextLine());
                System.out.println("The Book Category is  "); book.setCategory(sc.nextLine());
                System.out.println("The Cost is "); book.setCost(sc.nextFloat()); sc.nextLine();
                System.out.println("The  Author is  ");
                for (var author : sc.nextLine().split(" "))
                    book.addAuthor(author);
                return book;
            }
            case 2 : 
            {
                CompactDisc cd = new CompactDisc(null, null, null, null);
                System.out.println("The ID of CD is  "); cd.setID(sc.nextInt()); sc.nextLine();
                System.out.println("The CD Title is  "); cd.setTitle(sc.nextLine());
                System.out.println("The CD Category is  "); cd.setCategory(sc.nextLine());
                System.out.println("The  Cost is "); cd.setCost(sc.nextFloat()); sc.nextLine();
                System.out.println("The  Director is "); cd.setDirector(sc.nextLine());
                System.out.println("The  Artist is "); cd.setArtist(sc.nextLine());
                String select;
                do {
                    System.out.println(" Y/N");
                    select = sc.nextLine();
                    if (select.equals("Y") ) {
                        Tract track = new Tract();
                        System.out.println("The Track title is  "); ((Media) track).setTitle(sc.nextLine());
                        System.out.println("The Track length is  "); ((Disc) track).setLength(sc.nextInt()); sc.nextLine();
                        cd.addTract(track);
                    }
                    else
                        break;
                } while (true);
                
               
                System.out.println(" CD: Y/N");
                select = sc.nextLine();
                if (select.equals("Y") )
                    cd.play();

                return cd;
            }
            case 3 : 
            {
                DigitalVideoDisc dvd = new DigitalVideoDisc(null);
                System.out.println("The ID of DVD is "); dvd.setID(sc.nextInt()); sc.nextLine();
                System.out.println("The DVD Title is "); dvd.setTitle(sc.nextLine());
                System.out.println("THe DVD Category is "); dvd.setCategory(sc.nextLine());
                System.out.println("The  Cost is "); dvd.setCost(sc.nextFloat()); sc.nextLine();
                System.out.println("The  Director is  "); dvd.setDirector(sc.nextLine());
                System.out.println("The Length is  "); dvd.setLength(sc.nextInt()); sc.nextLine();
                
                
                System.out.println(" DVD: Y/N");
                String select = sc.nextLine();
                if (select.equals("Y") )
                    dvd.play();
                
                return dvd;
            }
            default : { return null; }
        }
    }
}
