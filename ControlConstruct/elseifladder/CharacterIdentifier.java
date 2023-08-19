package com.kn.elseifladder;

import java.util.Scanner;

public class CharacterIdentifier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("Lowercase vowel");
            } else {
                System.out.println("Lowercase consonant");
            }
        } else if (c >= 'A' && c <= 'Z') {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("Uppercase vowel");
            } else {
                System.out.println("Uppercase consonant");
            }
        } else if (c >= '0' && c <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
        sc.close();
    }

}
