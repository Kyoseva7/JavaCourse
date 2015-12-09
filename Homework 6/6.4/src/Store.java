
public class Store {
	
	private String name;
	private String address;
	private int productsIndex = 0;
	private Stock[] products = new Stock[5];
	
	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void addProduct(Stock product) {
		if(productsIndex < 10) {
			products[productsIndex++] = product;
		}
	}
	
	public void setExhausted(Stock product) {
		for (Stock p : products) {
			if (p.equals(product)) {
				p.setAvailable(false);
				return;
			}
		}
	}
}
