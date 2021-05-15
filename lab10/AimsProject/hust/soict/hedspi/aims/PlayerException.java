package hust.soict.hedspi.aims.utils;

public class PlayerException {
    private String info1;
	
	public PlayerException(String info1) {
		this.info1 = info1;
	}
	public String getInfo() {
		return "The error is  " + info1 ;
	}
	public void setInfo(String info1) {
		this.info1 = info1;
	}
	public static void main(String[] args) {
		
	}

    
}
