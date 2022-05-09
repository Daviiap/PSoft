package products;

public class Product {
	private String ID;
	private String name;
	private String manufacturer;
	
	public Product(String ID, String name, String manufacturer) {
		this.ID = ID;
		this.name = name;
		this.manufacturer = manufacturer;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
}
