package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.sound.midi.Track;


public class Aims {


    /**
     *
     */
    
    public static void main(String[] args) throws Exception {
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
    public static Media getItem() throws Exception {
        int type;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a type of media: ");
        System.out.println("1.Choose the Book");
        System.out.println("2.Choose the CompactDisc");
        System.out.println("3.Choose the  DigitalVideoDisc");
        type = sc.nextInt();
        switch (type) {
             
           
            case 1 : {
                Book book = new Book();
                System.out.println("The Book ID is "); try {
					book.setID(sc.nextInt());
				} catch (Exception ex1) {		
					ex1.printStackTrace();
				} sc.nextLine();
                System.out.println("The Book title is "); try {
					book.setTitle(sc.nextLine());
				} catch (Exception ex1) {					
					ex1.printStackTrace();
				}
                System.out.println("The Book Category is "); try {
                    book.setCategory(sc.nextLine());
				} catch (Exception ex1) {					
                    ex1.printStackTrace();
				}
                System.out.println("The Cost is "); try {
					book.setCost(sc.nextFloat());
				} catch (Exception ex1) {			
					ex1.printStackTrace();
				} sc.nextLine();
                System.out.println("The Book Authors is  ");
                for (var author : sc.nextLine().split(" ")) {
                    try {
						book.addAuthor(author);
					} catch (Exception ex) {						
						ex.printStackTrace();
					}
                }
                return book;
            }
            case 2 : 
            CompactDisc cd = new CompactDisc();
                System.out.println("The Id of CD is "); try {
					cd.setID(sc.nextInt());
				} catch (Exception ex1) {
					ex1.printStackTrace();
				} sc.nextLine();
                System.out.println("THe CD Title is "); try {
					cd.setTitle(sc.nextLine());
				} catch (Exception ex2) {
					ex2.printStackTrace();
				}
                System.out.println("The Category of CD is "); try {
					cd.setCategory(sc.nextLine());
				} catch (Exception ex1) {
					ex1.printStackTrace();
				}
                System.out.println("The  Cost is "); try {
					cd.setCost(sc.nextFloat());
				} catch (Exception ex1) {
					ex1.printStackTrace();
				} sc.nextLine();
                System.out.println("The CD director is"); cd.setDirector(sc.nextLine());
                System.out.println("The CD artist is "); try {
					cd.setArtist(sc.nextLine());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
                String select;
                do {
                    System.out.println("Do you want to add track? Y/N");
                    select = sc.nextLine();
                    if (select.equals("Y"))  {
                        Tract track = new Tract();
                        System.out.println("The track title is "); track.setTitle(sc.nextLine());
                        System.out.println("The track length is "); track.setLength(sc.nextInt()); sc.nextLine();
                        cd.addTract(track);
                    }
                    
                } while (true);

                
                
            case 3 : 
            {
                
                DigitalVideoDisc dvd = new DigitalVideoDisc();
                System.out.println("The id of DVD is "); try {
					dvd.setID(sc.nextInt());
				} catch (Exception e1) {
					e1.printStackTrace();
				} sc.nextLine();
                System.out.println("The DVD Title is "); try {
					dvd.setTitle(sc.nextLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
                System.out.println("The DVD Category is "); try {
					dvd.setCategory(sc.nextLine());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
                System.out.println("The  Cost is "); try {
					dvd.setCost(sc.nextFloat());
				} catch (Exception e) {
					e.printStackTrace();
				} sc.nextLine();
                System.out.println("THe DVD Director is  "); dvd.setDirector(sc.nextLine());
                System.out.println("The DVD Length is"); dvd.setLength(sc.nextInt()); sc.nextLine();

                System.out.println("Do you want to play DVD? Y/N");
                String select1 = sc.nextLine();
                if (select1.equals("Y") )
                    dvd.intro();
                
                return dvd;
            }
        }
        return null;
    }
            
    public static Map<String, Integer> sortByKeys(Map<String, Integer> wordFrequency) {
        return null;
    }
}
