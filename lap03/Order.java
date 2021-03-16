public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public Order() {
        this.qtyOrdered = 0;
    }

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc d){
        if (this.qtyOrdered < this.MAX_NUMBER_ORDERED)
        {
            this.itemsOrdered[this.qtyOrdered] = d;
            this.qtyOrdered += 1;
            System.out.println("The disc has been added");
        }
        else
            System.out.println("The order is almost full");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < this.qtyOrdered; ++i)
            if (this.itemsOrdered[i].getTitle() == disc.getTitle())
            {
                for (int j = i; j < this.qtyOrdered - 1; ++j)
                    this.itemsOrdered[j] = this.itemsOrdered[j+1];
                this.qtyOrdered -= 1;
                break;
            }
    }

    public float totalCost(){
        Float cost = 0.0f;
        for (int i = 0; i < this.qtyOrdered; ++i)
            cost += this.itemsOrdered[i].getCost();
        return cost;
    }

    
    
}
