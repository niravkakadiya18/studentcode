package oops;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//boolean a , b ;
		System.out.println("eser! please enter the boolean value:");
		//System.out.println("True or False");
		//boolean a= scan.nextBoolean();
		boolean b = scan.nextBoolean();
		System.out.println("output:" + b);
		
		scan.close();
	}
}
