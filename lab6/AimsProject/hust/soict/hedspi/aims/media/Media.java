package hust.soict.hedspi.aims.media;

public class Media {
	protected int ID;
	protected String title;
	protected String category;
	protected float cost;
	
	public Media() {
	}
		
	public Media(String title) {
		super();
		this.title = title;
	}

	public Media(int ID, String title, String category, float cost) {
		super();
		this.ID = ID;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
