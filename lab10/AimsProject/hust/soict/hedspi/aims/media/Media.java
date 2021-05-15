package hust.soict.hedspi.aims.media;

public abstract  class   Media {
	private static final String Objects = null;
	static int ID;
	protected static String title;
	protected static String category;
	protected static float cost;
	private String objects2;
	private String obj;
	public Media() 
	{
	}
		
	// public Media(String title) 
	// {
	// 	super();
	// 	this.title = title;
	// }

	public Media(int ID, String title, String category, float cost) 
	{
		super();
		this.ID = ID;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
    
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public void show(){

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
        final Media other = (Media) obj;
        return this.ID == other.ID;
    }

	public int hashCode() {
        int h = 3;
        h = 70 * h + this.ID;
        objects2 = Objects;
		h = 70 * h + objects2.hashCode();
        h = 70 * h + Objects.hashCode();
        h = 70 * h + Float.floatToIntBits(this.cost);
        return h;
    }

	
	
}
