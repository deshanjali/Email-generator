
package emailApp;

import java.util.Scanner;

//CREATING EMAIL ACCOUNTS FOR NEW HIRES

public class EmailApp {
  
	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
		System.out.println("enter first name: ");
		String first=scn.next();
		System.out.println("enter last name: ");
		String last =scn.next();
	    Email EE=new Email(first,last);
	    System.out.println(EE.showInfo());
	    scn.close();
}

}