package com.kn.forloop;

import java.util.Scanner;

public class ReverseNum10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();

		reverseNumber(num);

		sc.close();
	}

	static void reverseNumber(int num) {
		int r = 0;
		for (; num > 0;) {
			r = num % 10;
			System.out.print(r);
			num /= 10;
		}
	}
}
