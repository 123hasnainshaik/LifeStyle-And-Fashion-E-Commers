package EcomProject;

import java.util.Scanner;

class Fashion {
void Fashion() {
	System.out.println("Select the catogries of Fashion");
	System.out.println("Dress");
	System.out.println("shoes");
}
private Scanner sc2=new Scanner(System.in);
void askForFashionCatogries() {
	Dress d=new Dress();
	Shoes s=new Shoes();
	System.out.println("Press 1 for dress,Press 2 for shoes,press 3 for Exit");
	int choice1=sc2.nextInt();
	if(choice1==1) {
		d.Dress();
	}
	else if(choice1==2){
		s.shoes();
	}
	else if(choice1==3) {
		System.exit(0);
	}
}
}
class Dress{
	male m=new male();
	female f=new female();
	void Dress() {
		Scanner sc3= new Scanner(System.in);
		System.out.println("Select Gender:(M|F)");
		char gender=sc3.next().charAt(0);
		if(gender=='M') {
			m.display();
			m.AskForAddToCart();
		}
		else if(gender=='F') {
			f.display();
			f.AskForAddToCart();
		}
		else {
			System.out.println("invalid");
		}
	}
}
class Shoes{
	male1 m1=new male1();
	female1 f1=new female1();
	void shoes() {
		Scanner sc3= new Scanner(System.in);
		System.out.println("Select Gender:(M|F)");
		char gender=sc3.next().charAt(0);
		if(gender=='M') {
			m1.display();
			m1.AskForAddToCart();
		}
		else if(gender=='F') {
			f1.display();
			f1.AskForAddToCart();
		}
		else {
			System.out.println("invalid");
		}
	}
}
