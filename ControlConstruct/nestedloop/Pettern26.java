package com.kn.nestedloop;

public class Pettern26 {

	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 5; i++) {
			int r = i;
			for (int j = 1; i >= j; j++) {
				if (i == j || j == 1) {
					System.out.print(n);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
