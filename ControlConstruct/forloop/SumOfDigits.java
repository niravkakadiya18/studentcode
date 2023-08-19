package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();

		int num1 = sumOfDigits(num);
		System.out.println("Sum of digits: " + num1);

		sc.close();
	}

	static int sumOfDigits(int num) {
		int digitSum = 0, r;

		for (int i = 1; num > 0; i++) {
			r = num % 10;
			digitSum += r;
			num = num / 10;
		}
		return digitSum;
	}
}
