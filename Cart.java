package EcomProject;

import java.util.ArrayList;

class Cart {
private ArrayList<Product>CartProducts;
private ArrayList<Double>CartPrizes;
public Cart() {
	this.CartProducts=new ArrayList<Product>();
	this.CartPrizes=new ArrayList<Double>();
}
void AddProduct(Product products) {
	this.CartProducts.add(products);
	this.CartPrizes.add(products.getPrize());
}
public void display() {
	for(int i=0;i<CartProducts.size();i++) {
		Product product=CartProducts.get(i);
		System.out.println((i+1)+" --"+product.getName() +"----"+product.getPrize() );
		
	}
}

public double calculateTotal() {
    double total = 0;
    for (double prize : CartPrizes) {
        total += prize;
    }
    return total;
}
}
