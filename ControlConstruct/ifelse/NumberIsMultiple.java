package com.kn.ifelse;

import java.util.Scanner;

public class NumberIsMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 10 == 0) {
            System.out.println("The number is a multiple of 10");
        } else {
            System.out.println("number is not a multiple of 10");
        }
        sc.close();
    }
}
