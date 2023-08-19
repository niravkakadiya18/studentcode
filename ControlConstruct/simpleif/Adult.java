package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        if (age > 21) {
	            System.out.println("Adult");
	        } else {
	            System.out.println("Not an adult");
	        }
	        scanner.close();
	    }
}
