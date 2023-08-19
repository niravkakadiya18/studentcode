package com.kn.whileloop;

import java.util.Scanner;

public class LargeNum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:-");
		int num = sc.nextInt();

		int num1 = largestDigit(num);
		System.out.println("Largest number " + num1);
		sc.close();
	}

	static int largestDigit(int num) {
		int largestDigit = 0;

		while (num > 0) {
			int digit = num % 10;
			if (digit > largestDigit) {
				largestDigit = digit;
			}
			num /= 10;
		}

		return largestDigit;

	}

}
