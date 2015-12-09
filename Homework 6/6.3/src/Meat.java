
public class Meat extends Stock {
	
	boolean redMeat;
	boolean baked;
	
	public Meat() {
		super();
		this.redMeat = false;
		this.baked = false;
	}
	
	public Meat(double price, boolean available, boolean redMeat, boolean baked) {
		super(price, available);
		setRedMeat();
		setBaked();
	}
	
	public void setRedMeat() {
		if(true) {
			this.redMeat = true;
		}
	}
	
	public boolean getRedMeat() {
		return redMeat;
	}
	
	public void setBaked() {
		if(true) {
			this.baked = true;
		}
	}
	
	public boolean getBaked() {
		return baked;
	}
}
