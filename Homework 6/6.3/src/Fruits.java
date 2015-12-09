
public class Fruits extends Stock {
	
	String taste;
	String season;
	
	public Fruits() {
		super();
		this.taste = "";
		this.season = "";
	}
	
	public Fruits(double price, boolean available, String taste, String season) {
		super(price, available);
		setTaste(taste);
		setSeason(season);
	}
	
	public void setTaste(String taste) {
		if(taste != "" && taste != null) {
			this.taste = taste;
		}
	}
	
	public String getTaste() {
		return taste;
	}
	
	public void setSeason(String season) {
		if(season != null && season != "") {
			this.season = season;
		}
	}
	
	public String getSeason() {
		return season;
	}
}
