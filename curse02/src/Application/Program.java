package Application;

import Entities.OrderItem;
import Entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Product p = new Product("tv", 1000.0);
		
		OrderItem oi1 = new OrderItem(1, 1000.0, p);
	
		System.out.println(oi1.getProduct().getName());
	}

}
