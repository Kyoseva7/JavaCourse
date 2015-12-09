
public class Vegetables extends Stock {
	
	String colour;
	String shape;
	
	public Vegetables() {
		super();
		this.colour = "";
		this.shape = "";
	}
	
	public Vegetables(double price, boolean available, String colour, String shape) {
		super(price, available);
		setColour(colour);
		setShape(shape);
	}
	
	public void setColour(String colour) {
		if(colour != "" && colour != null) {
			this.colour = colour;
		}
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setShape(String shape) {
		if(shape != "" && shape != null) {
			this.shape = shape;
		}
	}
	
	public String getShape() {
		return shape;
	}
}
