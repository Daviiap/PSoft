package main;

import products.Batch;
import products.Product;

public class Main {
	public static void main(String[] args) {
		Product p = new Product("39ed1ccc-353f-43bb-98dd-3da2ae012cc3", "Cebola Roxa", "Horta do seu Zé");
		Batch b = new Batch("70cd9489-3ce3-4f72-af09-fe00b6a8909d", p, 100);	
		
		System.out.println(p.toString());
		System.out.println(b.toString());
		
		System.out.println(b.getQuantity());
		System.out.println(b.decrementQuantity());
		System.out.println(b.decrementQuantity(37));
		System.out.println(b.decrementQuantity(100));
		System.out.println(b.decrementQuantity(61));
		System.out.println(b.decrementQuantity());
		System.out.println(b.decrementQuantity());
	}
}
