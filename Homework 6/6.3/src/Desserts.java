
public class Desserts extends Stock {
	
	private boolean saulty;
	private boolean cake;
	
	public Desserts() {
		super();
		saulty = false;
		cake = false;
	}
	
	public Desserts(double price, boolean available, boolean saulty, boolean cake) {
		super(price, available);
		setSaulty();
		setCake();
	}
	
	public void setSaulty() {
		if(true) {
			this.saulty = true;
		}
	}
	
	public boolean getSaulty() {
		return saulty;
	}
	
	public void setCake() {
		if(true) {
			this.cake = true;
		}
	}
	
	public boolean getCake() {
		return cake;
	}
}
