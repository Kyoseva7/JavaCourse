
public class Stock {
	
	double price;
	boolean available;
	
	public Stock() {
		this.price = 0;
		this.available = false;		
	}
	
	public Stock(double price, boolean available) {
		super();
	}
	
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setAvailable(boolean available) {
		if(available = true) {
			this.available = true;
		}
	}
	
	public boolean getAvailable() {
		return available;
	}
}

