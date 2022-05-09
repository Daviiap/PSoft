package products;

public class Batch {
	private String ID;
	private Product product;
	private int quantity;

	public Batch(String ID, Product product, int quantity) {
		this.ID = ID;
		this.product = product;
		this.quantity = quantity;
	}

	public String getID() {
		return this.ID;
	}

	public Product getProduct() {
		return this.product;
	}

	public int getQuantity() {
		return this.quantity;
	}
	
	public int decrementQuantity(int quantityToDecrement) {
		if (this.quantity >= quantityToDecrement) {
			this.quantity -= quantityToDecrement;
		}
		int newQuantity = this.quantity;
		return newQuantity;
	}

	public int decrementQuantity() {
		int newQuantity = 0;
		if (this.quantity > 0) {
			newQuantity = --this.quantity;
		}
		return newQuantity;
	}

	@Override
	public String toString() {
		return "Batch [ID=" + ID + ", product=" + product.toString() + ", quantity=" + quantity + "]";
	}
}
