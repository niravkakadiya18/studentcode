package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 58) {
            System.out.println("You are eligible for a senior citizen discount");
        } else {
            System.out.println("You are not eligible for a senior citizen discount");
        }
        sc.close();
    }
}
