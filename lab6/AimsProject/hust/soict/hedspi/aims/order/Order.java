package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.utils.*;
import hust.soict.hedspi.aims.media.*;

import  java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Order {
    public static final int MAX_NUMBERS_ORDER = 15;
    public static final int MAX_LIMITED_ORDERS = 8;
    public static int nbOrders = 0;
    private int qtyOrdered;
    MyDate dateOrdered;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private Media m;

    public Order(){
        if( nbOrders < MAX_LIMITED_ORDERS)
        {
            nbOrders += 1;
            dateOrdered = new MyDate();
        }
        else
        {
            System.out.println("Number of orders is max!");
        }
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public String getDateOrdered(){
        return dateOrdered.getDay() + "-" + dateOrdered.getMonth() + "-" + dateOrdered.getYear();
    }

    public void addMedia(Media item){
        if (qtyOrdered == MAX_NUMBERS_ORDER)
        {
            System.out.println("The Order is full!");
        }
        else
        {
            itemsOrdered.add(item);
            qtyOrdered++;
            System.out.println("Add Successully!");
        }
    }

    public void addMedia(ArrayList<Media> itemList)
    {
        if(qtyOrdered + itemList.size() > MAX_NUMBERS_ORDER)
        {
            itemsOrdered.addAll(itemList);
                		System.out.println("Add sucessfully");
                	} else {
                		System.out.println("Order is full");
                	}
                }

    public void addMedia( Media item1, Media item2, Media item3)
    {   

        if(this.qtyOrdered + 3 <= MAX_NUMBERS_ORDER)
        {
            this.addMedia(item1);
            this.addMedia(item2);
            this.addMedia(item3);
        }
    }

    

    public void removeMedia(Media item) {
    	if(qtyOrdered<= 0) {
    		System.out.println("The shoping cart is empty");
    	} else {
    		for( int i = 0 ; i < qtyOrdered ; i++) {
    			if(itemsOrdered.get(i) == item) {
    				itemsOrdered.remove(i);
    			}
    		}
    	}
    }
    
    public boolean removeMedia(int itemID) {
        for (var item : itemsOrdered) {
            if (item.getID() == itemID) {
                itemsOrdered.remove(item);
                return true;
            }
        }
        return false;
    }
    

        public void printItem() {
		for (var item : itemsOrdered) 
        {
			System.out.println(item.getID()+ " - " + item.getTitle()+ " - " + item.getCategory() +" - "+ item.getCost());
		}
	}

        public Media getALuckyItem() {
	    int index = new Random().nextInt(itemsOrdered.size());
	    return itemsOrdered.get(index);
	}


    // public float totalCost() {
    //     float totalCost = 0.0f;
    //     for ( int i = 0 ; i < qtyOrdered ; i++)
    //     {
    //         totalCost += itemOrdered[i].getCost();
    //     }
    //     return totalCost;
    // }


    public float totalCost() {
        		float total = 0.0f;
        		Media mediaItem;
        		java.util.Iterator ite = itemsOrdered.iterator();
        		while(ite.hasNext()) {
        			mediaItem = (Media) (ite.next());
        			total += mediaItem.getCost();
        		}
        		return total;
        	}

    



    
    }
        