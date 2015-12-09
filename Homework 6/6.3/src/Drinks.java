
public class Drinks extends Stock {

	boolean alcohol;
	String drinkFrom;
	
	public Drinks() {
		super();
		this.alcohol = false;
		this.drinkFrom = "";
	}
	
	public Drinks(double price, boolean available, boolean alcohol, String drinkFrom) {
		super(price, available);
		setAlcohol();
		setDrinkFrom(drinkFrom);
	}
	
	public void setAlcohol() {
		if(true) {
			this.alcohol = true;
		}
	}
	
	public boolean getAlcohol() {
		return alcohol;
	}
	
	public void setDrinkFrom(String drinkFrom) {
		if(drinkFrom != "" && drinkFrom != null) {
			this.drinkFrom = drinkFrom;
		}
	}
	
	public String drinkFrom(String drinkFrom) {
		return drinkFrom;
	}
}
