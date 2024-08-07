package EcomProject;

import java.util.ArrayList;
import java.util.Scanner;

class Groceries {
	private ArrayList<Product>products;
	private Cart cart;
	public Groceries() {
		this.products=new ArrayList<Product>();
		this.cart= new Cart();
		this.products.add(new Product("Wheat--Ashirwad",500));
		this.products.add(new Product("Rice--Bullet", 1800));
		this.products.add(new Product("Oil", 5000));
		this.products.add(new Product("Sugar", 499));
	}
	void display() {
		for(int i=0;i<products.size();i++) {
			Product product=products.get(i);
			System.out.println(product.getName()+"------->"+product.getPrize());
		}
	}
	void askForAddToCart() {
		Scanner scan11=new Scanner(System.in);
		System.out.println("would to add any products to cart?");
		System.out.println("Press 1 for Wheat,Press 2 for rice,Press 3 for Oil,Press 4 for Sugar,Press 5 for exit");
		int choice11=scan11.nextInt();
		
		if(choice11==1) {
			Product p=products.get(0);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to cart");
			continueShoping(cart,this);
		}
		else if(choice11==2) {
			Product p=products.get(1);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to cart");
			continueShoping(cart,this);
		}
		else if(choice11==3) {
			Product p=products.get(2);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to cart");
			continueShoping(cart,this);
		}
		else if(choice11==4) {
			Product p=products.get(3);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to cart");
			continueShoping(cart,this);
		}
		else {
			System.exit(0);
		}
	}
	private static void continueShoping(Cart cart,Groceries g) {
		BuyNow bn=new BuyNow();
		Scanner scan12=new Scanner(System.in);
		System.out.println("Do you want to continue shopping:(yes/no)");
		String choice12=scan12.next();
		
		if(choice12.equalsIgnoreCase("yes")) {
			g.display();
			g.askForAddToCart();
		}
		else if(choice12.equals("no")) {
			bn.buynow(cart);
		}
		
	}
}
