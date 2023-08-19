package com.kn.nestedloop;

public class Pattern32 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j <= 5 || j - i >= 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		int k;
		for (int i = 1; i <= 5; i++) {
			k = 1;
			for (int j = 1; j <= 9; j++) {
				if (j >= 6 - i && j <= i + 4 && k == 1) {
					System.out.print("*");
					k=0;
				} else {
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println("");
		}
	}
}

