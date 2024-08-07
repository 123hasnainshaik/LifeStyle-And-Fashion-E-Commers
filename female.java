package EcomProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class female {
	Catogries c=new Catogries();
	private ArrayList<Product>products;
	private Cart cart;
	public female() {
		this.products=new ArrayList<>();
		this.cart=new Cart();
		this.products.add(new Product("Saree -Sumangali",3000));
		this.products.add(new Product("western -life and style",2000));
		this.products.add(new Product("jeans -zodio",1000));
		
	}
	void display() {
		for(int i=0;i<products.size();i++) {
			Product product=products.get(i);
			System.out.println(product.getName() +"----"+product.getPrize() );
			
		}
	}
	void AskForAddToCart(){
		while(true) {
			Scanner sc5=new Scanner(System.in);
		System.out.println("would you like to add any products to cart?");
		System.out.println("Press 1 for Saree Dress,Press 2 for Western Dress,Press 3 for jeans ,Press 4 for Exit");
		int choice5=sc5.nextInt();
		if(choice5==1) {
			Product p=products.get(0);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to Cart");
			continueShopping(cart,this);
		}
		else if(choice5==2) {
			Product p=products.get(1);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to Cart");
			continueShopping(cart,this);
		}
		else if(choice5==3) {
			Product p=products.get(2);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to Cart");
			continueShopping(cart,this);
		}
		else if(choice5==4) {
			System.out.println("exit");
			break;
		}
	}
	}
	private static void continueShopping(Cart cart, female f) {
		BuyNow bn=new BuyNow();
	    Scanner scan1 = new Scanner(System.in);
	    System.err.println("Do you want to continue shopping(yes/no)");
	    String choice4 = scan1.next();
	    if (choice4.equalsIgnoreCase("yes")) {
	    	f.display();
	        f.AskForAddToCart();
	        f.c.askForCatogries();
	        
	    } else {
	        bn.buynow(cart);
	    }
	    }
	}
class female1 {
	Catogries c=new Catogries();
	private ArrayList<Product>products;
	private Cart cart;
	public female1() {
		this.products=new ArrayList<>();
		this.cart=new Cart();
		this.products.add(new Product("ANKLE BOOT -BATA",3000));
		this.products.add(new Product("SLIDE SANDLES -life and style",2000));
		
	}
	void display() {
		for(int i=0;i<products.size();i++) {
			Product product=products.get(i);
			System.out.println(product.getName() +"----"+product.getPrize() );
			
		}
	}
	void AskForAddToCart(){
		while(true) {
			Scanner sc5=new Scanner(System.in);
		System.out.println("would you like to add any products to cart?");
		System.out.println("Press 1 for Saree Dress,Press 2 for Western Dress,Press 3 for Exit");
		int choice5=sc5.nextInt();
		if(choice5==1) {
			Product p=products.get(0);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to Cart");
			continueShopping(cart,this);
		}
		else if(choice5==2) {
			Product p=products.get(1);
			cart.AddProduct(p);
			System.out.println("Added"+p.getName()+"to Cart");
			continueShopping(cart,this);
		}
		else if(choice5==3) {
			System.out.println("exit");
		}
	}
}
	private static void continueShopping(Cart cart, female1 f1) {
		BuyNow bn=new BuyNow();
	    Scanner scan1 = new Scanner(System.in);
	    System.err.println("Do you want to continue shopping(yes/no)");
	    String choice4 = scan1.next();
	    if (choice4.equalsIgnoreCase("yes")) {
	    	f1.display();
	        f1.AskForAddToCart();
	        f1.c.askForCatogries();
	    } else {
	        bn.buynow(cart);
	    }
	    }
	}
