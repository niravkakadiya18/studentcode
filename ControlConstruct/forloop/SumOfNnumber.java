package com.kn.forloop;

import java.util.Scanner;

public class SumOfNnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:-");
		int num = sc.nextInt();
		int num1 = calculateSum(num);
		System.out.println(num1);

		sc.close();
	}

	static int calculateSum(int num) {
		int sum = 0;

		for (int i = 1; num >= i; i++) {
			sum = i + sum;
		}
		return sum;
	}
}
