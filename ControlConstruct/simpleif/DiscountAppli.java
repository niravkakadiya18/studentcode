package com.kn.simpleif;

import java.util.Scanner;

public class DiscountAppli {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("your bill amount is:$");
		int a = sc.nextInt();
		boolean flag = isDiscountApplicable(a);

		if (flag) {
			System.out.println("Discount applicable");
		} else {
			System.out.println("not applicable");
		}
		sc.close();
	}

	static boolean isDiscountApplicable(int a) {
		if (a > 100) {
			return true;
		} else {
			return false;
		}
	}
}
