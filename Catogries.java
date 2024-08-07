package EcomProject;

import java.util.Scanner;

class Catogries {
	private Scanner sc=new Scanner(System.in);
	Fashion f=new Fashion(); 
	ElectronicDevices ed=new ElectronicDevices();
	Groceries g=new Groceries();
	void askForCatogries() {
		while(true){
			System.out.println("Fashion");
			System.out.println("Electronic devices");
			System.out.println("Groceries");
			System.out.println("Choose the catogries ,Press 1 for Fashion,Press 2 for Electronic devices,Press 3 for Goceries ,Press 4 for exit");
			int choice = sc.nextInt();
			if(choice==1) {
				f.Fashion();
				f.askForFashionCatogries();
			}
			else if(choice==2){
				ed.display();
				ed.askForAddToCart();
			}
			else if(choice==3) {
				g.display();
				g.askForAddToCart();
			}
			else if(choice==4) {
				System.err.println("Exiting");
				return;
			}
			System.out.println("Select if u again want to take anythings");
		}
	}

}
