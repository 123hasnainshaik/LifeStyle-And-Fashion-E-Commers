package EcomProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class male {
	Catogries c=new Catogries();
private ArrayList<Product>products;
private Cart cart;

public male() {
	this.products=new ArrayList<>();
	this.cart=new Cart();
	this.products.add(new Product("T-shirt -nike",2000));
	this.products.add(new Product("Full-shirt -livis",2000));
	this.products.add(new Product("jeans -zodio",2000));
	
}
void display() {
	for(int i=0;i<products.size();i++) {
		Product product=products.get(i);
		System.out.println(product.getName() +"----"+product.getPrize() );
		
	}
}
void AskForAddToCart() {
	Scanner sc4=new Scanner(System.in);
	System.out.println("Would u like to add any Product to Your Cart?");
	System.out.println("Press 1 for T-shirt,Press 2 For full shirt,press 3 for Jeans,Press 4 for exit");
	int choice4=sc4.nextInt();
	
	if(choice4==1) {
		Product p=products.get(0);
		cart.AddProduct(p);
		System.out.println("Added"+p.getName()+"to Cart");
		continueShopping(cart,this);
	}
	else if(choice4==2) {
		Product p=products.get(1);
		cart.AddProduct(p);
		System.out.println("Added"+p.getName()+"to Cart");
		continueShopping(cart,this);
	}
	else if(choice4==3) {
		Product p=products.get(2);
		cart.AddProduct(p);
		System.out.println("Added"+p.getName()+"to Cart");
		continueShopping(cart,this);
	}
	else if(choice4==4) {
		System.out.println("exit");
	}
}
private static void continueShopping(Cart cart, male m) {
	BuyNow bn=new BuyNow();
    Scanner scan1 = new Scanner(System.in);
    System.err.println("Do you want to continue shopping(yes/no)");
    String choice4 = scan1.next();
    if (choice4.equalsIgnoreCase("yes")) {
    	m.display();
        m.AskForAddToCart();
    } else {
        bn.buynow(cart);
    }
    }
}
class male1 {
	Catogries c=new Catogries();
private ArrayList<Product>products;
private Cart cart;

public male1() {
	this.products=new ArrayList<>();
	this.cart=new Cart();
	this.products.add(new Product("Formals shoes-nike",2000));
	this.products.add(new Product("boots shoes-Woodland",2000));
	
}
void display() {
	for(int i=0;i<products.size();i++) {
		Product product=products.get(i);
		
		System.out.println(product.getName() +"----"+product.getPrize() );
		
	}
}
void AskForAddToCart() {
	Scanner sc4=new Scanner(System.in);
	System.out.println("Would u like to add any Product to Your Cart?");
	System.out.println("Press 1 for Formals shoes-nike ,Press 2 boots shoes-Woodland,,Press 3 for exit");
	int choice4=sc4.nextInt();
	if(choice4==1) {
		Product p=products.get(0);
		cart.AddProduct(p);
		System.out.println("Added"+p.getName()+"to Cart");
		continueShopping(cart,this);
	}
	else if(choice4==2) {
		Product p=products.get(1);
		cart.AddProduct(p);
		System.out.println("Added"+p.getName()+"to Cart");
		continueShopping(cart,this);
	}
	else if(choice4==3) {
		System.out.println("exit");
	}
	
}

private static void continueShopping(Cart cart, male1 m1) {
	BuyNow bn=new BuyNow();
    Scanner scan1 = new Scanner(System.in);
    System.err.println("Do you want to continue shopping(yes/no)");
    String choice4 = scan1.next();
    if (choice4.equalsIgnoreCase("yes")) {
    	m1.display();
        m1.AskForAddToCart();
        m1.c.askForCatogries();
    } else {
       bn.buynow(cart);
    }
    }
}
