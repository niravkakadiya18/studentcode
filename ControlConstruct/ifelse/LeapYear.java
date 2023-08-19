package com.kn.ifelse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year:");
		int year = sc.nextInt();

		boolean Year = isLeapYear(year);
		if (Year) {

			System.out.println("this is leap year");
			if (year % 100 == 0) {
				if (year % 400 == 0) {
				} else {
					System.out.println("this year is not leap year");
				}
				sc.close();
			}
		}
	}

	static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

}