package com.kn.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		boolean num1 = isPalindrome(num);
		System.out.println(num1);

		sc.close();
	}

	static boolean isPalindrome(int num) {
		int r, p = 0, i;
		i = num;

		for (; num > 0;) {
			r = num % 10;
			p = (p * 10) + r;
			num = num / 10;
		}
		if (i == p) {
			System.out.println("palidrome number");
			return true;
		} else {
			System.out.println("not palidrome number");

		}
		return false;
	}

}
