package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        if (character >= 'A' && character <= 'Z') {
            System.out.println("Capital Letter");
        } else {
            System.out.println("Not a Capital Letter");
        }
        sc.close();
    }
}
