package EcomProject;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class ElectronicDevices {
    private ArrayList<Product> products;
    private Cart cart;

    public ElectronicDevices() {
        this.products = new ArrayList<>();
        this.cart = new Cart();
        this.products.add(new Product("Car Mercedes", 2000000));
        this.products.add(new Product("Computers", 200000));
    }

    void display() {
        for (int i=0;i<products.size();i++) {
        	Product product=products.get(i);
            System.out.println(product.getName() + "----" + product.getPrize());
        }
    }

    void askForAddToCart() {
        Scanner sc5 = new Scanner(System.in);
            System.out.println("Would you like to add any products to cart?");
            System.out.println("Press 1 for Cars-Mercedes, Press 2 for Computers, Press 3 to Exit");
            int choice5 = sc5.nextInt();
            if (choice5 == 1) {
                Product p = products.get(0);
                cart.AddProduct(p);
                System.out.println("Added " + p.getName() + " to Cart");
                continueShopping(cart, this);
            } else if (choice5 == 2) {
                Product p = products.get(1);
                cart.AddProduct(p);
                System.out.println("Added " + p.getName() + " to Cart");
                continueShopping(cart, this);
            } else if (choice5 == 3) {
                System.out.println("Exit");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

    private static void continueShopping(Cart cart, ElectronicDevices ed) {
    	BuyNow bn=new BuyNow();
        Scanner scan7 = new Scanner(System.in);
        System.err.println("Do you want to continue shopping? (yes/no)");
        String choice4 = scan7.next();
        if (choice4.equalsIgnoreCase("yes")) {
            ed.display();
            ed.askForAddToCart();
        } 
        else {
            bn.buynow(cart);
        }
        }
    }