package com.kn.nestedloop;

public class Pettern37 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((i >= j && i + j <= 10) || (i <= j && i + j >= 10)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}
	}
}
