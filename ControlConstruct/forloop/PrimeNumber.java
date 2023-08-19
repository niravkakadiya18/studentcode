package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:-");
		int num = sc.nextInt();

		printPrimes(num);
		sc.close();
	}

	static void printPrimes(int num) {
		for (int j = 2; j <= num; j++) {
			int count = 0;

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(j);
			} 
		}

	}
}
