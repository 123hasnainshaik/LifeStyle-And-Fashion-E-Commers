package EcomProject;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) throws IOException {
	Catogries c=new Catogries();
	Scanner sc=new Scanner(System.in);
	System.out.println("***********WELCOME TO LIFE AND FASHION*************");
	System.out.println();
	System.err.println("Enter the email:");
	String email=sc.nextLine();
	System.err.println("enter the password:");
	String psw=sc.nextLine();
	System.err.println("Select Below catogries");
	c.askForCatogries();
}
	}

	
	
