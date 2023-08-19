package com.kn.forloop;

import java.util.Scanner;

public class PowerNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two value:-");
		int base = sc.nextInt();
		int exponent = sc.nextInt();

		int power = calculatePower(base, exponent);
		System.out.println(power);
		sc.close();
	}

	static int calculatePower(int base, int exponent) {
		int power = 1;
		for (int i = 1; i <= exponent; i++) {
			power = power * base;
		}
		return power;
	}
}