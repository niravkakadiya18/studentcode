package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Vote Eligible");
        } else {
            System.out.println("Not Eligible to Vote");
        }
        sc.close();
    }
}
