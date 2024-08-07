package EcomProject;

import java.util.Date;
import java.util.Scanner;

class BuyNow {
	public static void buynow(Cart cart) {
		Scanner scan=new Scanner(System.in);
		System.out.println("do u want to buy now?(yes/no)");
		String choice =scan.next();
		if (choice.equalsIgnoreCase("yes")) {
	        createbill(cart);
	    } else if (choice.equalsIgnoreCase("no")) {
	        System.out.println("Thank you for shopping:");
	        System.exit(0);
	    } else {
	        System.err.println("Invalid");
	    }
	}
	private static void createbill(Cart cart) {
		Date date=new Date();
		System.out.println("bill created on:"+date);
	    System.out.println("products in cart");
	    cart.display();
	    System.out.println("Total: $" + cart.calculateTotal());
	    System.out.println("ordered sucessfully......");
	    System.out.println("Thank you for shopping with us!");
	}
}
